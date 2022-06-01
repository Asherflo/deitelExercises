package Composition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Entry1 {
    private String title;
    private String body;
    private String date;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E,dd:MM:yyyy,  hh:mma");


    public Entry1(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void addEntryTitle(String title) {
        this.title = title;
    }

    public String getEntryTitle() {
        return title;
    }

    public void addEntryBody(String body) {
        this.body = body;
    }

    public String getEntryBody() {
        return body;
    }

    public void addEntryDate() {
        this.date = dateTimeFormatter.format(LocalDateTime.now());
    }

    public String getEntryDate() {
        return date;
    }
}
