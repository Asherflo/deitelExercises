package ChapterSeven;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] tables = new int[13][13];
        System.out.println("The multiplication table");
        loadArray(tables);

    }
    public static  void loadArray(int [][] table){
        int[][] tables = new int[13][13];
        for (int row = 0; row < tables.length; row++) {
            for (int column = 0; column < tables[row].length; column++) {
                tables[row][column] = (row ) * (column );
                System.out.printf("%6d",tables[row][column]);
            }
            System.out.println();
        }
    }
    public void addTables(int [][] table){

    }
}
