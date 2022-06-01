package DataStructure;

public class Set {
    DataStructureArrayList setting = new DataStructureArrayList();
    private boolean isEmpty;
    private int items;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(String item) {
        setting.add(item);
//
//        for (int i = 0; i < size() ; i++) {
//            if(!setting.get(i).equals(item))setting.add(item);
//        }
    }

    public int size() {
        return setting.size();
    }

    @Override
    public String toString() {
        String returned = "{ ";
        for (int i = 0; i < size(); i++) {
            returned += setting.get(i);
            if (i < (size() - 1)){returned += ", ";}
        }
        returned += " }";
        return returned;
    }


    public boolean contains(String items) {
        for (int counter = 0; counter < size() ; counter++) {
            if (items.equals(items)) ;
            return true;
        }
        return false;

        }

    public void remove(String items) {
        setting.remove(items);
    }

}

