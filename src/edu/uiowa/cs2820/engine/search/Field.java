package edu.uiowa.cs2820.engine.search;

public class Field {
	private String fieldName;
	private	String fieldValue;
	
	public Field(String fieldname, String fieldValue){
		this.fieldName=fieldname;
		this.fieldValue=fieldValue;		
	}
	public String getFieldName(){
		return fieldName;
	}
	public String getFieldValue(){
		return fieldValue;
	}
	public String toString(){
		return fieldName + ":" + fieldValue;
	}
}
