package ComptedeBlueJ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CompteFideliteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompteFideliteTest
{
    private Compte compteBa1;
    private CompteFidelite compteFi1;

    /**
     * Default constructor for test class CompteFideliteTest
     */
    public CompteFideliteTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        compteBa1 = new Compte(1234, 5000);
        compteFi1 = new CompteFidelite();
        compteFi1.setCompte(compteBa1);
    }
    
    @Test
    /*
     * Test methode for "Echanger les points de fidélité"
     * */
    public void testRemboursementPointsB()
    {
        compteFi1.setPoints(2000);
        compteFi1.remboursementPoints(500);
        assertEquals(1500,compteFi1.getPoints(),0.01);
    }
    /*
     * Test methode for "Echanger les points de fidélité"
     * */
   /* public void testRemboursementPointsA()
    {
        compteFi1.remboursementPoints(500);
        assertEquals(5005,compteBa1.getSolde(),0.01);
    }*/
    
    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
