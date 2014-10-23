package edu.uiowa.cs2820.engine.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Indexer;

class myDatabase extends Database{
	
	private HashMap<Field, ArrayList<String>> map;
	
	public myDatabase() {
		map = new HashMap<Field, ArrayList<String>>();
	}
	
	@Override
	public void insert(Field f, String identifier) {
		if (map.containsKey(f)){
			map.get(f).add(identifier);
		}
		else{
			ArrayList<String> list = new ArrayList<String>();
			list.add(identifier);
			map.put(f, list);
		}
	}
	
	@Override
	public int size() {
		return map.keySet().size();
	}
	@Override
	public String querySingleField(Field f) throws Exception{
		String temp="";
		if(map.get(f)==null){
			throw new Exception("there is no such field in database");
			
		}else{
			ArrayList<String> resultList = new ArrayList<String>();
			resultList=map.get(f);
			for(int i=0; i<resultList.size();i++){
				temp+=resultList.get(i);
				}
		}
		return temp;
	}
	
}

public class indexTest {
	myDatabase db1;
	  
	@Test
	public void indexTestAdd() throws Exception{
		
		
		Field F1= new Field("a","b");
		
		Field F2= new Field("a","b");
		
		//assertEquals(F1,F2);
		
		
		myDatabase db1= new myDatabase();
		assertEquals(db1.size(),0);
		
		Indexer i = new Indexer("iD1",db1);
		Field f1 =new Field("author","ZeyiTao");
		i.add(f1);
		assertEquals(db1.size(), 1);
		assertEquals(db1.querySingleField(f1),"iD1");
		
		Indexer i1 = new Indexer("iD2",db1);
		Field f2 = new Field("author","ZeyiTao");
		//assertEquals(f1,f2);
		
		i1.add(f2);
		assertEquals(db1.size(), 1);
		
		assertEquals(db1.querySingleField(f1),"iD1iD2");
	}
	
	

}
