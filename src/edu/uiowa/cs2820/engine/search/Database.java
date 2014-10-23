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
	public ArrayList<String> getValue(Field f) throws Exception{
		ArrayList<String> result=null;
		if(map.containsKey(f)){
			result=map.get(f);
		}else{
			throw new Exception("no such field in Database");
		}
		return result;
		
	}
	
	public int size(){
		return map.keySet().size();
	}
	
	public Set<Field> getKey(){
		Set<Field> keySet=null;
		keySet=map.keySet();
		return keySet;
	}
	
	public boolean isEmpty(){
		if(map.isEmpty()){
			return false;
		}
		return true;
	}
	
	public void close(){
		map.clear();
	}
	
	//only for test purpose never use for querying
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
