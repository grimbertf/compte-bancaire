package ComptedeBlueJ;


/**
 * Write a description of class CompteFidelite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompteFidelite
{
    private Compte compte;
    private int points;

    public CompteFidelite()
    {
        // initialise instance variables
        this.compte = new Compte();
        this.points = 1000;
    }
    public int getPoints()
    {
        return this.points;
    } 
    public void setPoints(int x)
    {
        this.points = x;
    }
    public Compte getCompte()
    {
        return this.compte;
    }
    public void setCompte(Compte x)
    {
        this.compte = x;
    }
    
    public void remboursementPoints(int nombrePoints)
    {
        double argent = nombrePoints/100;
        compte.deposerArgent(argent);
        this.points = this.points - nombrePoints;
    }
}
