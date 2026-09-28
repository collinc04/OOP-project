public class grocery_management {
  public static void main(String[] args) {
    //variables to store items
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

    //Sample items
    itemNames[0] = "Tomatoes";
    itemPrices[0] = 2.49;
    itemStocks[0] = 10;

    itemNames[1] = "Onions";
    itemPrices[1] = 1.99;
    itemStocks[1] = 8;

    itemNames[2] = "Eggs";
    itemPrices[2] = 5.25;
    itemStocks[2] = 12;

    //TASK 3
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
