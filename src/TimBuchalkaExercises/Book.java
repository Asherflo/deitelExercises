package TimBuchalkaExercises;

public class Book {
    private  final String TITLE;
    private   final String YEAR_OF_PUBLICATION;
    private String AUTHOR;

    public Book(String title, String yearOfPublication, String author) {
        this.TITLE = title; 
        this.YEAR_OF_PUBLICATION = yearOfPublication;
        this.AUTHOR = author;
    }
    @Override
    public String toString() {
        return String.format("%s:   %s  %s %s%n","title", getTITLE(),"yearOfPublication", getYEAR_OF_PUBLICATION());
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        TITLE = TITLE;
    }

    public String getYEAR_OF_PUBLICATION() {
        return YEAR_OF_PUBLICATION;
    }

    public void setYEAR_OF_PUBLICATION(String YEAR_OF_PUBLICATION) {
        YEAR_OF_PUBLICATION = YEAR_OF_PUBLICATION;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }
}
