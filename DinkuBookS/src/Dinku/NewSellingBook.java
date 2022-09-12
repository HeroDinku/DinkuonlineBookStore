package Dinku;

public class NewSellingBook extends Book{

  private String publisher;


  public NewSellingBook() {
    super();
  }


  public NewSellingBook(String title, String author, int price, String publisher) {
    super.setBookname(title);
    super.setAuthor(author);
    super.setPrice(price);
    this.publisher = publisher;
  }


  public String getPublisher() {
    return publisher;
  }


  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  @Override
  void display() {

    System.out.println(" " + getBookname() + " " + getAuthor()  + " " + getPrice() + getAuthor() + " " + publisher);
  }

}
