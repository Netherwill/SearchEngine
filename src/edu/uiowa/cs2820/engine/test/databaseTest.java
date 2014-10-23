package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.*;

import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Field;

public class databaseTest {
	@Test
	public void databaseInsertationTest() throws Exception{
		//new test database
		Database tdb= new Database();
		//check the empty database size 0
		assertEquals(tdb.size(),0);
		
		//check the first object in database
		Field tf = new Field("author", "ZeyiTao");
		tdb.insert(tf, "1-1");
		assertEquals(tdb.size(),1);
		
		//check the second object in database
		Field tf1 = new Field("year", "2014");
		tdb.insert(tf1, "1-2");
		assertEquals(tdb.size(),2);
		
		//check adding the same object in database
		Field tf2 = new Field("year", "2014");
		tdb.insert(tf2, "2-3");
		assertEquals(tdb.size(),2);
		
		//one more insertion
		Field tf3 = new Field("ISBN", "1234567");
		tdb.insert(tf3, "1-3");
		assertEquals(tdb.size(),3);
		
		//check the query function return the identifier
		assertEquals(tdb.querySingleField(tf),"1-1");
		assertEquals(tdb.querySingleField(tf1),"1-22-3");
				
	}

}


