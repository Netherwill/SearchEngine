package edu.uiowa.cs2820.engine.search;

public class Field {
	
	private String Name;
	private	String Value;
	
	public Field(String fieldName, String fieldValue){
		this.Name=fieldName;
		this.Value=fieldValue;		
	}
	public String getFieldName(){
		return Name;
	}
	public String getFieldValue(){
		return Value;
	}
	
	
	
	
	/*public String twoFieldAreEqualString(Field f){
		String result = "";
		if(this.fieldName==f.fieldName&this.fieldValue==f.fieldValue){
			result+="true";
		}
		else{
			result+="false";
		}
		return result;
	}
	
	public boolean twoFieldAreEqual(Field f){
		boolean result = false;
		if(this.fieldName==f.fieldName&this.fieldValue==f.fieldValue){
			result=true;
		}
		else{
			result=false;
		}
		return result;
	}
	
	public String toString(){
		return fieldName + ":" + fieldValue;
	}*/
}
