package DiaryProject;

import java.util.ArrayList;

public class Diary {
    private String name;
    private final ArrayList<Entry> entries;
    private String password;
    private int numberOfEntries;

    public Diary(String name, String password) {
        this.name = name;
        entries = new ArrayList<>();
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void addEntry(String name, String body) {
        Entry entry = new Entry(name, body);
        entries.add(entry);

        numberOfEntries += 1;
    }


    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean removeByTitle(String entryTitle) {

        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(entryTitle)) {
                entries.remove(entry);
                numberOfEntries -= 1;
                return true;
            }

        }
        return false;
    }


    public void removeByIndex(int index) {
        int realIndex = index - 1;
        if(realIndex < 0 || realIndex > entries.size()) {
            System.out.println("Error message");
        }
        else{
            entries.remove(index - 1);
            numberOfEntries -= 1;

        }
    }

}
