package task1;


public class Television {
    private boolean on;
    private int channel;

    //setters

    public void setChannel (int channel) {
        if (!on){
            return;
        }
        if (channel > 10){
            channel -= 10;
        }
        this.channel = channel;
    }

    public void pressOnOff() {
        this.on =!this.on; //toggle tv state
    }

    //getters

    public int getChannel() {
        return this.channel;
    }

    public boolean isOn() {
        return this.on;
    }
}


