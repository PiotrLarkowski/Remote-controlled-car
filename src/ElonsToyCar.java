public class ElonsToyCar {
    private String distance = "0";
    private int batteryCharge = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (batteryCharge == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryCharge + "%";
        }
    }

    public void drive() {
        int passed = Integer.parseInt(distance) + 20;
        batteryCharge = batteryCharge - 1;
        distance = "" + passed;

    }
}
