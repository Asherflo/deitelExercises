package ChapterSeven;

import java.util.ArrayList;
import java.util.Collections;

public class WorkingWithArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<>();
        cars.add(12);
        cars.add(56);
        cars.add(32);
        cars.add(78);

        Collections.sort(cars);

        for (int i : cars)
            System.out.println(i);


    }

}
