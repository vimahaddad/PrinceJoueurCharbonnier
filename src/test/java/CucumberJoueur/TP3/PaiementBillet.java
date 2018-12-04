package CucumberJoueur.TP3;

public class PaiementBillet {

	public double acheterBillet(TypeBillet typeBillet) {
		return typeBillet.calculCoutBillet();
	}
	
	public static void main(String[] args)
	{
		BilletClassic  classic = new BilletClassic();
		BilletVip      vip     = new BilletVip()    ;
		PaiementBillet billet  = new PaiementBillet();
		System.out.println(" ------------------------------------ ");  
		System.out.println("|         Test Pattern Strategy      |");
		System.out.println(" ------------------------------------ ");  
		System.out.println("");
		System.out.println("        "+billet.acheterBillet(classic));
		System.out.println("");
		System.out.println("        "+billet.acheterBillet(vip));
		System.out.println("");
	}
}
