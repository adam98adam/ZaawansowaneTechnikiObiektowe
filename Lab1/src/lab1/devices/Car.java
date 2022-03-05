package lab1.devices;

import lab1.Human;
import lab1.Salleable;
import lab1.device.Device;

import java.util.Objects;

public class Car extends Device implements Salleable {

    final String model;
    final String producer;

    Double price;

    public Car(String model, String producer, Double price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }


    @Override
    public void turnOn() {
        System.out.println("Turn on car");
    }

    @Override
    public String toString() {
        return "lab1.devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;
        return model.equals(car.model) &&
                producer.equals(car.producer) &&
                Objects.equals(price, car.price);
    }

    public String getModel() { return model; }

    public String getProducer() { return producer; }

    public Double getPrice() { return price; }

    public void setPrice(Double price) { this.price = price; }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() != null) {
            if(buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setCar(seller.getCar());
                seller.setCar(null);
            } else {
                System.out.println("Kupujacy ma za malo pieniedzy !!!");
            }
        } else {
            System.out.println("Sprzedajacy nie posiada telefounu !!!");
        }
    }
}
