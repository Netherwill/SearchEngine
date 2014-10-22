package edu.uiowa.cs2820.engine.search;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
	
	private HashMap<Field, ArrayList<String>> map;

	public void insert(Field f, String identifier) {
		if(map.containsKey(f)){
			map.get(f).add(identifier);
		}
		else{
			ArrayList<String> newIdentifier =new ArrayList<>();
			newIdentifier.add(identifier);
			map.put(f, newIdentifier);
		}
	}

	public ArrayList<String> querySingleField(Field f) {
		ArrayList<String> resultList = new ArrayList<String>();
		resultList=map.get(f);
		return resultList;
	}

	
}
