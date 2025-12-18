import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Restaurant {
	public static void main(String[] args) throws Exception {

		// ---------------- Entrées ----------------
		// Création de la liste des plats "Entrées" et instanciation du menu correspondant (Course)
		List<Dish> listOfStarters = new ArrayList<>();
		Course starters = new Course(0, "Entrées", listOfStarters);

		// Définition des plats disponibles pour les entrées
		Dish salad  = new Dish(1, "Salade", 5.0);
		Dish soup   = new Dish(2, "Soupe", 4.5);
		Dish quiche = new Dish(3, "Quiche", 6.0);
		Dish noStarter = new Dish(4, "Aucune", 0.0);

		// Ajout des plats au menu des entrées
		starters.addDishToCourse(salad);
		starters.addDishToCourse(soup);
		starters.addDishToCourse(quiche);
		starters.addDishToCourse(noStarter);

		// ---------------- Plats ----------------
		// Création de la liste des plats "Plats" et instanciation du menu correspondant (Course)
		List<Dish> listOfMainDishes = new ArrayList<>();
		Course mainDishes = new Course(1, "Plats", listOfMainDishes);

		// Définition des plats disponibles pour les plats principaux
		Dish chicken = new Dish(1, "Poulet", 12.0);
		Dish beef    = new Dish(2, "Boeuf", 14.0);
		Dish fish    = new Dish(3, "Poisson", 13.0);
		Dish vegetarian = new Dish(4, "Végétarien", 11.0);
		Dish vegan   = new Dish(5, "Vegan", 11.5);
		Dish noMain  = new Dish(6, "Aucun", 0.0);

		// Ajout des plats au menu des plats principaux
		mainDishes.addDishToCourse(chicken);
		mainDishes.addDishToCourse(beef);
		mainDishes.addDishToCourse(fish);
		mainDishes.addDishToCourse(vegetarian);
		mainDishes.addDishToCourse(vegan);
		mainDishes.addDishToCourse(noMain);

		// ---------------- Accompagnements ----------------
		// Création de la liste des plats "Accompagnements" et instanciation du menu correspondant (Course)
		List<Dish> listOfSideDishes = new ArrayList<>();
		Course sideDishes = new Course(2, "Accompagnements", listOfSideDishes);

		// Définition des plats disponibles pour les accompagnements
		Dish rice   = new Dish(1, "Riz", 3.0);
		Dish pasta  = new Dish(2, "Pâtes", 3.5);
		Dish fries  = new Dish(3, "Frites", 3.5);
		Dish veggies = new Dish(4, "Légumes", 3.0);
		Dish noSide = new Dish(5, "Aucun", 0.0);

		// Ajout des plats au menu des accompagnements
		sideDishes.addDishToCourse(rice);
		sideDishes.addDishToCourse(pasta);
		sideDishes.addDishToCourse(fries);
		sideDishes.addDishToCourse(veggies);
		sideDishes.addDishToCourse(noSide);

		// ---------------- Boissons ----------------
		// Création de la liste des plats "Boissons" et instanciation du menu correspondant (Course)
		List<Dish> listOfBeverages = new ArrayList<>();
		Course beverages = new Course(3, "Boissons", listOfBeverages);

		// Définition des boissons disponibles
		Dish stillWater = new Dish(1, "Eau plate", 1.5);
		Dish sparklingWater = new Dish(2, "Eau gazeuse", 2.0);
		Dish soda = new Dish(3, "Soda", 2.5);
		Dish wine = new Dish(4, "Vin", 4.0);
		Dish noDrink = new Dish(5, "Aucune", 0.0);

		// Ajout des boissons au menu des boissons
		beverages.addDishToCourse(stillWater);
		beverages.addDishToCourse(sparklingWater);
		beverages.addDishToCourse(soda);
		beverages.addDishToCourse(wine);
		beverages.addDishToCourse(noDrink);

		// ---------------- Desserts ----------------
		// Création de la liste des plats "Desserts" et instanciation du menu correspondant (Course)
		List<Dish> listOfDesserts = new ArrayList<>();
		Course desserts = new Course(4, "Desserts", listOfDesserts);

		// Définition des desserts disponibles
		Dish pie = new Dish(1, "Tarte maison", 5.5);
		Dish chocolateMousse = new Dish(2, "Mousse au chocolat", 5.0);
		Dish tiramisu = new Dish(3, "Tiramisu", 5.5);
		Dish noDessert = new Dish(4, "Aucun", 0.0);

		// Ajout des desserts au menu des desserts
		desserts.addDishToCourse(pie);
		desserts.addDishToCourse(chocolateMousse);
		desserts.addDishToCourse(tiramisu);
		desserts.addDishToCourse(noDessert);

		// Scanner pour lire les entrées utilisateur depuis la console
		Scanner scan = new Scanner(System.in);

		// Demande à l’utilisateur combien de menus/commandes il souhaite saisir
		System.out.println("Bonjour combien de menus souhaitez-vous ");
		int nbMenus = scan.nextInt();

		// Compteur de commandes saisies
		int counter = 0;

		// HashMap pour stocker toutes les commandes (clé = numéro de commande, valeur = objet Order)
		HashMap<Integer, Order> orders = new HashMap<>();

		// Boucle de saisie : on répète la création d’une commande nbMenus fois
		while (counter<nbMenus) {
			counter ++;

			// Liste des plats sélectionnés pour la commande en cours
			List<Dish> currentOrderDishesList = new ArrayList<>();

			// Création de la commande avec un id (= counter), un total initial à 0, et la liste de plats
			Order currentOrder = new Order(counter, 0, currentOrderDishesList);
			System.out.println("Commande numéro "+ counter);

			// Choix de l’entrée
			System.out.println("Choix entrée");
			displayMenu(starters);
			int starterChoice = scan.nextInt();

			// Choix du plat principal
			System.out.println("Choix plats");
			displayMenu(mainDishes);
			int mainDishesChoice = scan.nextInt();

			// Choix de l’accompagnement
			System.out.println("Choix accompagnements");
			displayMenu(sideDishes);
			int sideDishesChoice = scan.nextInt();

			// Choix de la boisson (le libellé affiche "Choix plats" mais c’est bien la section boissons)
			System.out.println("Choix plats");
			displayMenu(beverages);
			int beveragesChoice = scan.nextInt();

			// Choix du dessert
			System.out.println("Choix Desserts");
			displayMenu(desserts);
			int dessertsChoice = scan.nextInt();

			// Résumé de la commande dans la console
			System.out.println("Résumé de la commande " + counter);
			// Récupère le plat via son id (choisi par l’utilisateur) et l’ajoute à la commande

			currentOrder.addDishToOrder(starters.getDishById(starterChoice));
			currentOrder.addDishToOrder(mainDishes.getDishById(mainDishesChoice));
			currentOrder.addDishToOrder(sideDishes.getDishById(sideDishesChoice));
			currentOrder.addDishToOrder(beverages.getDishById(beveragesChoice));
			currentOrder.addDishToOrder(desserts.getDishById(dessertsChoice));

			// ---------------- Affichage de la commande ----------------
			// Récupère la liste de plats de la commande
			List<Dish> listOfDishes = currentOrder.getListOfDishes();

			// Calcule le prix total de la commande (supposé mettre à jour totalPrice)
			currentOrder.calculateTotalPrice();

			// Affiche chaque plat sélectionné (id, nom, prix)
			for (Dish entry : listOfDishes) {
				System.out.print(entry.getId() + " | " + entry.getName() + " | " + entry.getPrice() );
				System.out.println();
			}

			// Affiche le montant total de la commande (accès direct à currentOrder.totalPrice)
			System.out.println("Montant total de la commande " + currentOrder.totalPrice);

			// Ligne vide pour aérer l’affichage
			System.out.println("");

			// Stocke la commande dans la HashMap des commandes (clé = numéro de commande)
			orders.put(counter,currentOrder);
		}

		// Écrit toutes les commandes dans un fichier receipt.txt
		outPutOrdersToFile(orders);

		// Ferme le scanner (libère la ressource)
		scan.close();
	}

	/**
	 * Affiche un menu de plats
	 * @param menu
	 */
	private static void displayMenu(Course menu) {
		// Récupère la liste des plats associés à ce menu (Course)
		List<Dish> lisOfDishes = menu.getListOfDishes();

		// Affiche chaque plat sous la forme "id | nom | prix"
		for (Dish entry : lisOfDishes) {
			System.out.print(entry.getId() + " | " + entry.getName() + " | " + entry.getPrice() );
			System.out.println();
		}

	}

	public static void outPutOrdersToFile(HashMap<Integer, Order> orders) throws Exception {
	    // Ouverture d’un writer en UTF-8 vers le fichier receipt.txt
	    // try-with-resources : le writer sera automatiquement fermé à la fin du bloc
	    try (BufferedWriter w = new BufferedWriter(
	            new OutputStreamWriter(new FileOutputStream("receipt.txt"), StandardCharsets.UTF_8))) {

	    	// Variable pour cumuler le total de toutes les commandes
	    	double allOrdersPrice = 0;

	    	// Parcourt toutes les entrées de la HashMap (clé = id commande, valeur = Order)
	        for (Map.Entry<Integer, Order> orderEntry : orders.entrySet()) {
	            Integer key = orderEntry.getKey();      // numéro de commande
	            Order order = orderEntry.getValue();    // objet commande
	            List<Dish> listOfDishes = order.getListOfDishes(); // plats de la commande

	            // Ajoute une ligne vide avant chaque commande (mise en forme)
	            w.newLine();

	            // Écrit l’en-tête de la commande
	            w.write("résumé de la commande " + key);
	            w.newLine();

	            // Écrit le nom de chaque plat de la commande
	            for (Dish dish : listOfDishes) {
	                w.write(dish.getName());
	                w.newLine();
	            }

	            // Écrit le total de la commande dans le fichier
	            w.write("total de la commande " + key + " : " + order.getTotalPrice());

	            // Ajoute le total de cette commande au total global
	            allOrdersPrice += order.getTotalPrice();
	        }

	        // Écrit le total global de toutes les commandes
	        w.newLine();
	        w.write("total des commandes : " + allOrdersPrice);
	    }
	}
}
