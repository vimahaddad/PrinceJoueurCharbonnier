package CucumberJoueur.TP3;

import java.util.ArrayList;
import java.util.Date;

public class Match implements Observable {

	private Equipe equipe1;
	private Equipe equipe2;
	private Date dateMatch;
    private ArrayList tabObservateur;// Tableau d'observateurs.
	
	public Match()
	{
		equipe1=null;
		equipe2=null;
		dateMatch=null;
		tabObservateur=new ArrayList();
		
	}
	@Override
	public void ajouterObservateur(Observateur o) {
		// TODO Auto-generated method stub
		tabObservateur.add(o);
	}

	@Override
	public void supprimerObservateur(Observateur o) {
		// TODO Auto-generated method stub
		tabObservateur.remove(o);
	}

	@Override
	public void notifierObservateurs() {
		// TODO Auto-generated method stub
		 for(int i=0;i<tabObservateur.size();i++)
         {
                 Observateur o = (Observateur) tabObservateur.get(i);
                 o.actualiser(this);// On utilise la méthode "tiré".
         }
	}
	
	// Méthode qui permet de mettre à jour de façon artificielle le GPS.
    // Dans un cas réel, on utiliserait les valeurs retournées par les capteurs.
    public void setMesures(Equipe equipe1, Equipe equipe2, Date dateMatch)
    {
            this.equipe1=equipe1;
            this.equipe2=equipe2;
            this.dateMatch=dateMatch;
            notifierObservateurs();
    }
    
    
	public Equipe getEquipe1() {
		return equipe1;
	}
	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}
	public Equipe getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}
	public Date getDateMatch() {
		return dateMatch;
	}
	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}
	
	

}