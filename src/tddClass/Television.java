package tddClass;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume;

//    public boolean setOnOrOff;

    public void setOnOrOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int channel) {
        if (isOn) {
            if (channel > 0 && channel <= 100)
                this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void increaseChannel() {
        if (isOn) {
            if (channel > 0 && channel < 100)
                channel += 1;

        }
    }

    public void decreaseChannel() {
        if (isOn) {
            if (channel > 0 && channel <= 100)
                channel -= 1;
        }
    }


    public void increaseVolume() {
        if(isOn){
            if( volume >= 0 && volume <= 100)
                volume +=1;
                        this.volume =volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(isOn){ if( volume >0 && volume <= 100)
            volume -=1;
            this.volume =volume;
        }
    }
}