package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*;

import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Field;


/*class myField extends Field{
	String fieldName;
	String fieldValue;

	public myField(String fieldName, String fieldValue) {
		super(fieldName, fieldValue);
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}

}*/

public class databaseTest {
	@Test
	public void databaseInsertationTest() throws Exception{
		Database testdatabase= new Database();
		
		/*myField f1 =new myField("author","ZeyiTao");
		testdatabase.insert(f1, "test1-1");
		assertEquals(testdatabase.size(),1);
		assertEquals(testdatabase.querySingleField(f1),"test1-1");
		
		myField f2 =new myField("author","ZeyiTao");
		testdatabase.insert(f1, "test2-1");
		//assertEquals(testdatabase.size(),1);
		assertEquals(testdatabase.querySingleField(f1),"test1-1test2-1");*/
		
		for(int i=0; i<5;i++){
			Field f =new Field("author","ZeyiTao");
			testdatabase.insert(f, "test1-"+i);
		}
		Field f1 =new Field("author","ZeyiTao");
		assertEquals(testdatabase.querySingleField(f1),"test1-0test1-1test1-2test1-3test1-4");
		assertEquals(testdatabase.size(),1);
		
		
	}

}


