public class Dish {
	// Nom du plat (ex : "Salade", "Poulet", "Eau plate", etc.)
	String name;

	// Prix du plat
	double price;

	// Identifiant du plat (utilisé pour le choix dans les menus)
	int id;

	/**
	 * Constructeur : initialise un plat avec son id, son nom et son prix.
	 * @param id identifiant du plat
	 * @param name nom du plat
	 * @param price prix du plat
	 */
	public Dish(int id,String name, double price) {
		super();
		this.id = id;
		this.name = name;		
		this.price = price;
	}

	// Getter : retourne le nom du plat
	public String getName() {
		return name;
	}

	// Setter : modifie le nom du plat
	public void setName(String name) {
		this.name = name;
	}

	// Getter : retourne le prix du plat
	public double getPrice() {
		return price;
	}

	// Setter : modifie le prix du plat
	public void setPrice(double price) {
		this.price = price;
	}

	// Getter : retourne l'id du plat
	public int getId() {
		return id;
	}

	// Setter : modifie l'id du plat
	public void setId(int id) {
		this.id = id;
	}
}
