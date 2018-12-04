package CucumberJoueur.TP3;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MementoEscouadeTest extends TestCase {

	private Escouade escouade;
	private MementoEscouade mementoEscouade;
	
	public MementoEscouadeTest( String testName )
    {
        super( testName );
        
    }

   public static Test suite() {
	   
        return new TestSuite( MementoEscouadeTest.class );
    }
   
   public void testrecupererEtatEscouade() {
	   escouade         = new Escouade("For Test");
	   mementoEscouade  = new MementoEscouade(escouade);
	   assertTrue(escouade.nomEscouade.equals(mementoEscouade.recupererEtatEscouade().nomEscouade));
   }
   
}
