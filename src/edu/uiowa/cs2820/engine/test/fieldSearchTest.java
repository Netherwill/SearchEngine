import static org.junit.Assert.*;
import org.uiowa.cs2820.engine.search.FieldSearch;
import edu.uiowa.cs2820.engine.search.Field;
import edu.uiowa.cs2820.engine.search.Database;
import edu.uiowa.cs2820.engine.search.Indexer;

import org.junit.Test;

public class FieldSearchTest {

	@Test
	public void FieldSearchTestA() {
		Field f = new Field("President", "Washington");
		Database.store(f, 1);
		assertEquals(FieldSearch.findEquals("Washington"),1);
		
	}
	@Test
	public void FieldSearchTestB(){
		assertEquals(FieldSearch.findEquals("Jefferson"), "Not Found");
	}
}
