# TP 2 [BaseTP2Resto] On se fait un « resto » à la maison ?

Cette application console permet de prendre **plusieurs commandes de menus** pour un restaurant. Pour chaque menu, l’utilisateur choisit une **entrée**, un **plat**, un **accompagnement**, une **boisson** et un **dessert** parmi des listes stockées dans des `HashMap`. À la fin de chaque menu, le programme affiche un **récapitulatif** en filtrant les éléments “aucun/aucune”.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Fonctionnalités](#fonctionnalités)
- [Structure-du-code](#structure-du-code)

## Installation

1. Ayez **Java (JDK 8+)** installé.
2. Créez un fichier `Restaurant.java`.
3. Collez le code de l’application.
4. Compilez :

   ```bash
   javac Restaurant.java
    ```

5. Exécutez :

   ```bash
   java Restaurant
   ```

## Utilisation

1. Au lancement, le programme demande :

   ```text
   Bonjour combien de menus souhaitez-vous
   ```

   → entrez un nombre entier (ex. `3`).

2. Pour **chaque** menu, le programme affiche les différents choix (sous forme `[numéro - PLAT]`) et vous demande de saisir le **numéro** correspondant :

   * choix entrée
   * choix plat
   * choix accompagnement
   * choix boisson
   * choix dessert

   Exemple visuel pour les boissons :

   ```text
   [1 - EAU PLATE][2 - EAU GAZEUZE][3 - SODA][4 - VIN][5 - AUCUNE]
   3
   ```

3. À la fin du menu, le programme affiche le récapitulatif **sans** les éléments “aucun/aucune”, par exemple :

   ```text
   Résumé de la commande 1
   [salade, poulet, riz, eau plate, tarte maison]
   ```

4. Le programme recommence jusqu’à avoir saisi **tous les menus** demandés, puis se termine.



## Fonctionnalités

* ✅ Menus stockés dans des **`HashMap<Integer, String>`**
* ✅ Affichage formaté de chaque menu (méthode `displayMenu(...)`)
* ✅ Boucle sur **N commandes**
* ✅ Récapitulatif **filtré** (on n’affiche pas “aucun/aucune”)
* ✅ Gestion de 5 familles de choix :

  * entrées
  * plats
  * accompagnements
  * boissons
  * desserts
* ✅ Fermeture du `Scanner` à la fin


## Structure du code

* **`public class Restaurant`**

  * **`main(String[] args)`** : point d’entrée

    * création des 5 `HashMap` (entrées, plats, accompagnements, boissons, desserts)
    * création du `Scanner`
    * demande du **nombre de menus**
    * boucle `while (counter < nbMenus)` :

      1. affiche le numéro de commande
      2. affiche le menu demandé
      3. lit le choix utilisateur
      4. stocke les plats choisis dans un tableau `String[] order = new String[5];`
      5. affiche le récapitulatif

* **`displayMenu(HashMap<Integer, String> menu)`**

  * parcourt les entrées du `HashMap`
  * affiche chaque élément au format :

    ```text
    [1 - PLAT]
    ```
  * ajoute un retour ligne à la fin

* **Données**

  * les menus sont **codés en dur** dans le programme
  * les clés sont **des entiers** (1, 2, 3, …)
  * les valeurs sont **des chaînes** (“salade”, “pâtes”, “tiramisu”, …)

