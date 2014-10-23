package org.uiowa.cs2820.engine;

import java.util.Vector;

public class Database 
{	
	private static Vector<Data> v;
	
	public void store(String field, String id) 
	{
		Data d = new Data(field,id);
		v.add(d);
	}
	
	public String getField(int index) 
	{
		return v.get(index).Field();
	}
	
	public String getId(int index) 
	{
		return v.get(index).Id();
	}

	class Data 
	{
		private String field;
		private String id;
		Data(String field, String id) {
			this.field = field;
			this.id = id;
		}
		String Field() 
		{
			return field;
		}
		String Id() 
		{
			return id;
		}
	}
}
