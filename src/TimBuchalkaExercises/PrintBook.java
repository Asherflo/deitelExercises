package TimBuchalkaExercises;

public class PrintBook  extends Book{
    private String publisher;
    private String ISBN;


    public PrintBook(String title, String yearOfPublication, String author, String publisher, String isbn) {
        super(title, yearOfPublication, author);
        this.publisher = publisher;
        ISBN = isbn;
    }
}
