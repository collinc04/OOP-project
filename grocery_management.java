import java.util.Scanner;

public class grocery_management {
  /**
   * Main initializes arrays for item names, prives, and stocks
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

    //TASK 3 (Kerry)
    Scanner keyboard = new Scanner(System.in);

    while (true){
      System.out.println("\n--Menu--");
      System.out.println("1: View Inventory");
      System.out.println("2: Restock Item");
      System.out.println("3: Exit");
      System.out.println("Choose a menu option: ");

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
      }else if (choice == 3){
        System.out.println("Exiting menu");
        break;
      }else{
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
    for(int i = 0; i < names.length; i++) {
      //check null
      if(names[i] != null) {
        //print all the info
        System.out.println(names[i] + " " + prices[i] + " " + stocks[i]);
      }
    }
  }

  //TASK 2
  /**
   * TODO
   * @param names
   * @param stocks
   * @param target
   * @param amount
   */
  public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    //TODO
  }

  /*
  Boilerplate by Collin Cook
  */
}
