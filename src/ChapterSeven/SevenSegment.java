package ChapterSeven;

public class SevenSegment {
    String[][] segments = new String[5][4];

    public void setA() {
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j <= 3; j++) {
                segments[i][j] = "#";
            }
        }
    }

    public void setB() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 3; j <= 3; j++) {
                segments[i][j] = "#";
            }
        }
    }

    public void setC() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 3; j <= 3; j++) {
                segments[i][j] = "#";
            }
        }
    }

    public void setD() {
        for (int i = 4; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                segments[i][j] = "#";
            }
        }
    }

    public void setE() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j <= 0; j++) {
                segments[i][j] = "#";
            }
        }

    }
    public void setF(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 0; j++) {
                segments[i][j] ="#";

            }
        }
    }

}


