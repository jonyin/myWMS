package com.mywms.ui.jqgrid;

public class ColModel {

	//	align	string	Defines the alignment of the cell in the Body layer, not in header cell. Possible values: left, center, right.	left
	private String align;
	// used for where column should be ordered
	private Integer order;
	//	cellattr	function	This function add attributes to the cell during the creation of the data - i.e dynamically. By example all valid attributes for the table cell can be used or a style attribute with different properties. The function should return string. Parameters passed to this function are: 
	//	rowId - the id of the row 
	//	val - the value which will be added in the cell 
	//	rawObject - the raw object of the data row - i.e if datatype is json - array, if datatype is xml xml node. 
	//	cm - all the properties of this column listed in the colModel 
	//	rdata - the data row which will be inserted in the row. This parameter is array of type name:value, where name is the name in colModel	null
	//	classes	string	This option allow to add classes to the column. If more than one class will be used a space should be set. By example classes:'class1 class2' will set a class1 and class2 to every cell on that column. In the grid css there is a predefined class ui-ellipsis which allow to attach ellipsis to a particular row. Also this will work in FireFox too.	empty string
	//	datefmt	string	Governs format of sorttype:date (when datetype is set to local) and editrules {date:true} fields. Determines the expected date format for that column. Uses a PHP-like date formatting. Currently ”/”, ”-”, and ”.” are supported as date separators. Valid formats are: 
	//	y,Y,yyyy for four digits year 
	//	YY, yy for two digits year 
	//	m,mm for months 
	//	d,dd for days. 
	//	See Array Data	ISO Date (Y-m-d)
	//	defval	string	The default value for the search field. This option is used only in Custom Searching and will be set as initial search.	empty
	//	editable	boolean	Defines if the field is editable. This option is used in cell, inline and form modules. See editing	false
	//	editoptions	array	Array of allowed options (attributes) for edittype option editing	empty array
	//	editrules	array	sets additional rules for the editable field editing	empty array
	//	edittype	string	Defines the edit type for inline and form editing Possible values: text, textarea, select, checkbox, password, button, image and file. See also editing	text
	//	firstsortorder	string	If set to asc or desc, the column will be sorted in that direction on first sort.Subsequent sorts of the column will toggle as usual	null
	//	fixed	boolean	 If set to true this option does not allow recalculation of the width of the column if shrinkToFit option is set to true. Also the width does not change if a setGridWidth method is used to change the grid width.	false
	//	formoptions	array	Defines various options for form editing. See Form options	empty
	//	formatoptions	array	Format options can be defined for particular columns, overwriting the defaults from the language file. See Formatter for more details.	none
	//	formatter	mixed	The predefined types (string) or custom function name that controls the format of this field. See Formatter for more details.	none
	//	frozen	boolean	If set to true determines that this column will be frozen after calling the setFrozenColumns method	false
	//	hidedlg	boolean	If set to true this column will not appear in the modal dialog where users can choose which columns to show or hide. See Show/Hide Columns.	false
	//	hidden	boolean	Defines if this column is hidden at initialization.	false
	//	index	string	Set the index name when sorting. Passed as sidx parameter.	empty string
	private String index;
	//	jsonmap	string	Defines the json mapping for the column in the incoming json string. See Retrieving Data	none
	//	key	boolean	Overwrite the id (defined in readers) from server. Can be set as id for the unique row id. Only one column can have this property. This option have higher priority as those from the readers. If there are more than one key set the grid finds the first one and the second is ignored.	false
	//	label	string	When colNames array is empty, defines the heading for this column. If both the colNames array and this setting are empty, the heading for this column comes from the name property.	none
	//	name	string	Set the unique name in the grid for the column. This property is required. As well as other words used as property/event names, the reserved words (which cannot be used for names) include subgrid, cb and rn.	Required
	private String name;
	//	resizable	boolean	Defines if the column can be re sized	true
	//	search	boolean	When used in search modules, disables or enables searching on that column. Search Configuration	true
	//	searchoptions	array	Defines the search options used searching Search Configuration	empty
	//	sortable	boolean	Defines is this can be sorted.	true
	//	sortfunc	function	Custom function to make custom sorting when datatype is local. Three parameters a, b and direction are passed. The a and b parameters are values to be compared direction is numeric 1 and -1 for ascending and descending order. The function should return 1, -1 or 0	null
	//	sorttype	mixed	Used when datatype is local. Defines the type of the column for appropriate sorting.Possible values: 
	//	int/integer - for sorting integer 
	//	float/number/currency - for sorting decimal numbers 
	//	date - for sorting date 
	//	text - for text sorting 
	//	function - defines a custom function for sorting. To this function we pass the value to be sorted and it should return a value too. 
	//	See Array Data	text
	//	stype	string	 Determines the type of the element when searching. See Search Configuration	text
	//	surl	string	Valid only in Custom Searching and edittype : 'select' and describes the url from where we can get already-constructed select element	empty string
	//	template	 object	 Set of valid properties for the colModel. This option can be used if you want to overwrite a lot of default values in the column model with easy. See cmTemplate in grid options	 null
	//	title	boolean	If this option is false the title is not displayed in that column when we hover a cell with the mouse	true
	//	width	number	Set the initial width of the column, in pixels. This value currently can not be set as percentage	150
	private Integer width;
	//	xmlmap	string	Defines the xml mapping for the column in the incomming xml file. Use a CSS specification for this See Retrieving Data	none
	//	unformat	function	 Custom function to “unformat” a value of the cell when used in editing See Custom Formatter. (Unformat is also called during sort operations. The value returned by unformat is the value compared during the sort.)	null
	//	viewable	boolean	This option is valid only when viewGridRow method is activated. When the option is set to false the column does not appear in view Form	true
	public String getAlign() {
		return align;
	}
	public void setAlign(String align) {
		this.align = align;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
}
