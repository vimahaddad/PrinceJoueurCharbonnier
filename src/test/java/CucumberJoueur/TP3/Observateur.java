package CucumberJoueur.TP3;

import java.util.Observable;

public interface Observateur {
	
	//méthode appelée automatiquement lorsqu'un nouveau match est annoncé 
	public void actualiser(Match match);

}