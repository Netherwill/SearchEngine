/* Team 7
   Members: Khashi Reyes, Justin Shroyer, Yicheng Zhao, Tao Zeyi
*/

package org.uiowa.cs2820.engine;

import java.util.Vector;

public class Database 
{	
	private Vector<Data> v;
	public Database() 
	{
		v = new Vector<Data>();
	}
	public void store(String field, String id) {
		Data d = new Data(field,id);
		v.add(d);
	}
	
	public String getField(int i) 
	{
		return v.get(i).Field();
	}
	
	public String getId(int i) 
	{
		return v.get(i).Id();
	}

	class Data 
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
