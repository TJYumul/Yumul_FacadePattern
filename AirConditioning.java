public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
    System.out.println("Aircon are turned ON.");
}

    @Override
    public void turnOff() {
        System.out.println("Aircon are turned OFF.");
    }
}
