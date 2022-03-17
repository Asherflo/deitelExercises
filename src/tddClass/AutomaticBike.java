package tddClass;

public class AutomaticBike {
    public boolean isOn;
    private int speed;

    public AutomaticBike() {
        this.speed = 0;
    }

    public void setOn(boolean bikeOn) {
        isOn = bikeOn;

    }

    public void setOnOrOff() {
        if (isOn == false) {
            isOn = true;
        } else if (isOn == true) {
            isOn = false;
        }
    }


    //    public void gearOne(int speedOne){
//        if(speed >= 0 && speed <= 20)
//            speed += 1;
//
//    }
    public int gearOne() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        if (speed >= 0 && speed <= 20) {
            speed += 1;
        } else if (speed > 21 && speed <= 30) {
            speed += 2;
        } else if (speed > 31

                && speed <= 40) {
            speed += 3;
        } else if (speed > 41) {
            speed += 4;
        }

    }

    public int getSpeed() {
        return speed;
    }


    public void deccelerate() {
        if (speed >= 41) {
        speed -= 4;}
        else if (speed >= 31 && speed <= 40) {
            speed -= 3;
        }
     else if (speed >= 21 && speed <= 30) {
        speed -= 2;
    }
        else
            speed -= 1;
    }
}

     
    
    
