/* Team 7
   Members: Khashi Reyes, Justin Shroyer, Yicheng Zhao, Tao Zeyi
*/

package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.uiowa.cs2820.engine.Database;
import org.junit.Test;

public class DatabaseTest {

	@Test
	public void DataTest() {
		String s1 = "Hello";
		String s2 = "World";
		Database d = new Database();
		d.store(s1, s2);
		assertEquals(d.getField(0), s1);
		assertEquals(d.getId(0), s2);
	}

}
