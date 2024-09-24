public class Tv implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("Tv are turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv are turned OFF.");
    }
}
