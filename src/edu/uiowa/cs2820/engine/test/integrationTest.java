package edu.uiowa.cs2820.engine.test;

import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Indexer;
import edu.uiowa.cs2820.engine.search.FieldSearch;

import org.junit.*;

public class integrationTest {

	@Test
	public void databaseIntegrationTest(){
		Database testDatabase = new Database();
		String fileName = "test1";
		String [] content = {"bookName ObjectOrientProgramming",
							 "ISBN 12345678",
							 "publishYear 2014",
							 "author ZeyiTao KhashiReyes",
							 "category textbook science mathemtics",
							 "edition 3rd"
		};
		
		for(int i=0; i<content.length; i++){
			
			testDatabase.insert(f, identifier);
		}
		
	}
	@Test
	public void indexerTest(){
		
	}

}
