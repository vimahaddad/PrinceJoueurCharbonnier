package CucumberJoueur.TP3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class Stepdefs {
	private Joueur umtiti;
	private Joueur mbappe;
	private Equipe france;
	private Equipe cameroun;
	private Equipe suisse;
	private Prince charmant;
	private PaiementBillet billetPrince;
	private BilletVip vip;
//	private Charbonnier max;
	
	@Given("^la création de Umtiti qui appartient de cameroun$")
	public void la_création_de_Umtiti_qui_appartient_de_cameroun(){
		cameroun = new Equipe("Equipe de Cameroun",1955,new ArrayList<>());
		umtiti = new Joueur(7,"Umtiti",cameroun);
	}

	@When("^le manager valide le transfert du Umtiti de cameroun à france$")
	public void le_manager_valide_le_transfert_du_Umtiti_de_cameroun_à_france(){
		france = new Equipe("Equipe de France",1904,new ArrayList<Joueur>());
		umtiti.transferJoueur(france);
	}

	@Then("^l'équipe de joueur après le transfert sera france$")
	public void l_équipe_de_joueur_après_le_transfert_sera_france(){
		assertEquals(france, umtiti.getEquipe());
	}
	
	@Given("^la création de Mbappe qui appartient de suisse$")
	public void la_création_de_Mbappe_qui_appartient_de_suisse() throws Exception {
		mbappe = new Joueur(10,"Mbappé",cameroun);
	}

	@When("^le manager valide le transfert du Mbappe qui n’est pas dans suisse à france$")
	public void le_manager_valide_le_transfert_du_Mbappe_qui_n_est_pas_dans_suisse_à_france() throws Exception {
		//mbappe.transferJoueur(suisse);
	}

	@Then("^le système refuse le transfert avec un \"([^\"]*)\"$")
	public void le_système_refuse_le_transfert_avec_un(String arg1) throws Exception {
		assertEquals(suisse,mbappe.getEquipe());
	}

	@Given("^la création du Charmant$")
	public void la_création_du_Charmant(){
		charmant = new Prince("Charmant");
	}

	@When("^le Charmant demander de réserver un true$")
	public void le_Charmant_demander_de_réserver_un_true() throws Exception {
		billetPrince = new PaiementBillet();
	    vip = new BilletVip();
		
	}

	@Then("^la réservation doit etre confirmé par un \"([^\"]*)\"$")
	public void la_réservation_doit_etre_confirmé_par_un(String arg1) throws Exception {
		assertTrue(billetPrince.acheterBillet(vip)==150);
	}
	
	@Given("^la création du max$")
	public void la_création_du_max() {
//	    max = new Charbonnier("Max");
	}

	@When("^max demander de réserver un true$")
	public void max_demander_de_réserver_un_true() {
//		billet = new BilletVIP();
	}

	@Then("^son réservation doit etre confirmé par un \"([^\"]*)\"$")
	public void son_réservation_doit_etre_confirmé_par_un(String arg1) {
//		assertEquals("Vous n'avez pas le droit d'acheter un billet VIP", billet.acheterTicket(max));

	}

	
}