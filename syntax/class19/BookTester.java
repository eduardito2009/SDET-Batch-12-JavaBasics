package syntax.class19;

public class BookTester {
    public static void main(String[] args) {
        new Book().printBookDetails();
        new Book("The Basque Kitchen","Gerald Hirigoyen", 259,1999).printBookDetails();
    }
}
