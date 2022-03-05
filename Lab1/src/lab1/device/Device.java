package lab1.device;

public abstract class Device {
    String producer;
    String mode;
    String yearOfProduction;


    public abstract void turnOn();


    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", mode='" + mode + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }
}
