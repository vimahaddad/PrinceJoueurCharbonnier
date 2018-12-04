package CucumberJoueur.TP3;

public class Mine {
	
	// variables d'instance - remplacez l'exemple qui suit par le v�tre
    private String name;
    private int capacity =0;

    /**
     * Constructeur d'objets de classe Mine
     */
    public Mine(String name)
    {
        this.name = name;
     
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


    

}