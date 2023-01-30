

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import test.sas;

public class ts {
	@BeforeAll
	public void aa() {
		sas a= new  sas();
	}
	@AfterEach
	public void ass() {
		System.out.println("sa");
	}
	@Test
	public void a() {
		assertEquals(13,new sas().s(3));
	}
		@Test
		public void s() {
			assertEquals(11,new sas().s(1));
		}
	
		
		
}
