import java.util.Scanner;
/**
 * Represents a grocery management system that stores grocery item
 * names, prices, and stock quantities using parallel arrays.
 * The program allows users to view the current inventory, restock
 * existing items, search for items, and exit the program.
 *
 * @author Sagar Neupane
 */
public class grocery_management {
  /**
   * Main initializes arrays for item names, prices, and stocks
   * it then displays a menu that allows the user to see inventory,
   * restock items, or exit. 
   * 
   * @param args command line arguments, not used 
   */
  public static void main(String[] args) {
    //variables to store items
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

    //test values
    itemNames[0] = "Milk";
    itemNames[1] = "Eggs";
    itemNames[2] = "Sugar";
    itemNames[3] = "Bread";
    itemPrices[0] = 33.99;
    itemPrices[1] = 50.99;
    itemPrices[2] = 5.00;
    itemPrices[3] = 3.00;
    itemStocks[0] = 5;
    itemStocks[1] = 5;
    itemStocks[2] = 5;
    itemStocks[3] = 5;


    //TASK 3 (Kerry)
    Scanner keyboard = new Scanner(System.in);

    while (true){
      System.out.println("\n--Menu--");
      System.out.println("1: View Inventory");
      System.out.println("2: Restock Item");
      System.out.println("3: Exit");
      System.out.print("Choose a menu option: ");

      int choice = keyboard.nextInt();
      System.out.println("\n");
      if (choice == 1){
        printInventory(itemNames, itemPrices, itemStocks);
      }else if (choice == 2){
        keyboard.nextLine();//used to cleare the leftover newline
        System.out.print("Enter the name of the item being restocked: ");
        String itemRestocked = keyboard.nextLine();
        System.out.print("How many are being added: ");
        int amountAdded = keyboard.nextInt();
        System.out.println("\n");
        
        restockItem(itemNames, itemStocks, itemRestocked, amountAdded);
      }else if (choice == 3) {
        keyboard.nextLine();//clear leftover new line
        System.out.println("Exiting menu");
        break;
      } else{ //not in the menu
        System.out.println("That is not a valid menu option. ");
      }
    }  
  }
  

  //TASK 1 (COLLIN)
  /**
   * Prints the inventory of the items in the grocery store.
   * @param names Array of item names.
   * @param prices Array of item prices.
   * @param stocks Array of item stocks.
   */
  public static void printInventory(String[] names, double[] prices, int[] stocks) {
    //cycle names
    System.out.println("Name | Price | Stock");
    for(int i = 0; i < names.length; i++) {
      //check null
      if(names[i] != null) {
        //print all the info
        System.out.println(names[i] + " | " + prices[i] + " | " + stocks[i]);
      }
    }
  }

  //TASK 2 (Samipya)
    /**
   * Adds stock to an existing item by searching for its name.
   * Prints "Item not found." if no item matches the target name.
   * @param names Array of item names.
   * @param stocks Array of item stocks.
   * @param target The name of the item to restock.
   * @param amount The quantity to add to the item's current stock.
   */
  public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    boolean found = false;

    //cycle names
    for (int i = 0; i < names.length; i++) {
      //check null first so equals() doesn't crash on empty slots
      if (names[i] != null && names[i].equals(target)) {
        stocks[i] += amount;
        found = true;
        break;
      }
    }

    //only report failure after checking the whole array
    if (!found) {
      System.out.println("Item not found.");
    }
  }

  /*
  Boilerplate by Collin Cook
  */
}
