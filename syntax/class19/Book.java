package syntax.class19;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed
     */
    String bookTitle;
    String bookAuthor;
    int numberOfPages;
    int publishYear;

    Book(){

    }
    public Book(String bookTitle,String bookAuthor,int numberOfPages, int publishYear){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.numberOfPages=numberOfPages;
        this.publishYear=publishYear;
    }

    public Book(String the_basque_kitchen) {

    }

    public <Hirigoyen> Book(String the_basque_kitchen, String Gerald_Hirigoyen) {
    }

    void printBookDetails(){
        System.out.println("Book title is "+ bookTitle+ "the authors name is: "+ bookAuthor+ " the number of pages is: "+numberOfPages+" and the publish year is:"+ publishYear);
    }


}
