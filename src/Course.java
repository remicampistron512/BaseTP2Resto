import java.util.List;

public class Course {
	// Nom du menu / de la catégorie (ex : "Entrées", "Plats", "Boissons", etc.)
	String name;

	// Identifiant du menu / de la catégorie (ex : 0, 1, 2, ...)
	int id;

	// Liste des plats (Dish) appartenant à cette catégorie
	List<Dish> listOfDishes;

	/**
	 * Constructeur : initialise une catégorie de menu (Course) avec un id, un nom et une liste de plats.
	 * @param id identifiant de la catégorie
	 * @param name nom de la catégorie (ex : "Entrées")
	 * @param listOfDishes liste des plats associés à cette catégorie
	 */
	public Course(int id,String name, List<Dish> listOfDishes) {
		super();
		this.name = name;
		this.id = id;
		this.listOfDishes = listOfDishes;
	}

	// Getter : retourne le nom de la catégorie
	public String getName() {
		return name;
	}

	// Setter : modifie le nom de la catégorie
	public void setName(String name) {
		this.name = name;
	}

	// Getter : retourne la liste des plats de la catégorie
	public List<Dish> getListOfDishes() {
		return listOfDishes;
	}

	// Setter : modifie la liste des plats de la catégorie
	public void setListOfDishes(List<Dish> listOfDishes) {
		this.listOfDishes = listOfDishes;
	}

	/**
	 * Ajoute un plat à la catégorie (Course).
	 * @param dish plat à ajouter
	 */
	public void addDishToCourse(Dish dish) {
		this.listOfDishes.add(dish);
	}

	// Getter : retourne l'id de la catégorie
	public int getId() {
		return id;
	}

	// Setter : modifie l'id de la catégorie
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retourne le nom d'un plat à partir de son id.
	 * Parcourt la liste des plats et renvoie le nom du plat correspondant.
	 * @param id identifiant du plat recherché
	 * @return le nom du plat si trouvé, sinon null
	 */
	public String getDishNameById(int id) {
	    for (Dish d : listOfDishes) {
	        if (d.getId() == id) return d.getName();
	    }
	    return null;
	}

	/**
	 * Retourne le prix d'un plat à partir de son id.
	 * Parcourt la liste des plats et renvoie le prix du plat correspondant.
	 * @param id identifiant du plat recherché
	 * @return le prix du plat si trouvé, sinon null
	 */
	public Double getDishPriceById(int id) {
	    for (Dish d : listOfDishes) {
	        if (d.getId() == id) return d.getPrice();
	    }
	    return null;
	}

	/**
	 * Retourne l'objet Dish correspondant à l'id donné.
	 * @param id identifiant du plat recherché
	 * @return l'objet Dish si trouvé, sinon null
	 */
	public Dish getDishById(int id) {
		for (Dish d : listOfDishes) {
	        if (d.getId() == id) return d;
	    }
		return null;
	}
}
