package edu.uiowa.cs2820.engine.search;

public class Indexer {
	private String identifier;
	private Database db;
	
	public Indexer(String identifier, Database db){
		this.identifier=identifier;
		this.db=db;
	}	

	public void add(Field f){		
		db.insert(f,identifier);	
	}
	
	public void close(){
		
	}

}
