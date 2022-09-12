package Dinku;

public class BookStore {



  static ClassicBook fList[] = new ClassicBook[] {
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022),
    new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022)
  };

  static NewSellingBook sList[] = new NewSellingBook[] {
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc"),
    new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc")
  };

  /*
  public static void loadData() {

  BookStore.fList[0] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[1] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[2] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[3] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[4] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[5] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[6] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[7] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[8] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);
  BookStore.fList[9] = new ClassicBook("The story of Dinku", "Asmamaw", 205, 2022);


  BookStore.sList[0] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[1] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[3] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[4] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[5] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[6] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[7] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[8] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  BookStore.sList[9] = new NewSellingBook("The story of Dinku", "Asmamaw", 205, "Mega Book Publishing Plc");
  }
  */
  public static void displayByPrice(int startRange, int endRange) {


    for (int i = 0; i < fList.length; i++) {
      if(fList[i].getPrice() > startRange && fList[i].getPrice() < endRange) {
        fList[i].display();
      }

    }

    for (int i = 0; i < sList.length; i++) {
      if(sList[i].getPrice() > startRange && sList[i].getPrice() < endRange) {
        sList[i].display();
      }

    }
  }

  public static void displayByAuthor(String b) {

    for (int i = 0; i < fList.length; i++) {
      if(fList[i].getAuthor().equals(b)) {

        fList[i].display();
      }
    }

    for (int i = 0; i < sList.length; i++) {
      if(sList[i].getAuthor() == b) {
        sList[i].display();
      }

    }

  }
}
