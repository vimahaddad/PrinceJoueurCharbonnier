package CucumberJoueur.TP3;

public class Chabonnier implements Observateur{

	public String nom ;
	public int charbon ;
	public String etat ;
	private int nombreHeuredispo;
	private int etat2;


	public Chabonnier(String nomCharbonnier) {

		this.nom  = nomCharbonnier;
		this.etat = "bonne santé" ;
	}

	public String AppelleNom(){
		return "Je m'appelle " + this.nom + "";  
	}

	public String EtreAffecte(Mine p){

		if(this.etat == "Content") {
			this.etat = "Affecte " + p.getName() + " .";
			this.etat2 = 1;
			return this.etat;
		}else {
			this.etat2 = 0;
			this.etat = "Pas Content";
			return etat; 
		}
	}

	public int Travailler(Mine p) {	
		if(etat2 == 1) {
			this.charbon = this.charbon + 10;
			this.nombreHeuredispo = this.nombreHeuredispo - 14;
			this.etat2 = 2;
			return this.charbon;
		}else {
			return this.charbon ;

		}
	}

	public String Pause() {
		if(etat2 == 2) {
			this.etat2 = 0;
			return etat = "Content";
		}else {
			return etat;
		}
	}

	public String getnom(){
		return nom;
	}

	public int getCharbon() {
		return charbon;
	}

	public void setCharbon(int charbon) {
		this.charbon = charbon;
	}

	public int getNombreHeuredispo() {
		return nombreHeuredispo;
	}

	public void setNombreHeuredispo(int nombreHeuredispo) {
		this.nombreHeuredispo = nombreHeuredispo;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public int getEtat2() {
		return this.etat2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setEtat2(int etat2) {
		this.etat2 = etat2;
	}

	@Override
	public void actualiser(Match match) {
		// TODO Auto-generated method stub
		System.out.println("La date du match : "+match.getDateMatch()+"  Les deux équipes : "+match.getEquipe1()+" et "+match.getEquipe2());

	}

}
