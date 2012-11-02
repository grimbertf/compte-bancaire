package ComptedeBlueJ;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClentTest {

	private Compte compte1;
	private Compte compte2;
	private Client client1;
	@Before
	public void setUp() throws Exception {
		compte1 = new Compte(1234, 5000);
		compte2 = new Compte(5678, 8000);
		ArrayList lescomptes=null;
		lescomptes.add(compte1);
		lescomptes.add(compte2);
		client1.setComptes(lescomptes);
	}
	
	@Test
	public void testVirement()
	{
		client1.virment(1000);
		double x = ((Compte) client1.getComptes().get(0)).getSolde();
		double y = ((Compte) client1.getComptes().get(1)).getSolde();
		assertEquals(4000,x,0.01);
		assertEquals(9000,y,0.01);
	}

	@After
	public void tearDown() throws Exception {
	}

}
