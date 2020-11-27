package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plongeur extends Personne {
    //Attributs
    public int niveau; 
    ArrayList <Licence> licences = new ArrayList<>();

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public ArrayList<Licence> getLicences() {
        return licences;
    }

    public void setLicences(ArrayList<Licence> licences) {
        this.licences = licences;
    }
    
    //Constructeur 
    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int niveau) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
    }
    
    //Methode pour ajouter une licence 
    public void ajouteLicence(String numero, LocalDate delivrance, Club club){
        Licence l = new Licence(this, numero, delivrance, niveau, club);
        licences.add(l);
    }
    
    
	
}
