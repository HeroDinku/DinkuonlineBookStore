package Dinku;

public class ClassicBook extends Book {

  private int publishYear;



  public ClassicBook() {
    super();
  }



  public ClassicBook(String title, String author, int price, int publishYear) {
    super.setBookname(title);
    super.setAuthor(author);
    super.setPrice(price);
    this.publishYear = publishYear;
  }



  public int getPublishYear() {
    return publishYear;
  }

  public void setPublishYear(int publishYear) {
    this.publishYear = publishYear;
  }


  @Override
  void display() {
    System.out.println(" " + getBookname() + " " + getAuthor() + " " + getPrice() + " " + getPublishYear());
  }



}
