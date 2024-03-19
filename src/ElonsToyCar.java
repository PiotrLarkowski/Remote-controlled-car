public class ElonsToyCar {
    private String distance = "0";
    private String batteryCharge = "100%";
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven "+distance+" meters";
    }

    public String batteryDisplay() {
        return "Battery at 100%";
    }

    public void drive() {
        int passed = Integer.parseInt(distance) + 20;
        distance = ""+passed;
    }
}
