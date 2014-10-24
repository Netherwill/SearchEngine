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
		Database tdb= new Database();
		//check the empty database size 0
		assertEquals(tdb.getSize(),0);
		
		//check the first object in database
		Field tf = new Field("Hello", "World");
		tdb.store(tf, "1-1");
		assertEquals(tdb.getSize(),1);
		
		//check the second object in database
		Field tf1 = new Field("year", "2014");
		tdb.store(tf1, "1-2");
		assertEquals(tdb.getSize(),2);
		
		//check adding the same object in database
		Field tf2 = new Field("year", "2014");
		tdb.store(tf2, "2-3");
		assertEquals(tdb.getSize(),2);
		
		//one more insertion
		Field tf3 = new Field("ISBN", "1234567");
		tdb.store(tf3, "1-3");
		assertEquals(tdb.getSize(),3);
		
		//check the query function return the identifier
		assertEquals(tdb.querySingleField(tf),"1-1");
		assertEquals(tdb.querySingleField(tf1),"1-22-3");
				
	}

}
