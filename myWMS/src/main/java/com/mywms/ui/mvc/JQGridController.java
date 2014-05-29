/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.mywms.ui.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mywms.ui.JQGridVO;
import com.mywms.ui.Message;
import com.mywms.ui.MessageRepository;
import com.mywms.ui.jqgrid.ColModel;
import com.mywms.ui.jqgrid.JQGrid;

/**
 * @author Rob Winch
 */
@Controller
@RequestMapping("/jqgrid")
public class JQGridController {
	private final MessageRepository messageRepository;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private Validator validator;


	@Autowired
	public JQGridController(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("{id}")
   	public ModelAndView home(@PathVariable("id") String id) {
    	Message message = new Message();
    	JQGrid jqGrid = new JQGrid();
    	jqGrid.setUrl("/jqgrid/list");
    	jqGrid.setDatatype("json");
    	jqGrid.setCaption("JSON Example");;
		jqGrid.setColNames(message.getAllColNames());
		jqGrid.setColModel(message.getAllColModels());
    	String jqGridJson = "";    	
    	jqGrid.setRowNum(10);
    	Integer[] rowList = {10,20,30};
		jqGrid.setRowList(rowList);
		jqGrid.setPager("#pager2");
		jqGrid.setSortname("id");
		jqGrid.setViewrecords(true);
		jqGrid.setSortorder("desc");
		try {
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			jqGridJson = objectMapper.writeValueAsString(jqGrid);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return new ModelAndView("jqgrid/home", "jqGridJson", jqGridJson);
   	}

    @RequestMapping(value="rest", method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(value = "list", method = RequestMethod.GET)
	public @ResponseBody JQGridVO<Message> list(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    	JQGridVO<Message> jqGridVO = new JQGridVO<Message>();
    	Iterable<Message> messages = this.messageRepository.findAll();
    	List<Message> messageList = new ArrayList<Message>();
    	for(Message m:messages) {
    		messageList.add(m);
    	}
		jqGridVO.setRows(messageList);
		jqGridVO.setPage(1);
		jqGridVO.setRecords(messageList.size());
		jqGridVO.setTotal(messageList.size());
		return jqGridVO;
	}
    
//    @RequestMapping(method = RequestMethod.POST)
//	public ModelAndView create(@Valid ModelMap modelMap, BindingResult result,
//			RedirectAttributes redirect) {
//		if (result.hasErrors()) {
//			return new ModelAndView("messages/form", "formErrors", result.getAllErrors());
//		}
//		validator.validate(arg0, arg1)
//		message = this.messageRepository.save(message);
//		redirect.addFlashAttribute("globalMessage", "Successfully created a new message");
//		return new ModelAndView("redirect:messages/{message.id}", "message.id", message.getId());
//	}

	

}
