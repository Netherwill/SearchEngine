/* Team 7
   Members: Khashi Reyes, Justin Shroyer, Yicheng Zhao, Tao Zeyi
*/

package org.uiowa.cs2820.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Database {
	
	private static HashMap<Field, ArrayList<Integer>> map = new HashMap<Field,ArrayList<Integer>>();
	
	public static void store(Field f, int identifier) {
		if(map.containsKey(f)){
			map.get(f).add(identifier);
		}
		else{
			ArrayList<Integer> newIdentifier =new ArrayList<Integer>();
			newIdentifier.add(identifier);
			map.put(f, newIdentifier);
		}
	}
	public static ArrayList<Integer> getValue(Field f) throws Exception{
		ArrayList<Integer> result=null;
		if(map.containsKey(f)){
			result=map.get(f);
		}else{
			throw new Exception("no such field in Database");
		}
		return result;
		
	}
	
	public static int getSize(){
		return map.keySet().size();
	}
	
	public static Set<Field> getKey(){
		Set<Field> keySet=null;
		keySet=map.keySet();
		return keySet;
	}
	
	public static boolean isEmpty(){
		if(map.isEmpty()){
			return false;
		}
		return true;
	}
	
	//only for test purpose never use for querying
	public static int querySingleField(Field f) throws Exception{
		int temp=0;
		if(map.get(f)==null){
			throw new Exception("there is no such field in database");
			
		}else{
			
			ArrayList<Integer> resultList = new ArrayList<Integer>();
			resultList=map.get(f);
			for(int i=0; i<resultList.size();i++){
				temp+=resultList.get(i);
				}
		}
		return temp;
	}
		
}
