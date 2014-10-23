package edu.uiowa.cs2820.engine.search;

import java.util.ArrayList;

public class FieldSearch {
	private ArrayList<String> result;
	private Database db;

	public FieldSearch(Database database){
		this.db=database;
	}
	
	public ArrayList<String> findEquals(Field f) throws Exception{
		
		if(!db.isEmpty()){
			throw new Exception("Nothing in our database");
		}else{
			if(db.getKey().contains(f)){
				result=db.getValue(f);
			}else{
				throw new Exception("No such field match database");
			}
			
		}
		return result;
	}
}
