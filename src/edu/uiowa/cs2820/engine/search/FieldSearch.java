package org.uiowa.cs2820.engine;

import java.util.ArrayList;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Indexer;

public class FieldSearch {
	private Database database;
	private String query;
	public FieldSearch(Database database){
		this.database = database;
	}
    public static ArrayList<Integer> findEquals(Field query){
        this.query = query;
        ArrayList<Integer> hitList = new ArrayList<Integer>();
        Integer[] identifier;
        HashSet<Integer> hits = database.getValue(query);
        if (hits == null){
        	throw new Exception("Not found");
        }
        else{
            for (String e: hits){
            	hitList.add(e);
            }
            identifier = hitList.toArray(hitList.size());
        }
        return hitList;
    }   
}
