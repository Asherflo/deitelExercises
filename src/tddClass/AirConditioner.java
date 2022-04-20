package tddClass;

public class AirConditioner {

    private boolean isOn;
    private int temperature =16;

    public AirConditioner(boolean isOn, int temperature) {
        this.isOn = isOn;
        this.temperature = temperature;
    }

    public AirConditioner() {
        this(true,17);
    }

    public AirConditioner(int temperature) {
        this.temperature = temperature;
    }


    
    public void setOn(boolean b) {isOn = b;
    }

    public boolean isOn(){
        return isOn;
    }


    public void setOff(boolean off) {isOn =off;
    }

    public boolean setOff() {
        return isOn;
    }


    public void increaseTemperature(int degree) {
        if(temperature >= 16 && temperature <= 30)
            temperature +=1;
        if(temperature >= 30){
            temperature =30;
        }

    }

    public int increaseTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int degree) {
        if(temperature >=16 && temperature <=30)
            temperature -= 1;
        if(temperature < 16 ){
            temperature = 16;
        }
    }

    public int decreaseTemperature() {
        return temperature;
    }
}

