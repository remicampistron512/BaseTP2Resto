import java.util.List;

/**
 * Classe représentant une commande (Order).
 * Une commande possède :
 * - un identifiant (id)
 * - un montant total (totalPrice)
 * - une liste de plats (listOfDishes)
 */
public class Order {
	// Identifiant unique de la commande
	int id;

	// Montant total de la commande (somme des prix des plats)
	double totalPrice;

	// Liste des plats composant la commande
	List<Dish> listOfDishes;

	/**
	 * Constructeur : initialise une commande avec son id, son total initial et sa liste de plats.
	 * @param id identifiant de la commande
	 * @param totalPrice total initial (souvent 0 au départ)
	 * @param listOfDishes liste des plats associés à la commande
	 */
	public Order(int id, double totalPrice, List<Dish> listOfDishes) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.listOfDishes = listOfDishes;
	}

	// Getter : retourne l'id de la commande
	public int getId() {
		return id;
	}

	// Setter : modifie l'id de la commande
	public void setId(int id) {
		this.id = id;
	}

	// Getter : retourne le total de la commande
	public double getTotalPrice() {
		return totalPrice;
	}

	// Setter : modifie le total de la commande
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	// Getter : retourne la liste des plats de la commande
	public List<Dish> getListOfDishes() {
		return listOfDishes;
	}

	// Setter : modifie la liste des plats de la commande
	public void setListOfDishes(List<Dish> listOfDishes) {
		this.listOfDishes = listOfDishes;
	}

	/**
	 * Ajoute un plat à la commande.
	 * @param dish plat à ajouter
	 */
	public void addDishToOrder(Dish dish) {
		this.listOfDishes.add(dish);
	}

	/**
	 * Calcule (ou plutôt additionne) le total de la commande en ajoutant
	 * le prix de chaque plat contenu dans la liste listOfDishes.
	 * Remarque : cette méthode additionne au totalPrice actuel.
	 */
	public void calculateTotalPrice() {		
		for (Dish entry : this.listOfDishes) {
			this.totalPrice += entry.getPrice();
		}		
	}
}
