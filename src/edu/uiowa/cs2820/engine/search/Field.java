package edu.uiowa.cs2820.engine.search;

public class Field
{
    private String fieldName;
    private String value;

    public Field(String fieldName, String value)
    {
        this.fieldName = fieldName;
        this.value = value;
    }

    public String getFieldName()
    {
        return fieldName;
    }

    public String getValue()
    {
        return value;
    }
    //provide my implementation of equals() in Field class
    @Override
    public boolean equals(Object other){
    	if (!(other instanceof Field)){
    		return false;
    	}
    	return true;
    }
    //override hashCode() since we are using hash table in our database
    @Override
    public int hashCode(){
    	return (this.fieldName+this.value).hashCode(); 
    }
}
