package edu.uiowa.cs2820.engine.search;

import java.util.ArrayList;

public class FieldSearch {
	private ArrayList<String> result;
	private Database db;
	
	public FieldSearch(Database database){
		this.db=database;
	}
	
	public ArrayList<String> findEquals(Field f){
		
		result=db.querySingleField(f);
		return result;
	}
}
