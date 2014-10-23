package edu.uiowa.cs2820.engine.test;

import edu.uiowa.cs2820.engine.search.Field;
import static org.junit.Assert.*;
import org.junit.*;

public class fieldTest {
	@Test
	public void fieldConstructorTest(){
		String s1="ISBN";
		String v1="123456789";
		Field testfield = new Field(s1,v1);
		//assertEquals(testfield.getFieldName(),s1);
		//assertEquals(testfield.getFieldValue(),v1);
	}

}
