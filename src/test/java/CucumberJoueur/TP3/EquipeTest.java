package CucumberJoueur.TP3;

import java.util.Iterator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
 

public class EquipeTest extends TestCase  {
	
	
	 
	public EquipeTest( String testName )
	    {
	        super( testName );
	
	    }
    
	public static Test suite()
	    {
	        return new TestSuite( EquipeTest.class );
	    }
	
	   public void testHasNext()
	    {
		   Equipe equipe  = new Equipe("semasso");
		   Joueur ronaldo = new Joueur("Ronaldo");
		          equipe.add(ronaldo);
		   assertTrue(equipe.hasNext());
	    }
	   
	   public void testnext() {
		   Equipe equipe  = new Equipe("semasso");
		   Joueur ronaldo = new Joueur("Ronaldo");  
	       for (Iterator<Joueur> iterator = equipe.getIterator(); iterator.hasNext();) {
	    	   equipe.add(ronaldo);
	    	   Joueur esRenado = iterator.next();
		       assertTrue(esRenado.getNom().equals("Ronaldo"));
	       }
	   }
}
