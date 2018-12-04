package CucumberJoueur.TP3;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PaiementBilletTest extends TestCase {

	private BilletClassic  classic = new BilletClassic();
	private BilletVip      vip     = new BilletVip()    ;
	private PaiementBillet billet  = new PaiementBillet();
	
	public PaiementBilletTest( String testName )
	    {
	        super( testName );
	    }
    
	public static Test suite()
	    {
	        return new TestSuite( PaiementBilletTest.class );
	    }
	
	   public void testAcheterBillet()
	    {
		   assertTrue( billet.acheterBillet(classic)==50);
		   assertTrue( billet.acheterBillet(vip)==145);
	    }
}
