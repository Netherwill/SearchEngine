package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Indexer;
import edu.uiowa.cs2820.engine.search.FieldSearch;

import org.junit.*;

public class integrationTest {

	@Test
	public void databaseIntegrationTest() throws Exception{
		Database testDatabase = new Database();
		String fileName = "test1";
		String [] content = {"bookName ObjectOrientProgramming",
							 "ISBN 12345678",
							 "publishYear 2014",
							 "author ZeyiTao KhashiReyes ZeyiTao",
							 "category textbook science mathemtics",
							 "edition 3rd"
		};
		
		for(int i=0; i<content.length; i++){
			String identifier=fileName + "-" + i; 
			String[] temp =content[i].split(" ");
			String fieldName= temp[0];
			for(int j=1; j<temp.length; j++){
				Field tempfield =new Field(fieldName, temp[j]);
				testDatabase.insert(tempfield, identifier);
			}			
		}
		
		assertEquals(testDatabase.size(),9);
		Field testfield0=new Field("ISBN","12345678");
		testDatabase.insert(testfield0, "test1-1");
		assertEquals(testDatabase.querySingleField(testfield0),"[test1-1]");
		Field testfield1=new Field("edition","3rd");
		testDatabase.insert(testfield1, "test1-5");
		assertEquals(testDatabase.querySingleField(testfield1),"[test1-5]");
		Field testfield2=new Field("author","KhashiReyes");
		testDatabase.insert(testfield2, "test1-3");
		assertEquals(testDatabase.querySingleField(testfield2),"[test1-3]");
	}
	@Test
	public void indexerTest(){
		
	}

}
