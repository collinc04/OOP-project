public class grocery_management {
  public static void main(String[] args) {
    //variables to store items
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];


  }

  //TASK 1
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

  //TASK 3

  /*
  Boilerplate by Collin Cook
  */
}
