package CucumberJoueur.TP3;

public class Enfant {
	
	private String nomEnfant;
	private Princesse mere;
	private Prince pere;
	private int age;

	public Princesse getMere() {
		return mere;
	}

	public void setMere(Princesse mere) {
		this.mere = mere;
	}

	public Prince getPere() {
		return pere;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		try
		{
		   if(age < 0) throw new IllegalArgumentException();
		   this.age = age;
		   
		 }catch(IllegalArgumentException e){
			 
			System.err.println("L'age doit ête positif ");
		}
	}

	public void setPere(Prince pere) {
		this.pere = pere;
	}

	public String getNomEnfant() {
		return nomEnfant;
	}

	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}

	 @Override
	public boolean equals(Object objet)
	  {
	        if (objet == null) return false;
	        if (objet == this) return true;
	        if (!(objet instanceof Enfant))return false;
	        Enfant kirikou = (Enfant)objet;
	        return kirikou.getNomEnfant().equals(this.getNomEnfant());
	  }
	 
	public Enfant() {
		 
	}
	 
	public Enfant(String nomEnfant, Princesse mere, Prince pere) {
 
		this.nomEnfant = nomEnfant;
		this.mere = mere;
		this.pere = pere;
		pere.ajouterUnEnfant(this);
		mere.ajouterUnEnfant(this);
	}
	
	

}