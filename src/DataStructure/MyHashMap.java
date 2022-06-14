package DataStructure;

import java.util.ArrayList;

public class MyHashMap {
    private boolean isEmpty;
    private int counter;
    private ArrayList<String> keys = new ArrayList<>(5);
    private ArrayList<String> values = new ArrayList<>(5);

    public boolean isEmpty() {
        if (counter == 0) return true;
        return false;
    }

    public int size() {
        return counter++;
    }

    public void add(String key, String value) {
        keys.add(counter, key);
        values.add(counter, value);
        counter++;
    }

    public String getvalue(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) return values.get(i);
        }
        return null;

    }

    public String getKey(String value) {
        for (int i = 0; i < keys.size(); i++) {
            if (values.get(i).equals(value)) return keys.get(i);
        }
        return null;
    }

    public void replace(String key, String value) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                values.add(i, value);

            }


        }
    }


    public void remove(int index) {

            keys.remove(index);
            values.remove(index);
            counter--;


    }
}
