public class Television {
    private boolean on;
    private int currentChan;

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        if (!on) { // The whole if loop can be replaced with "this.on = !on"
            this.on = true;
        }
        else {
            this.on = false;
        }
    }

    public int getChannel() {
        return currentChan;
    }

    public void setChannel(int c) {
        if (c == 11) { // Max 10 channels, so if parameter is 11, set the channel to 1
            this.currentChan = 1;
        }
        else {
            this.currentChan = c;
        }
    }
}
