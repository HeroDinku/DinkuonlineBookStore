package Dinku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlineBookShop {

  static int totalNumberOfBokksInStore = 0;

  public static void main(String[] args) throws NumberFormatException, IOException {
    //BookStore.loadData();


    for(ClassicBook cB:BookStore.fList) {
      if(cB != null) {
        totalNumberOfBokksInStore ++;
      }
    }


    for(NewSellingBook nB:BookStore.sList) {
      if(nB != null) {
        totalNumberOfBokksInStore ++;
      }
    }


    BufferedReader stdin = new BufferedReader(
      new InputStreamReader(System.in));

    if(totalNumberOfBokksInStore> 5)
    {

      System.out.println("Please enter first price in integer form. Example 11");
      int x = Integer.parseInt(stdin.readLine());

      System.out.println("Please enter the maximum price you would like to set in integer form. Example 11");

      int y = Integer.parseInt(stdin.readLine());

      BookStore.displayByPrice(x, y);

      System.out.println("Please enter the last name of the author to search a book. Example Kebede");
      String author = stdin.readLine();

      BookStore.displayByAuthor(author);
    } else {
      System.out.println("Not enough Books");
    }

  }

}
