package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.FieldSearch;


//this is a mock database
class myDatabase extends Database{
	
	public HashMap<Field, ArrayList<String>> map;
	
	public myDatabase(){
		map=new HashMap<Field,ArrayList<String>>();
	}
	//need Override other methods here not really necessary
	
	

};

public class fieldSearchTest {
	@Test
	public void searchTest() throws Exception{
		
		myDatabase tdb = new myDatabase();

		String fileName = "test1";
		String [] content = {"bookName ObjectOrientProgramming",
				 			"ISBN 12345678",
				 			"publishYear 2014",
				 			"author ZeyiTao KhashiReyes ZeyiTao",
				 			"category textbook science mathemtics",
				 			"edition 3rd"
							};
		
		String fileName1 = "test2";
		String [] content1 = {"bookName ProgrammingLanguageConcept",
				 			"ISBN 87654321",
				 			"publishYear 2014",
				 			"author ZeyiTao KhashiReyes ZeyiTao",
				 			"category textbook science language",
				 			"edition 2rd"
							};
		//adding the fake data with identifier test1-* and we have 9 new field 
		for(int i=0; i<content.length; i++){
			String identifier=fileName + "-" + i; 
			String[] temp =content[i].split(" ");
			String fieldName= temp[0];
			for(int j=1; j<temp.length; j++){
				Field tempfield =new Field(fieldName, temp[j]);
				tdb.insert(tempfield, identifier);
			}			
		}
		assertEquals(tdb.size(),9);
		
		//adding the fake data with identifier test2-* and we adding 4 new fields
		for(int i=0; i<content1.length; i++){
			String identifier=fileName1 + "-" + i; 
			String[] temp =content1[i].split(" ");
			String fieldName= temp[0];
			for(int j=1; j<temp.length; j++){
				Field tempfield =new Field(fieldName, temp[j]);
				tdb.insert(tempfield, identifier);
			}			
		}
		assertEquals(tdb.size(),13);
		
		//now we are starting the field search test 
		
		FieldSearch fs=new FieldSearch(tdb);
		Field	f = new Field("ISBN", "12345678");
		assertEquals(tdb.querySingleField(f),"test1-1");
		//the test below is test the field search but return going to be an ArrayList therefore failed
		//assertEquals(fs.findEquals(f),"[test1-1]");
		
	}
}

