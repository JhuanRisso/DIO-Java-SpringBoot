public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.power_on();
        smartTv.volume_down();

        if (smartTv.power == true) {
            System.out.println("On? "+smartTv.power);
            System.out.println("Channel: "+smartTv.channel);
            System.out.println("Volume: "+smartTv.volume);
        } else {
            System.out.println("Tv is off!");
        }

    }
}
