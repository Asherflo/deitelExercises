package Composition;


import java.util.ArrayList;

public class Diary1 {
    private String username;
    private String password;
    private String phoneNumber;
    private boolean isLock = true;
    private Entry1 entry = new Entry1("asherflo", "God is good");
    private ArrayList<Entry1> entries;
    private int numberOfEntries;


    public Diary1(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        entries = new ArrayList<>();

    }

    public String getUsername() {
        return username;

    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isLock() {
        return isLock;
    }

    public void unlock(String password) {
        if (password.equals(password)) {
            isLock = false;

        }

    }

    public void lock() {
        isLock = true;
    }

    public void addTitle() {
        entry.addEntryTitle("asherflo");

    }

    public String getTitle() {
        return entry.getEntryTitle();
    }

    public void addBody() {
        entry.addEntryBody("God is good");
    }

    public String getBody() {
        return entry.getEntryBody();
    }

    public void addDate() {
        entry.addEntryDate();

    }

    public String getDate() {
        return entry.getEntryDate();
    }

    public void addEntry(String title, String body) {
        Entry1 myEntry = new Entry1(title, body);
        entries.add(myEntry);

        numberOfEntries += 1;
    }

    public void deleteEntry(String title, String body) {
        Entry1 myEntry = new Entry1(title, body);
        entries.add(myEntry);
        numberOfEntries -= 1;
    }

    public void removeByIndex(int index) {
        int realIndex = index - 1;
        if (realIndex < 0 || realIndex > entries.size()) {
            System.out.println("Error message");
        } else {
            entries.remove(index - 1);
            numberOfEntries -= 1;
        }
    }

}
