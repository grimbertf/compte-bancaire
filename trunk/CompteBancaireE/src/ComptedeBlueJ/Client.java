package ComptedeBlueJ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Client {
	
	private int idClient;
	private ArrayList comptes;
	private String nom;
	private int age;
	
	public Client()
	{
		idClient=0;
		nom = "";
		age=0;
		Compte compte1=null, compte2=null;
		comptes.add(compte1);
		comptes.add(compte2);
	}
	
	public int getIdClient()
    {
        return this.idClient;
    }
    
    public void setIdClient(int id)
    {
        this.idClient = id;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setAge(int x)
    {
        this.age = x;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String unNom)
    {
        this.nom = unNom;
    }
    
    public ArrayList getComptes() {
        return this.comptes;
    }

    public void setComptes(ArrayList lescomptes) {
        this.comptes = lescomptes;
    } 
    
    //Virement de l'argent du premier compte au deuxième compte
    public void virment( double montant)
    {
    		Compte compte1=null, compte2=null;
    		compte1 = (Compte) comptes.get(0);
    		compte2 = (Compte) comptes.get(1);
    		compte1.retirerArgent(montant);
    		compte2.deposerArgent(montant);
    }
    
}
