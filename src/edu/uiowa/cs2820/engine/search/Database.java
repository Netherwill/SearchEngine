package edu.uiowa.cs2820.engine.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Database {
	
	private HashMap<Field, ArrayList<String>> map;
	
	public Database(){
		map=new HashMap<Field,ArrayList<String>>();
	}
	
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
	
	public int size(){
		return map.keySet().size();
	}
	
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
