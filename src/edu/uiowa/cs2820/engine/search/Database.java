/* Team 7
   Members: Khashi Reyes, Justin Shroyer, Yicheng Zhao, Tao Zeyi
*/

package org.uiowa.cs2820.engine;

import java.util.Vector;

public class Database 
{	
	public static Vector<Data> v = new Vector<Data>();
	
	public static void store(String field, String id) {
		Data d = new Data(field,id);
		v.add(d);
	}
	
	public static String getField(int i) 
	{
		return v.get(i).Field();
	}
	
	public static String getId(int i) 
	{
		return v.get(i).Id();
	}
	
	public static int getSize() {
		return v.size();
	}

	static class Data 
	{
		String field;
		String id;
		Data(String field, String id) {
			this.field = field;
			this.id = id;
		}
		public String Field() 
		{
			return field;
		}
		public String Id() 
		{
			return id;
		}
	}
}
