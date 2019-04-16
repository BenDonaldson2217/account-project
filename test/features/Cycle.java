package features;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle {
	
	
	
	@Test
	public void count() {
		Service service = new Service();
		assertEquals(0, service.count(""));
	}
	

}
