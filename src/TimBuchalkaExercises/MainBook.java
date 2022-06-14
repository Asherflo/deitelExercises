package TimBuchalkaExercises;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book("My journey","2023","Aniyikaye Temitope Florence");
        PrintBook myBook = new PrintBook("My journey","2023","Aniyikaye Temitope Florence","MacBook","222-13456-008");
        AudioBook ebook = new AudioBook("My journey","2023",56,8,"asherflo podcast");


        book.toString();
        book.setAUTHOR("afghgugjb");
        book.getAUTHOR();

        System.out.println(myBook);
        System.out.println(ebook.getAUTHOR());



    }
}
