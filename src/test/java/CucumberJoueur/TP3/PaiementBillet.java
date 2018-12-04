package CucumberJoueur.TP3;

public class PaiementBillet {

	public double acheterBillet(TypeBillet typeBillet) {
		return typeBillet.calculCoutBillet();
	}
}
