public class SmartTv {
    boolean power = false;

    int channel = 1;
    int volume = 40;

    public void volume_up() {
        volume += 10;
    }

    public void volume_down() {
        volume -= 10;
    }

    public void power_on() {
        power = true;
    }
    public void power_off() {
        power = false;
    }
}
