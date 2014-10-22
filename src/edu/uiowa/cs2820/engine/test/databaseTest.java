package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*;

import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Field;


class myField {
	
	private String Name;
	private	String Value;
	
	public myField(String fieldName, String fieldValue){
		this.Name=fieldName;
		this.Value=fieldValue;		
	}
	public String getFieldName(){
		return Name;
	}
	public String getFieldValue(){
		return Value;
	}
}

public class databaseTest {
	@Test
	public void databaseInsertationTest() throws Exception{
		
		Database testDatabase = new Database();
		
		String fileName = "test1";
		String [] content = {"bookName ObjectOrientProgramming",
							 "ISBN 12345678",
							 "publishYear 2014",
							 "author ZeyiTao KhashiReyes ZeyiTao",
							 "category textbook science mathemtics",
							 "edition 3rd"
							 };
		
		
		HashMap<myField,String> lol = new HashMap<myField,String>();
		
		myField testfield1 =new myField("1","2");
		lol.put(testfield1, "1");
		myField testfield2 =new myField("1","2");
		
		Field testfield3 =new Field("ISBN","12345678");
		
		
		
		lol.put(testfield2, "2");
		assertEquals(lol.keySet().size(),1);
		
		
		//testDatabase.insert(testfield1, "1");
		//testDatabase.insert(testfield2, "2");
		//assertEquals(testfield1.twoFieldAreEqualString(testfield2),"true");
		//assertEquals(testDatabase.size(),2);
		//assertEquals(testDatabase.querySingleField(testfield3),"");
		
	}}


