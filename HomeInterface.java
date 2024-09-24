public class HomeInterface {
    private HomeService light;
    private HomeService airconditioning;
    private HomeService tv;

    public HomeInterface() {
        this.light = new Light();
        this.airconditioning = new AirConditioning();
        this.tv = new Tv();
    }

    public void turnOnAll() {
        light.turnOn();
        airconditioning.turnOn();
        tv.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        airconditioning.turnOff();
        tv.turnOff();
    }
}
