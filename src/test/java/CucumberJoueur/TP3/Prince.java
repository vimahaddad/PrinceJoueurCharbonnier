package CucumberJoueur.TP3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prince implements Observateur{

	    private String nom;
	    private Princesse marieA;
	    public boolean estMarie = false; 
		private List<Enfant> enfants;
		
	    public String getNom() {
			return nom;
		}
	    
		public void setNom(String nom) {
			this.nom = nom;
		}
    
		public void ajouterUnEnfant(Enfant toto)
		{
			enfants.add(toto);
		}
		
		public Princesse getMarieA() {
			return marieA;
		}
	 	
		public boolean EstMarie() {
			return estMarie;
		}

		public void setEstMarie(boolean estMarie) {
			this.estMarie = estMarie;
		}

	    /**
	     * Constructeur d'objets de classe Prince
	     */
	    
	    public Prince(String nom)
	    {
	        // initialisation des variables d'instance
	        this.nom = nom;
	        enfants  = new ArrayList<Enfant>();
	    }
	     
	    public void embrasse(Princesse blancheNeige)
	    {
	    	blancheNeige.seReveille();
	    }
	    public void seMarieA(Princesse blancheNeige)
	    {
	    	if(blancheNeige.EstMariee() || this.estMarie)
	        {
	    		blancheNeige.divorcer();
	    		this.divorcer();
	    	 }
	    	marieA   = blancheNeige;
	    	estMarie = true;
	    	blancheNeige.setEstMariee(true);
	    }
	    
	    public void divorcer()
	    {
	    	 marieA.setEstMariee(false);	
	    	 marieA=null;
	    	 estMarie=false;
	    }
	       
	    public void seMarierAvec(Princesse blancheNeige)
	    {
	    	// On teste d'abord si n'est pas deja� marie
	    	if(this.estMarie || blancheNeige.EstMariee())
	    	{
	    		this.divorcer();
	    		blancheNeige.divorcer();
	    		
	    	}
	    	marieA = blancheNeige;
	    	this.estMarie=true;
	    	blancheNeige.setEstMariee(true);
	    }
	     
	    @Override
	    public boolean equals(Object objet)
	    {
	        if (objet == null) return false;
	        if (objet == this) return true;
	        if (!(objet instanceof Prince))return false;
	        Prince prince = (Prince)objet;
	        return prince.getNom().equals(this.getNom());
	    }
	    
		@Override
		public void actualiser(Match match) {
			// TODO Auto-generated method stub
	        System.out.println("Visualisé par : "+this.nom+ " La date du match : "+match.getDateMatch()+"  Les deux équipes : "+match.getEquipe1()+" et "+match.getEquipe2());

		}
	      
}
