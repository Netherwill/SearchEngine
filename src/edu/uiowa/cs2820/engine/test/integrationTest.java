package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Indexer;
import edu.uiowa.cs2820.engine.search.FieldSearch;

import org.junit.*;

public class integrationTest {
	@Test
	public void IntegrationTest() throws Exception{
		
		Database testdb = new Database();

		String fileName = "test1";
		String [] content = {"bookName ObjectOrientProgramming",
				 			"ISBN 12345678",
				 			"publishYear 2014",
				 			"author ZeyiTao KhashiReyes",
				 			"category textbook science mathemtics",
				 			"edition 3rd"
							};
		
		String fileName1 = "test2";
		String [] content1 = {"bookName ProgrammingLanguageConcept",
				 			"ISBN 87654321",
				 			"publishYear 2014",
				 			"author ZeyiTao KhashiReyes",
				 			"category textbook science language",
				 			"edition 2rd"
							};
		//loading the fake data with identifier test1-* and we have 9 new field 
		for(int i=0; i<content.length; i++){
			String identifier=fileName + "-" + i; 
			String[] temp =content[i].split(" ");
			String fieldName= temp[0];
			for(int j=1; j<temp.length; j++){
				Field tempfield =new Field(fieldName, temp[j]);
				Indexer tempI = new Indexer(identifier,testdb);
				tempI.add(tempfield);
			}			
		}
		assertEquals(testdb.size(),9);
		
		//loading the fake data with identifier test2-* and we adding 4 new fields
		for(int i=0; i<content1.length; i++){
			String identifier=fileName1 + "-" + i; 
			String[] temp =content1[i].split(" ");
			String fieldName= temp[0];
			for(int j=1; j<temp.length; j++){
				Field tempfield =new Field(fieldName, temp[j]);
				Indexer tempI = new Indexer(identifier,testdb);
				tempI.add(tempfield);
			}			
		}
		assertEquals(testdb.size(),13);
		//we start field search test
		//general test with only one identifier return
		FieldSearch fs1 = new FieldSearch(testdb);
		Field f0 = new Field("bookName","ObjectOrientProgramming");
		assertEquals("[test1-0]",fs1.findEquals(f0).toString());
		//general test with multiple identifier return
		Field f1 = new Field("author","ZeyiTao");
		assertEquals("[test1-3, test2-3]",fs1.findEquals(f1).toString());
		//test the given field not in database
		//it will throws an exception now i can not catch this exception but 
		//if you do the following test the exception will show in windows
		//Field f2 = new Field("price","100");
		//assertEquals("",fs1.findEquals(f2).toString());
		
	}
}
