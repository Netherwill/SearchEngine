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
		assertEquals(testfield.getFieldName(),s1);
		assertEquals(testfield.getFieldValue(),v1);
	}
	@Test
	public void fieldEqualTest(){
		Field testfield1 = new Field("1","1");
		Field testfield2 = new Field("1","1");
		Field testfield3 = new Field("1","2");
		//assertEquals(testfield1.twoFieldAreEqual(testfield2),"true");
		//assertEquals(testfield1.twoFieldAreEqual(testfield3),"false");
	}

}
