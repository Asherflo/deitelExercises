package Oop;

public class Animal {
    private String face;
    private String nose;
    private String eyes;

    public Animal(String face, String nose, String eyes) {
        this.face = face;
        this.nose = nose;
        this.eyes = eyes;
    }

    public Animal(){}

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes; 
    }




}
