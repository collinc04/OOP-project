public class grocery_management {
  public static void main(String[] args) {
    //variables to store items
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

    //TASK 3
    Scanner scanner = new Scanner(System.in);

    while (true) {
      //display menu
      System.out.println("\nGrocery Management System");
      System.out.println("1. View Inventory");
      System.out.println("2. Restock Item");
      System.out.println("3. Exit");
      System.out.print("Enter choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine();
      
      //View Inventory
      if (choice ==1){
        printInventory(itemsNames, itemPrices, itemStocks);
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
