public class Main {
    public static void main(String[] args)
    {
        System.out.println("I need to buy new car");
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println("Show me how many meters the car traveled");
        System.out.println(car.distanceDisplay());
        System.out.println("Show me how much battery is left");
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println("Show me how many meters the car traveled");
        System.out.println(car.distanceDisplay());
        for (int i = 0; i < 98; i++) {
            car.drive();
        }
        System.out.println("Show me how much battery is left");
        System.out.println(car.batteryDisplay());
        System.out.println("I want to drive more");
        car.drive();
    }

}