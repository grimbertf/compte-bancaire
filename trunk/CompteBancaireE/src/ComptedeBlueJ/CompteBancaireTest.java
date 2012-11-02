package ComptedeBlueJ;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CompteBancaireTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompteBancaireTest
{
    /**
     * Default constructor for test class CompteBancaireTest
     */
    public CompteBancaireTest()
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
        
    }
    @Test
    /*
     * Test methode for "Déposer de l'argent"
     * */
    public void testDeposerArgent()
    {
        Compte compte1 = new Compte();        
        compte1.setIdCompte(1234);
        compte1.setSolde(1000);
        compte1.deposerArgent(500.0);
        double leSolde = compte1.getSolde();
        assertEquals(1500,leSolde,0.01);
    }
    
    /*
     * Test methode for "Déposer de l'argent"
     * */
    public void testRetirerArgent()
    {
        Compte compte1 = new Compte();        
        compte1.setIdCompte(1234);
        compte1.setSolde(1000);
        compte1.retirerArgent(500.0);
        double leSolde = compte1.getSolde();
        assertEquals(500,leSolde,0.01);
    }
    
    /*
    public void testDeposerArgent()
    {
        Compte compte1 = new Compte();
        
        compte1.setIdCompte(1234);
        assertEquals(1234,compte1.getIdCompte());
        
        
        compte1.setSolde(1000);
        double leSolde = compte1.getSolde();
        assertEquals(1000,leSolde,0.01);
        
        compte1.deposerArgent(500.0);
        leSolde = compte1.getSolde();
        assertEquals(1500,leSolde,0.01);
        
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
