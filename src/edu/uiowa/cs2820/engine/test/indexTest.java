package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Indexer;

//using these two classes (myField, myDatabase) as mock classes for testing
//but actually you do not have to use this
/*
class myField extends Field{
	String fieldName;
	String fieldValue;

	public myField(String fieldName, String fieldValue) {
		super(fieldName, fieldValue);
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}

}
class myDatabase extends Database{
	
	private HashMap<Field, ArrayList<String>> map;
	
	public myDatabase(){
		map=new HashMap<Field,ArrayList<String>>();
	}
	@Override
	public void insert(Field f, String identifier) {
		if(map.containsKey(f)){
			map.get(f).add(identifier);
		}
		else{
			ArrayList<String> newIdentifier =new ArrayList<String>();
			newIdentifier.add(identifier);
			map.put(f, newIdentifier);
		}
	}
}*/

public class indexTest {	
	@Test
	public void indexTestAdd() throws Exception{
		
		//build new database and check size
		Database tdb= new Database();
		assertEquals(tdb.size(),0);
		
		//adding first object
		Indexer i = new Indexer("iD1",tdb);
		Field f1 =new Field("author","ZeyiTao");
		i.add(f1);
		assertEquals(tdb.size(), 1);
		assertEquals(tdb.querySingleField(f1),"iD1");
		
		//adding same field but different identifier
		Indexer i1 = new Indexer("iD2",tdb);
		Field f2 = new Field("author","ZeyiTao");
		i1.add(f2);
		assertEquals(tdb.size(), 1);
		assertEquals(tdb.querySingleField(f1),"iD1iD2");
		
		//adding another field with identifier iD1 
		Field f3 = new Field("year","2014");
		i.add(f3);
		assertEquals(tdb.size(), 2);
		assertEquals(tdb.querySingleField(f3),"iD1");
		
	}
}
