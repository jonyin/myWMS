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

package com.mywms.ui;

import java.util.Calendar;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.mywms.ui.jqgrid.JQGridColumn;
import com.mywms.ui.jqgrid.JQGridModel;

/**
 * @author Rob Winch
 */
public class Message extends JQGridModel {

	@JQGridColumn(name="id", index="id", width=55, order=1)
	private Long id;

	@NotEmpty(message = "Message is required.")
	@JQGridColumn(name="text", index="text", width=90, order=2)
	private String text;

	@NotEmpty(message = "Summary is required.")
	@JQGridColumn(name="summary", index="summary", width=100, align="right", order=3)
	private String summary;

	@JQGridColumn(width=80, order=4)
	private Calendar created = Calendar.getInstance();

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@DateTimeFormat(pattern="dd-MM-yyyy")
    @JsonSerialize(using=CalendarSerializer.class)
	public Calendar getCreated() {
		return this.created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
