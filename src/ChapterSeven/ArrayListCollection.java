package ChapterSeven;

import java.util.ArrayList;



public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Green");
        items.add(0, "Red");
        items.add("Yellow");
        items.add("Purple");
        items.add("white");
        System.out.println("Display list contents with counter-controlled loop");
        for (int count = 0; count < items.size(); count++) {
            System.out.printf(" %s", items.get(count));
        }
        display(items,"%n Display list contents with enhanced for statement");
        items.add("Green");
        items.add(0, "Red");
        items.add("Yellow");
        items.add("Purple");
        items.add("white");
        items.remove("yellow");
        display(items,"remove the object yellow: ");
        System.out.println();

    }

    private static void display(ArrayList<String> items, String header) {

        for(String item: items){
            System.out.printf(" %s",item);
        }
        System.out.println();
    }
}