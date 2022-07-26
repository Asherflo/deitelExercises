package ChapterFourteen;

import java.util.stream.IntStream;

public class Task {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,20)
                .filter(value -> value % 2 == 0)
                .map(x-> x*x*x)
                .sum());


    }
}
