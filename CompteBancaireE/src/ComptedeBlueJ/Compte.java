package ComptedeBlueJ;


/**
 * Write a description of class CompteBancaire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compte
{
    // instance variables - replace the example below with your own
    private int idCompte;
    private int idClient;
    private double solde;
    /**
     * Constructor for objects of class CompteBancaire
     */
    public Compte()
    {
        // initialise instance variables
        idCompte=0;
        solde=0;
    }
    
    public Compte(int unId, double unSolde)
    {
        // initialise instance variables
        idCompte=unId;
        solde=unSolde;
    }
    
    public int getIdCompte()
    {
        return this.idCompte;
    }
    
    public void setIdCompte(int id)
    {
        this.idCompte = id;
    }
    
    public int getIdClient()
    {
        return this.idClient;
    }
    
    public void setIdClient(int id)
    {
        this.idClient = id;
    }
    
    public double getSolde()
    {
        return this.solde;
    }
    
    public void setSolde(double unSolde)
    {
        this.solde = unSolde;
    }
    
    public void deposerArgent(double depot)
    {
        this.solde += depot;
        //System.out.println("Vous avez déposé "+depot+" euros dans le compte "+this.idCompte+".");
        //System.out.println("Le solde du compte est "+this.solde+" euros.");
    }
    public void retirerArgent(double depot)
    {
        this.solde -= depot;
        
    }
}
