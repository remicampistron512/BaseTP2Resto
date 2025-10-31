import java.util.*;

public class Restaurant {
	public static void main(String[] args) {
		
		// Les hashmaps contenant les différents menus
		HashMap<Integer, String> starters = new HashMap<>();
        starters.put(1, "salade");
        starters.put(2, "soupe");
        starters.put(3, "quiche");
        starters.put(4, "aucune");

        HashMap<Integer, String> mainDishes = new HashMap<>();
        mainDishes.put(1, "poulet");
        mainDishes.put(2, "boeuf");
        mainDishes.put(3, "poisson");
        mainDishes.put(4, "végétarien");
        mainDishes.put(5, "vegan");
        mainDishes.put(6, "aucun");

        HashMap<Integer, String> sideDishes = new HashMap<>();
        sideDishes.put(1, "riz");
        sideDishes.put(2, "pâtes");
        sideDishes.put(3, "frites");
        sideDishes.put(4, "légumes");
        sideDishes.put(5, "aucun");

        HashMap<Integer, String> beverages = new HashMap<>();
        beverages.put(1, "eau plate");
        beverages.put(2, "eau gazeuze");
        beverages.put(3, "soda");
        beverages.put(4, "vin");
        beverages.put(5, "aucune");

        HashMap<Integer, String> desserts = new HashMap<>();
        desserts.put(1, "tarte maison");
        desserts.put(2, "mousse au chocolat");
        desserts.put(3, "tiramisu");
        desserts.put(4, "aucun");

        
        Scanner scan = new Scanner(System.in);
        boolean choice = true;
        
    	System.out.println("Bonjour combien de menus souhaitez-vous ");
    	int nbMenus = scan.nextInt();
    	int counter = 0;
    	
        while (counter<nbMenus) {
        	counter ++;
        	
        	System.out.println("Commande numéro "+ counter);
        	
        	System.out.println("Choix entrée");
        	displayMenu(starters);
        	int starterChoice = scan.nextInt();
        	
        	System.out.println("Choix plats");
        	displayMenu(mainDishes);
        	int mainDishesChoice = scan.nextInt();
        	
        	System.out.println("Choix accompagnements");
        	displayMenu(sideDishes);
        	int sideDishesChoice = scan.nextInt();
        	
        	System.out.println("Choix plats");
        	displayMenu(beverages);
        	int beveragesChoice = scan.nextInt();
        	
        	System.out.println("Choix plats");
        	displayMenu(desserts);
        	int dessertsChoice = scan.nextInt();
        	
        	String [] order = new String[5];
        	System.out.println("Résumé de la commande " + counter);
        	// Récupère le nom du plat pour l'insérer dans notre commande
        	order[0] = starters.get(starterChoice);
        	order[1] = mainDishes.get(mainDishesChoice);
        	order[2] = sideDishes.get(sideDishesChoice);
        	order[3] = beverages.get(beveragesChoice);
        	order[4] = desserts.get(dessertsChoice);
        	
        	//affiche la commande
        	System.out.print("[");
        	for (int i = 0; i<order.length;i++) {
        		if(!order[i].equalsIgnoreCase("aucun") && !order[i].equalsIgnoreCase("aucune") ) {
        			if(i!=0) {
        				System.out.print(" ");
        			}
        			
        			System.out.print(order[i]);
        			if(i<order.length-1) {
        				System.out.print(",");
        			}
        		}        		
        	}
        	System.out.print("]");
        	System.out.println("");
        }
        scan.close();
	}
	/**
	 * Affiche un menu de plats
	 * @param menu
	 */
	private static void displayMenu(HashMap<Integer, String> menu) {
		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.print("[" + key + " - " + value.toUpperCase() + "]");
		   
		}
		 System.out.println("");
	}
}
