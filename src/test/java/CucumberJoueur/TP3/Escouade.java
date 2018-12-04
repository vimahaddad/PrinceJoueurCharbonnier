package CucumberJoueur.TP3;

import java.text.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
 
public class Escouade {
	
	public  String           nomEscouade;
	public  List<Chabonnier> listAffectee;
	public  String           dateAffectation;
	
	public Escouade(String nomEscouade) {
		
		this.nomEscouade      = nomEscouade ;
		this.listAffectee     = new ArrayList<Chabonnier>();	
		Calendar cal          = Calendar.getInstance();
	    Date     date         = cal.getTime();
	    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		this.dateAffectation  = dateFormat.format(date);
	}
	
	public void add(Chabonnier chabonnier)
	{
		listAffectee.add(chabonnier);
	}
 
	public void restorerEtat(MementoEscouade m)  {
		Escouade escouade = m.recupererEtatEscouade();
		nomEscouade       = escouade.nomEscouade;
		listAffectee.clear();
		listAffectee      = escouade.listAffectee;
		dateAffectation   = escouade.dateAffectation;
		
	}
	public MementoEscouade sauvegMomentoEscouade(MementoEscouade m) {
		
		Escouade escouade        = new  Escouade(this.nomEscouade);
        escouade.dateAffectation = this.dateAffectation;
        
        for (Chabonnier chabonnier : listAffectee) {
			escouade.add(chabonnier);
		}
		return new MementoEscouade(escouade);
	}
	
	public List<Chabonnier> getListCharbonnierEscouade(){
		
		return Collections.unmodifiableList(listAffectee);
	}

	public void remove() {
		
		listAffectee.clear();
	}
	
}
