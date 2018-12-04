package CucumberJoueur.TP3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EscouadeTest  extends TestCase {

	private Escouade escouade;
	private MementoEscouade mementoEscouade;
	
	public EscouadeTest( String testName )
    {
        super( testName );
        escouade=new Escouade("For Test");
    }

   public static Test suite() {
	   
        return new TestSuite( EscouadeTest.class );
    }
   
   public void testrestorerEtat() {
	   Chabonnier ali    = new Chabonnier("ali");
	   Chabonnier sadiq  = new Chabonnier("sadiq");
	   escouade.add(ali);
	   escouade.add(sadiq);
	   MementoEscouade firstMemomento = escouade.sauvegMomentoEscouade(new MementoEscouade());
	   escouade.remove();
	   assertTrue(escouade.getListCharbonnierEscouade().size()==0);
	   escouade.restorerEtat(firstMemomento);
	   assertTrue(firstMemomento.getEscouade().getListCharbonnierEscouade().size()==2);
   }
   
   public void testSauvegMomentoEscouade() {
	   Chabonnier alio    = new Chabonnier("alio");
	   Chabonnier sadiqo  = new Chabonnier("sadiqo");
	   escouade.add(alio);
	   escouade.add(sadiqo);
	   MementoEscouade mementoEscouade = escouade.sauvegMomentoEscouade(new MementoEscouade());
	   assertTrue(mementoEscouade.getEscouade().getListCharbonnierEscouade().size()==2);
	              
   }
}
