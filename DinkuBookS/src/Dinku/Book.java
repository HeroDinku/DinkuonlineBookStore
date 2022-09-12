package Dinku;

public abstract class Book {

  private String bookname;
  private String author;
  private int price;




  public String getBookname() {
    return bookname;
  }


  public void setBookname(String bookname) {
    this.bookname = bookname;
  }


  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  abstract void display ();

}
