package CucumberJoueur.TP3;

//Interface implementée par toutes les classes souhaitant avoir des observateurs à leur écoute

public interface Observable {
	//Méthode permettant d'ajouter un  observateur
	public void ajouterObservateur(Observateur o);
	
	// Supprimer un observateur
	public void supprimerObservateur(Observateur o);
	
	// Méthode qui permet de prévenir les observateurs lors d'un changement d'état
	public void notifierObservateurs();

}