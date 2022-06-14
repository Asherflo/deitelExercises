package TimBuchalkaExercises;

public class AudioBook extends Book{
    private int bookSize;
    private int playLength;
    private String  playBackArtist;

    public AudioBook(String title, String author, int bookSize, int playLength, String playBackArtist) {
        super(title, "1994", author);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.playBackArtist = playBackArtist;
    }
}
