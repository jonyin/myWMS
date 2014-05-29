package com.mywms.ui.jqgrid;

public class JQGrid {
	//	ajaxGridOptions	object	This option allows to set global ajax settings for the grid when requesting data. Note that with this option it is possible to overwrite all current ajax settings in the grid including the error, complete and beforeSend events.	empty object	Yes
	private Object ajaxGridOptions;
	//	ajaxSelectOptions	object	This option allows to set global ajax settings for the select element when the select is obtained via dataUrl option in editoptions or searchoptions objects	empty object	Yes
	private Object ajaxSelectOptions;
	//	altclass	string	The class that is used for applying different styles to alternate (zebra) rows in the grid. You can construct your own class and replace this value. This option is valid only if the altRows option is set to true	ui-priority-secondary	Yes. Requires reload
	private String altclass;
	//	altRows	boolean	Set a zebra-striped grid (alternate rows have different styles)	 false	 Yes. After reload
	private Boolean altRows;
	//	autoencode	boolean	When set to true encodes (html encode) the incoming (from server) and posted data (from editing modules). For example < will be converted to &lt;.	false	Yes
	private Boolean autoencode;
	//	autowidth	boolean	 When set to true, the grid width is recalculated automatically to the width of the parent element. This is done only initially when the grid is created. In order to resize the grid when the parent element changes width you should apply custom code and use the setGridWidth method for this purpose	false	No
	private Boolean autowidth;
	//	caption	string	Defines the caption for the grid. This caption appears in the caption layer, which is above the header layer (see How It Works). If the string is empty the caption does not appear.	empty string	 No.Method avail.
	private String caption;
	//	cellLayout	integer	This option determines the padding + border width of the cell. Usually this should not be changed, but if custom changes to the td element are made in the grid css file, this will need to be changed. The initial value of 5 means paddingLef(2) + paddingRight (2) + borderLeft (1) = 5	5	No
	private Integer cellLayout;
	//	cellEdit	boolean	Enables (disables) cell editing. See Cell Editing for more details	false	 Yes
	private Boolean cellEdit;
	//	cellsubmit	string	Determines where the contents of the cell are saved. Possible values are remote and clientArray. See Cell Editing for more details.	'remote'	Yes
	private String cellsubmit;
	//	cellurl	string	the url where the cell is to be saved. See Cell Editing for more details	null	Yes
	private String cellurl;
	//	cmTemplate	 object	 Defines a set of properties which override the default values in colModel. For example if you want to make all columns not sortable, then only one propery here can be specified instead of specifying it in all columns in colModel	 null	 No
	private Object cmTemplate;
	//	colModel	array	Array which describes the parameters of the columns.This is the most important part of the grid. For a full description of all valid values see colModel API.	empty array	 No
	private ColModel[] colModel;
	//	colNames	array	An array in which we place the names of the columns. This is the text that appears in the head of the grid (header layer). The names are separated with commas. Note that the number of elements in this array should be equal of the number elements in the colModel array.	empty array[]	No
	private String[] colNames;
	//	data	array	An array that stores the local data passed to the grid. You can directly point to this variable in case you want to load an array data. It can replace the addRowData method which is slow on relative big data	 empty array	 Yes
	private String[] data;
	//	datastr	string	The string of data when datatype parameter is set to xmlstring or jsonstring	null	Yes
	private String datastr;
	//	datatype	string	Defines in what format to expect the data that fills the grid. Valid options are xml (we expect data in xml format), xmlstring (we expect xml data as string), json (we expect data in JSON format), jsonstring (we expect JSON data as a string), local (we expect data defined at client side (array data)), javascript (we expect javascript as data), function (custom defined function for retrieving data), or clientSide to manually load data via the data array. See colModel API and Retrieving Data	xml	 Yes
	private String datatype;
	//	deepempty	boolean	This option should be set to true if an event or a plugin is attached to the table cell. The option uses jQuery empty for the the row and all its children elements. This of course has speed overhead, but prevents memory leaks. This option should be set to true if a sortable rows and/or columns are activated.	false	Yes
	private Boolean deepempty;
	//	deselectAfterSort	boolean	Applicable only when we use datatype : local. Deselects currently selected row(s) when a sort is applied.	true	 Yes
	private Boolean deselectAfterSort;
	//	direction	string	Determines the direction of text in the grid. The default is ltr (Left To Right). When set to rtl (Right To Left) the grid automatically changes the direction of the text. It is important to note that in one page we can have two (or more) grids where the one can have direction ltr while the other can have direction rtl. This option works only in Firefox 3.x versions and Internet Explorer versions >=6. Currently Safari, Google Chrome and Opera do not completely support changing the direction to rtl. The most common problem in Firefox is that the default settings of the browser do not support rtl. In order change this see this HOW TO section in this chapter .	ltr	No
	private String direction;
	//	editurl	string	Defines the url for inline and form editing. May be set to clientArray to manually post data to server, see Inline Editing.	null	Yes
	private String editurl;
	//	emptyrecords	 string	 The string to display when the returned (or the current) number of records in the grid is zero. This option is valid only if viewrecords option is set to true.	see lang file	Yes
	private String emptyrecords;
	//	ExpandColClick	boolean	 When true, the tree grid (see treeGrid) is expanded and/or collapsed when we click anywhere on the text in the expanded column. In this case it is not necessary to click exactly on the icon.	true	No
	private String ExpandColClick;
	//	ExpandColumn	string	 Indicates which column (name from colModel) should be used to expand the tree grid. If not set the first one is used. Valid only when the treeGrid option is set to true.	null	 No
	private String ExpandColumn;
	//	footerrow	boolean	If set to true this will place a footer table with one row below the gird records and above the pager. The number of columns equal those specified in colModel	false	No
	private Boolean footerrow;
	//	forceFit	boolean	If set to true, and a column's width is changed, the adjacent column (to the right) will resize so that the overall grid width is maintained (e.g., reducing the width of column 2 by 30px will increase the size of column 3 by 30px). In this case there is no horizontal scrollbar. Note: This option is not compatible with shrinkToFit option - i.e if shrinkToFit is set to false, forceFit is ignored.	false	No
	private Boolean forceFit;
	//	gridstate	string	 Determines the current state of the grid (i.e. when used with hiddengrid, hidegrid and caption options). Can have either of two states: visible or hidden.	visible	No
	private String gridstate;
	//	gridview	boolean	 In the previous versions of jqGrid including 3.4.X, reading a relatively large data set (number of rows >= 100 ) caused speed problems. The reason for this was that as every cell was inserted into the grid we applied about 5 to 6 jQuery calls to it. Now this problem is resolved; we now insert the entry row at once with a jQuery append. The result is impressive - about 3 to 5 times faster. What will be the result if we insert all the data at once? Yes, this can be done with a help of gridview option (set it to true). The result is a grid that is 5 to 10 times faster. Of course, when this option is set to true we have some limitations. If set to true we can not use treeGrid, subGrid, or the afterInsertRow event. If you do not use these three options in the grid you can set this option to true and enjoy the speed.	false	Yes
	private Boolean gridview;
	//	grouping	boolean	 Enables grouping in grid. Please refer to the Grouping page.	false	Yes
	private Boolean grouping;
	//	headertitles	boolean	 If the option is set to true the title attribute is added to the column headers.	false	No
	private Boolean headertitles;
	//	height	mixed	 The height of the grid. Can be set as number (in this case we mean pixels) or as percentage (only 100% is acceped) or value of auto is acceptable.	150	No.Method avail.
	private String height;
	//	hiddengrid	boolean	 If set to true the grid is initially is hidden. The data is not loaded (no request is sent) and only the caption layer is shown. When the show/hide button is clicked for the first time to show grid, the request is sent to the server, the data is loaded, and grid is shown. From this point we have a regular grid. This option has effect only if the caption property is not empty and the hidegrid property (see below) is set to true.	false	 No
	private Boolean hiddengrid;
	//	hidegrid	boolean	 Enables or disables the show/hide grid button, which appears on the right side of the caption layer (see How It Works). Takes effect only if the caption property is not an empty string.	true	No
	private Boolean hidegrid;
	//	hoverrows	boolean	 When set to false the effect of mouse hovering over the grid data rows is disabled.	true	Yes
	private Boolean hoverrows;
	//	idPrefix	string	When set, this string is added as prefix to the id of the row when it is built.	empty	Yes
	private String idPrefix;
	//	ignoreCase	boolean	By default the local searching is case-sensitive. To make the local search and sorting not case-insensitive set this options to true	false	Yes
	private Boolean ignoreCase;
	//	inlineData	empty object	an array used to add content to the data posted to the server when we are in inline editing.	{}	Yes
	private String[] inlineData;
	//	jsonReader	array	 An array which describes the structure of the expected json data. For a full description and default setting, see Retrieving Data JSON Data		No
	private String[] jsonReader;
	//	lastpage	integer	 Gives the total number of pages returned from the request. If you use a function as datatype, your_grid.setGridParam({lastpage: your_number}) can be used to specify the max pages in the pager.	0	No
	//	lastsort	integer	 Readonly property. Gives the index of last sorted column beginning from 0.	0	No
	//	loadonce	boolean	If this flag is set to true, the grid loads the data from the server only once (using the appropriate datatype). After the first request, the datatype parameter is automatically changed to local and all further manipulations are done on the client side. The functions of the pager (if present) are disabled.	false	No
	//	loadtext	string	 The text which appears when requesting and sorting data. This parameter is located in language file.	Loading…	No
	//	loadui	string	 This option controls what to do when an ajax operation is in progress.
	//	disable - disables the jqGrid progress indicator. This way you can use your own indicator.
	//	enable (default) - shows the text set in the loadtext property (default value is Loading…) in the center of the grid. 
	//	block - displays the text set in the loadtext property and blocks all actions in the grid until the ajax request completes. Note that this disables paging, sorting and all actions on toolbar, if any.	enable	Yes
	//	mtype	string	 Defines the type of request to make (“POST” or “GET”)	GET	Yes
	//	multikey	string	This parameter makes sense only when the multiselect option is set to true. Defines the key which should be pressed when we make multiselection. The possible values are: shiftKey - the user should press Shift Key, altKey - the user should press Alt Key, and ctrlKey - the user should press Ctrl Key.	empty string	Yes
	//	multiboxonly	boolean	 This option works only when the multiselect option is set to true. When multiselect is set to true, clicking anywhere on a row selects that row; when multiboxonly is also set to true, the multiselection is done only when the checkbox is clicked (Yahoo style). Clicking in any other row (suppose the checkbox is not clicked) deselects all rows and selects the current row.	false	Yes
	//	multiselect	boolean	 If this flag is set to true a multi selection of rows is enabled. A new column at left side containing checkboxes is added. Can be used with any datatype option.	false	 No. see HOWTO
	//	multiselectWidth	integer	 Determines the width of the checkbox column created when the multiselect option is enabled.	20	No
	//	multiSort	boolean	If set to true enables the multisorting. The options work if the datatype is local. In case when the data is obtained from the server the sidx parameter contain the order clause. It is a comma separated string in format field1 asc, field2 desc …, fieldN. Note that the last field does not not have asc or desc. It should be obtained from sord parameter 
	//	When the option is true the behavior is a s follow. The first click of the header field sort the field depending on the firstsortoption parameter in colModel or sortorder grid parameter. The next click sort it in reverse order. The third click removes the sorting from this field	false	Yes
	//	page	integer	 Set the initial page number when we make the request.This parameter is passed to the url for use by the server routine retrieving the data.	1	Yes
	//	pager	mixed	 Defines that we want to use a pager bar to navigate through the records. This must be a valid HTML element; in our example we gave the div the id of “pager”, but any name is acceptable. Note that the navigation layer (the “pager” div) can be positioned anywhere you want, determined by your HTML; in our example we specified that the pager will appear after the body layer. The valid settings can be (in the context of our example) pager, #pager, jQuery('#pager'). I recommend to use the second one - #pager. See Pager	empty string. Currently only one pagebar is possible.	No
	private String pager;
	//	pagerpos	string	 Determines the position of the pager in the grid. By default the pager element when created is divided in 3 parts (one part for pager, one part for navigator buttons and one part for record information).	center	No
	//	pgbuttons	boolean	 Determines if the Pager buttons should be shown if pager is available. Also valid only if pager is set correctly. The buttons are placed in the pager bar.	true	No
	//	pginput	boolean	 Determines if the input box, where the user can change the number of the requested page, should be available. The input box appears in the pager bar.	true	No
	//	pgtext	string	Show information about current page status. The first value is the current loaded page. The second value is the total number of pages.	See lang file	Yes
	//	prmNames	array	 The default value of this property is: 
	//	{page:“page”,rows:“rows”, sort:“sidx”, order:“sord”, search:“_search”, nd:“nd”, id:“id”, oper:“oper”, editoper:“edit”, addoper:“add”, deloper:“del”, subgridid:“id”, npage:null, totalrows:“totalrows”} 
	//	This customizes names of the fields sent to the server on a POST request. For example, with this setting, you can change the sort order element from sidx to mysort by setting prmNames: {sort: “mysort”}. The string that will be POST-ed to the server will then be myurl.php?page=1&rows=10&mysort=myindex&sord=asc rather than myurl.php?page=1&rows=10&sidx=myindex&sord=asc 
	//	So the value of the column on which to sort upon can be obtained by looking at $POST['mysort'] in PHP. When some parameter is set to null, it will be not sent to the server. For example if we set prmNames: {nd:null} the nd parameter will not be sent to the server. For npage option see the scroll option. 
	//	These options have the following meaning and default values: 
	//	page: the requested page (default value page) 
	//	rows: the number of rows requested (default value rows) 
	//	sort: the sorting column (default value sidx) 
	//	order: the sort order (default value sord) 
	//	search: the search indicator (default value _search) 
	//	nd: the time passed to the request (for IE browsers not to cache the request) (default value nd) 
	//	id: the name of the id when POST-ing data in editing modules (default value id) 
	//	oper: the operation parameter (default value oper) 
	//	editoper: the name of operation when the data is POST-ed in edit mode (default value edit) 
	//	addoper: the name of operation when the data is posted in add mode (default value add) 
	//	deloper: the name of operation when the data is posted in delete mode (default value del) 
	//	totalrows: the number of the total rows to be obtained from server - see rowTotal (default value totalrows) 
	//	subgridid: the name passed when we click to load data in the subgrid (default value id)	 none	Yes
	//	postData	array	 This array is appended directly to the url. This is an associative array and can be used this way: {name1:value1…}. See API methods for manipulation.	empty array	Yes
	//	reccount	integer	 Readonly property. Determines the exact number of rows in the grid. Do not confuse this with records parameter. Although in many cases they may be equal, there are cases where they are not. For example, if you define rowNum to be 15, but the request to the server returns 20 records, the records parameter will be 20, but the reccount parameter will be 15 (the grid you will have 15 records and not 20).	0	No
	//	recordpos	string	 Determines the position of the record information in the pager. Can be left, center, right.	right	No
	//	records	integer	 Readonly property. Gives the number of records returned as a result of a query to the server.	none	No
	//	recordtext	string	 Text that can be shown in the pager. Also this option is valid if viewrecords option is set to true. This text appears only if the total number of records is greater then zero. In order to show or hide some information the items in {} mean the following: 
	//	{0} - the start position of the records depending on page number and number of requested records 
	//	{1} - the end position 
	//	{2} - total records returned from the server.	 see lang file	Yes
	//	resizeclass	string	 Assigns a class to columns that are resizable so that we can show a resize handle only for ones that are resizable.	empty string	No
	//	rowList	array[]	 An array to construct a select box element in the pager in which we can change the number of the visible rows. When changed during the execution, this parameter replaces the rowNum parameter that is passed to the url. If the array is empty, this element does not appear in the pager. Typically you can set this like [10,20,30]. If the rowNum parameter is set to 30 then the selected value in the select box is 30.	empty arrray	No
	private Integer[] rowList;
	//	rownumbers	boolean	 If this option is set to true, a new column at left of the grid is added. The purpose of this column is to count the number of available rows, beginning from 1. In this case colModel is extended automatically with new element with the name rn. Note: Do not to use the name rn in the colModel.	false	No
	//	rowNum	integer	 Sets how many records we want to view in the grid. This parameter is passed to the url for use by the server routine retrieving the data. Note that if you set this parameter to 10 (i.e. retrieve 10 records) and your server return 15 then only 10 records will be loaded. Set this parameter to -1 (unlimited) to disable this checking.	20	Yes
	private Integer rowNum;
	//	rowTotal	 integer	 When set this parameter can instruct the server to load the total number of rows needed to work on. Note that rowNum determines the total records displayed in the grid, while rowTotal determines the total number of rows on which we can operate. When this parameter is set, we send an additional parameter to the server named totalrows. You can check for this parameter, and if it is available you can replace the rows parameter with this one. Mostly this parameter can be combined with loadonce parameter set to true.	null	 Yes
	//	rownumWidth	integer	 Determines the width of the row number column if rownumbers option is set to true.	25	No
	//	savedRow	array	 This is a readonly property and is used in inline and cell editing modules to store the data, before editing the row or cell. See Cell Editing and Inline Editing.	empty array	No
	//	searchdata	array {}	This property contain the searched data in pair name:value.	empty array{}	Yes
	//	scroll	boolean or 
	//	integer	Creates dynamic scrolling grids. When enabled, the pager elements are disabled and we can use the vertical scrollbar to load data. When set to true the grid will always hold all the items from the start through to the latest point ever visited. 
	//	When scroll is set to an integer value (example 1), the grid will just hold the visible lines. This allow us to load the data in portions whitout caring about memory leaks. In addition to this we have an optional extension to the server protocol: npage (see prmNames array). If you set the npage option in prmNames, then the grid will sometimes request more than one page at a time; if not, it will just perform multiple GET requests.	false	No
	//	scrollOffset	integer	 Determines the width of the vertical scrollbar. Since different browsers interpret this width differently (and it is difficult to calculate it in all browsers) this can be changed.	18	No.Method avail.
	//	scrollTimeout	integer 
	//	(milliseconds)	 This controls the timeout handler when scroll is set to 1.	200	Yes
	//	scrollrows	boolean	 When enabled, selecting a row with setSelection scrolls the grid so that the selected row is visible. This is especially useful when we have a verticall scrolling grid and we use form editing with navigation buttons (next or previous row). On navigating to a hidden row, the grid scrolls so that the selected row becomes visible.	false	Yes
	//	selarrrow	array	 This options is readonly. Gives the currently selected rows when multiselect is set to true. This is a one-dimensional array and the values in the array correspond to the selected id's in the grid.	empty array []	No
	//	selrow	string	 This option is readonly. It contains the id of the last selected row. If you sort or use paging, this options is set to null.	null	No
	//	shrinkToFit	boolean or 
	//	integer	 This option, if set, defines how the the width of the columns of the grid should be re-calculated, taking into consideration the width of the grid. If this value is true, and the width of the columns is also set, then every column is scaled in proportion to its width. For example, if we define two columns with widths 80 and 120 pixels, but want the grid to have a width of 300 pixels, then the columns will stretch to fit the entire grid, and the extra width assigned to them will depend on the width of the columns themselves and the extra width available. The re-calculation is done as follows: the first column gets the width (300(new width)/200(sum of all widths))*80(first column width) = 120 pixels, and the second column gets the width (300(new width)/200(sum of all widths))*120(second column width) = 180 pixels. Now the widths of the columns sum up to 300 pixels, which is the width of the grid. If the value is false and the value in width option is set, then no re-sizing happens whatsoever. So in this example, if shrinkToFit is set to false, column one will have a width of 80 pixels, column two will have a width of 120 pixels and the grid will retain the width of 300 pixels. If the value of shrinkToFit is an integer, the width is calculated according to it. FIXME - The effect of using an integer can be elaborated.	true	No
	//	sortable	boolean	 When set to true, this option allows reordering columns by dragging and dropping them with the mouse. Since this option uses the jQuery UI sortable widget, be sure to load this widget and its related files in the HTML head tag of the page. Also, be sure to select the jQuery UI Addons option under the jQuery UI Addon Methods section while downloading jqGrid if you want to use this facility. Note: The colModel object also has a property called sortable, which specifies if the grid data can be sorted on a particular column or not.	false	No
	//	sortname	string	 The column according to which the data is to be sorted when it is initially loaded from the server (note that you will have to use datatypes xml or json to load remote data). This parameter is appended to the url. If this value is set and the index (name) matches the name from colModel, then an icon indicating that the grid is sorted according to this column is added to the column header. This icon also indicates the sorting order - descending or ascending (see the parameter sortorder). Also see prmNames.	empty string	Yes
	private String sortname;
	//	sortorder	string	The initial sorting order (ascending or descending) when we fetch data from the server using datatypes xml or json. This parameter is appended to the url - see prnNames. The two allowed values are - asc or desc.	asc	Yes
	private String sortorder;
	//	subGrid	boolean	 If set to true this enables using a sub-grid. If the subGrid option is enabled, an additional column at left side is added to the basic grid. This column contains a 'plus' image which indicates that the user can click on it to expand the row. By default all rows are collapsed. See Subgrid	false	No
	//	subGridOptions	 object	 A set of additional options for the subgrid. For more information and default values see Subgrid.	 see Subgrid	 Yes
	//	subGridModel	array-[]	This property, which describes the model of the subgrid, has an effect only if the subGrid property is set to true. It is an array in which we describe the column model for the subgrid data. For more information see Subgrid.	empty array	No
	//	subGridType	mixed	 This option allows loading a subgrid as a service. If not set, the datatype parameter of the parent grid is used.	null	Yes
	//	subGridUrl	string	 This option has effect only if the subGrid option is set to true. This option points to the url from which we get the data for the subgrid. jqGrid adds the id of the row to this url as parameter. If there is a need to pass additional parameters, use the params option in subGridModel. See Subgrid	empty string	Yes
	//	subGridWidth	integer	 Defines the width of the sub-grid column if subgrid is enabled.	20	No
	//	toolbar	array	 This option defines the toolbar of the grid. This is an array with two elements in which the first element's value enables the toolbar and the second defines the position relative to the body layer (table data). Possible values are top, bottom, and both. When we set it like toolbar: [true,”both”] two toolbars are created – one on the top of table data and the other at the bottom of the table data. When we have two toolbars, then we create two elements (div). The id of the top bar is constructed by concatenating the string “t_” and the id of the grid, like “t_” + id_of_the_grid and the id of the bottom toolbar is constructed by concatenating the string “tb_” and the id of the grid, like “tb_” + id_of_the grid. In the case where only one toolbar is created, we have the id as “t_” + id_of_the_grid, independent of where this toolbar is located (top or bottom)	[false, '']	No
	//	toppager	boolean	When enabled this option places a pager element at top of the grid, below the caption (if available). If another pager is defined, both can coexist and are kept in sync. The id of the newly created pager is the combination grid_id + “_toppager”.	false	No
	//	totaltime	integer	 Readonly parameter. It gives the loading time of the records - currently available only when we load xml or json data. The measurement begins when the request is complete and ends when the last row is added.	0	No
	//	treedatatype	mixed	 Gives the initial datatype (see datatype option). Usually this should not be changed. During the reading process this option is equal to the datatype option.	null	No
	//	treeGrid	boolean	 Enables (disables) the tree grid format. For more details see Tree Grid	false	No
	//	treeGridModel	string	 Deteremines the method used for the treeGrid. The value can be either nested or adjacency. See Tree Grid	nested	No
	//	treeIcons	array	 This array sets the icons used in the tree grid. The icons should be a valid names from UI theme roller images. The default values are: {plus:'ui-icon-triangle-1-e',minus:'ui-icon-triangle-1-s',leaf:'ui-icon-radio-off'}		No
	//	treeReader	array	 Extends the colModel defined in the basic grid. The fields described here are appended to end of the colModel array and are hidden. This means that the data returned from the server should have values for these fields. For a full description of all valid values see Tree Grid.		No
	//	tree_root_level	numeric	 Defines the level where the root element begins when treeGrid is enabled.	0	No
	//	url	string	 The url of the file that returns the data needed to populate the grid. May be set to clientArray to manualy post data to server; see Inline Editing.	null	Yes
	private String url;
	//	userData	array	 This array contains custom information from the request. Can be used at any time.	empty array	No
	//	userDataOnFooter	boolean	 When set to true we directly place the user data array userData in the footer. The rules are as follows: If the userData array contains a name which matches any name defined in colModel, then the value is placed in that column. If there are no such values nothing is placed. Note that if this option is used we use the current formatter options (if available) for that column.	false	Yes
	//	viewrecords	boolean	 If true, jqGrid displays the beginning and ending record number in the grid, out of the total number of records in the query. This information is shown in the pager bar (bottom right by default)in this format: “View X to Y out of Z”. If this value is true, there are other parameters that can be adjusted, including emptyrecords and recordtext.	false	No
	private Boolean viewrecords;
	//	viewsortcols	array	 The purpose of this parameter is to define a different look and behavior for the sorting icons (up/down arrows) that appear in the column headers. This parameter is an array with the following default options viewsortcols : [false,'vertical',true]. The first parameter determines if sorting icons should be visible on all the columns that have the sortable property set to true. Setting this value to true could be useful if you want to indicate to the user that (s)he can sort on that particular column. The default of false sets the icon to be visible only on the column on which that data has been last sorted. Setting this parameter to true causes all icons in all sortable columns to be visible.
	//	The second parameter determines how icons should be placed - vertical means that the sorting arrows are one under the other. 'horizontal' means that the arrows should be next to one another. 
	//	The third parameter determines the click functionality. If set to true the data is sorted if the user clicks anywhere in the column's header, not only the icons. If set to false the data is sorted only when the sorting icons in the headers are clicked. 
	//	Important: If you are setting the third element to false, make sure that you set the first element to true; if you don't, the icons will not be visible and the user will not know where to click to be able to sort since clicking just anywhere in the header will not guarantee a sort.	[false,'vertical',true]	No
	//	width	number	 If this option is not set, the width of the grid is the sum of the widths of the columns defined in the colModel (in pixels). If this option is set, the initial width of each column is set according to the value of the shrinkToFit option.	none	No. Method avail.
	//	xmlReader	array	 An array which describes the structure of the expected xml data. For a full description refer to Retrieving Data in XML Format.		No
	public Object getAjaxGridOptions() {
		return ajaxGridOptions;
	}
	public void setAjaxGridOptions(Object ajaxGridOptions) {
		this.ajaxGridOptions = ajaxGridOptions;
	}
	public Object getAjaxSelectOptions() {
		return ajaxSelectOptions;
	}
	public void setAjaxSelectOptions(Object ajaxSelectOptions) {
		this.ajaxSelectOptions = ajaxSelectOptions;
	}
	public String getAltclass() {
		return altclass;
	}
	public void setAltclass(String altclass) {
		this.altclass = altclass;
	}
	public Boolean getAltRows() {
		return altRows;
	}
	public void setAltRows(Boolean altRows) {
		this.altRows = altRows;
	}
	public Boolean getAutoencode() {
		return autoencode;
	}
	public void setAutoencode(Boolean autoencode) {
		this.autoencode = autoencode;
	}
	public Boolean getAutowidth() {
		return autowidth;
	}
	public void setAutowidth(Boolean autowidth) {
		this.autowidth = autowidth;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Integer getCellLayout() {
		return cellLayout;
	}
	public void setCellLayout(Integer cellLayout) {
		this.cellLayout = cellLayout;
	}
	public Boolean getCellEdit() {
		return cellEdit;
	}
	public void setCellEdit(Boolean cellEdit) {
		this.cellEdit = cellEdit;
	}
	public String getCellsubmit() {
		return cellsubmit;
	}
	public void setCellsubmit(String cellsubmit) {
		this.cellsubmit = cellsubmit;
	}
	public String getCellurl() {
		return cellurl;
	}
	public void setCellurl(String cellurl) {
		this.cellurl = cellurl;
	}
	public Object getCmTemplate() {
		return cmTemplate;
	}
	public void setCmTemplate(Object cmTemplate) {
		this.cmTemplate = cmTemplate;
	}
	public ColModel[] getColModel() {
		return colModel;
	}
	public void setColModel(ColModel[] colModel) {
		this.colModel = colModel;
	}
	public String[] getColNames() {
		return colNames;
	}
	public void setColNames(String[] colNames) {
		this.colNames = colNames;
	}
	public String[] getData() {
		return data;
	}
	public void setData(String[] data) {
		this.data = data;
	}
	public String getDatastr() {
		return datastr;
	}
	public void setDatastr(String datastr) {
		this.datastr = datastr;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public Boolean getDeepempty() {
		return deepempty;
	}
	public void setDeepempty(Boolean deepempty) {
		this.deepempty = deepempty;
	}
	public Boolean getDeselectAfterSort() {
		return deselectAfterSort;
	}
	public void setDeselectAfterSort(Boolean deselectAfterSort) {
		this.deselectAfterSort = deselectAfterSort;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getEditurl() {
		return editurl;
	}
	public void setEditurl(String editurl) {
		this.editurl = editurl;
	}
	public String getEmptyrecords() {
		return emptyrecords;
	}
	public void setEmptyrecords(String emptyrecords) {
		this.emptyrecords = emptyrecords;
	}
	public String getExpandColClick() {
		return ExpandColClick;
	}
	public void setExpandColClick(String expandColClick) {
		ExpandColClick = expandColClick;
	}
	public String getExpandColumn() {
		return ExpandColumn;
	}
	public void setExpandColumn(String expandColumn) {
		ExpandColumn = expandColumn;
	}
	public Boolean getFooterrow() {
		return footerrow;
	}
	public void setFooterrow(Boolean footerrow) {
		this.footerrow = footerrow;
	}
	public Boolean getForceFit() {
		return forceFit;
	}
	public void setForceFit(Boolean forceFit) {
		this.forceFit = forceFit;
	}
	public String getGridstate() {
		return gridstate;
	}
	public void setGridstate(String gridstate) {
		this.gridstate = gridstate;
	}
	public Boolean getGridview() {
		return gridview;
	}
	public void setGridview(Boolean gridview) {
		this.gridview = gridview;
	}
	public Boolean getGrouping() {
		return grouping;
	}
	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
	}
	public Boolean getHeadertitles() {
		return headertitles;
	}
	public void setHeadertitles(Boolean headertitles) {
		this.headertitles = headertitles;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public Boolean getHiddengrid() {
		return hiddengrid;
	}
	public void setHiddengrid(Boolean hiddengrid) {
		this.hiddengrid = hiddengrid;
	}
	public Boolean getHidegrid() {
		return hidegrid;
	}
	public void setHidegrid(Boolean hidegrid) {
		this.hidegrid = hidegrid;
	}
	public Boolean getHoverrows() {
		return hoverrows;
	}
	public void setHoverrows(Boolean hoverrows) {
		this.hoverrows = hoverrows;
	}
	public String getIdPrefix() {
		return idPrefix;
	}
	public void setIdPrefix(String idPrefix) {
		this.idPrefix = idPrefix;
	}
	public Boolean getIgnoreCase() {
		return ignoreCase;
	}
	public void setIgnoreCase(Boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}
	public String[] getInlineData() {
		return inlineData;
	}
	public void setInlineData(String[] inlineData) {
		this.inlineData = inlineData;
	}
	public String[] getJsonReader() {
		return jsonReader;
	}
	public void setJsonReader(String[] jsonReader) {
		this.jsonReader = jsonReader;
	}
	public String getPager() {
		return pager;
	}
	public void setPager(String pager) {
		this.pager = pager;
	}
	public Integer[] getRowList() {
		return rowList;
	}
	public void setRowList(Integer[] rowList) {
		this.rowList = rowList;
	}
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public String getSortname() {
		return sortname;
	}
	public void setSortname(String sortname) {
		this.sortname = sortname;
	}
	public String getSortorder() {
		return sortorder;
	}
	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Boolean getViewrecords() {
		return viewrecords;
	}
	public void setViewrecords(Boolean viewrecords) {
		this.viewrecords = viewrecords;
	}
}
