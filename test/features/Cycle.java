package features;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Cycle {
	
	Service service = new Service();
	
	@BeforeClass
	public void setup() {
		service.addAccount("Ben", "Donaldson", "1");
		service.addAccount("Be", "Donaldson", "2");
		service.addAccount("B", "Donaldson", "3");
		service.addAccount("Be", "Donaldson", "4");
		service.addAccount("Ben", "Donaldson", "5");
		
	}
	
	@Test
	public void Test1() {
		assertEquals(0, service.count(""));
	}
	
	public void Test2() {
		assertEquals(1,service.count("B"));
	}
	
	
	

}
