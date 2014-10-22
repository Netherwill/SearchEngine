package edu.uiowa.cs2820.engine.search;

import java.util.Set;

public class Indexer {
	private String identifier;
	private Database db;
	
	public Indexer(String identifier){
		this.identifier=identifier;
	}	

	public void add(Field f){		
		//db.insert(f,identifier);	
	}
	
	public void close(){
		
	}

}
