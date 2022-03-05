import device.Device;
public class Car extends Device{

    final String model;
    final String producer;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }


    @Override
    public void turnOn() {
        System.out.println("Turn on car");
    }
}
