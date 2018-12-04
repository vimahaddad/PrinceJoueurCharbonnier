package CucumberJoueur.TP3;

public class MementoEscouade {
	 
	private  Escouade escouade;
	
	public MementoEscouade() {
		
	}
	public MementoEscouade(Escouade escouade ) {
		
		this.escouade  = escouade;
	}

	public Escouade recupererEtatEscouade() {
		 return escouade;
	}
	public Escouade getEscouade() {
		return escouade;
	}
	public void setEscouade(Escouade escouade) {
		this.escouade = escouade;
	}
	

}

