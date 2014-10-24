/* Team 7
   Members: Khashi Reyes, Justin Shroyer, Yicheng Zhao, Tao Zeyi
*/

package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.*;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;

public class DatabaseTest {
	@Test
	public void databaseInsertationTest() throws Exception{
		//new test database
		//check the empty database size 0
		assertEquals(Database.getSize(),0);
		
		//check the first object in database
		Field tf = new Field("Hello", "World");
		Database.store(tf, "1-1");
		assertEquals(Database.getSize(),1);
		
		//check the second object in database
		Field tf1 = new Field("year", "2014");
		Database.store(tf1, "1-2");
		assertEquals(Database.getSize(),2);
		
		//check adding the same object in database
		Field tf2 = new Field("year", "2014");
		Database.store(tf2, "2-3");
		assertEquals(Database.getSize(),2);
		
		//one more insertion
		Field tf3 = new Field("ISBN", "1234567");
		Database.store(tf3, "1-3");
		assertEquals(Database.getSize(),3);
		
		//check the query function return the identifier
		assertEquals(Database.querySingleField(tf),"1-1");
		assertEquals(Database.querySingleField(tf1),"1-22-3");
				
	}

}
