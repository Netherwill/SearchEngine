package org.uiowa.cs2820.engine;

import java.util.Vector;
import org.uiowa.cs2820.engine.Field;

public class Database 
{	
	private static Vector<Data> v;
	
	public static void store(Field field, String id) 
	{
		Data d = new Data(field,id);
		v.add(d);
	}
	
	public static Field retrieveField(int index) 
	{
		return v.get(index).getField();
	}
	
	public static String retrieveId(int index) 
	{
		return v.get(index).getId();
	}
	
	static class Data 
	{
		private Field field;
		private String id;
		Data(Field field, String id) {
			this.field = field;
			this.id = id;
		}
		Field getField() 
		{
			return field;
		}
		String getId() 
		{
			return id;
		}
	}
}
