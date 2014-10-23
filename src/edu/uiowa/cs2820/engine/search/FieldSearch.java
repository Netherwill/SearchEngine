package edu.uiowa.cs2820.engine.search;

import java.util.ArrayList;

public class FieldSearch {
	private String result;
	private Database db;

	public FieldSearch(Database database){
		this.db=database;
	}
	
	public String findEquals(Field f) throws Exception{
		
		result=db.querySingleField(f);
		return result;
	}
}
