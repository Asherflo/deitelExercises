package DataStructure;

public class Queue {
    private final int[] myElements = new int[10];
    private int numberOfElement;

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void add(int element) {
        if (numberOfElement < myElements.length) {
            myElements[numberOfElement] = element;
            numberOfElement++;
        }
    }

    public int size() {
        return numberOfElement;
    }

    public void remove() {
        for (numberOfElement = 0; numberOfElement < 1; numberOfElement++) {
            myElements[0] = myElements[1];
        }
        numberOfElement--;

    }

    public int peek() {
        return myElements[0];
    }
}
