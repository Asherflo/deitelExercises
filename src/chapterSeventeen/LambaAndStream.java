package chapterSeventeen;

import java.util.stream.IntStream;

public class LambaAndStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .sum();
        System.out.println();
    }
}
