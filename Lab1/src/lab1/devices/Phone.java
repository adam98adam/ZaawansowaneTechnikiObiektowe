package lab1.devices;
import lab1.Human;
import lab1.creatures.Salleable;
import lab1.device.Device;

import java.util.List;

public class Phone extends Device implements Salleable {

    static final String address = "127.0. 0.1";
    static final String protocol = "test";
    static final String version = "5.1.2";

    @Override
    public void turnOn() {
        System.out.println("Turn on lab1.devices.Phone");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPhone() != null) {
            if(buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setPhone(seller.getPhone());
                seller.setPhone(null);
            } else {
                System.out.println("Kupujacy ma za malo pieniedzy !!!");
            }
        } else {
            System.out.println("Sprzedajacy nie posiada telefounu !!!");
        }
    }

    public void installAnnApp(String appName) {
        System.out.println("Nazwa: " + appName + " Wersja: " + version + " Adres: " + address);
    }

    public void installAnnApp(String appName, String version) {
        System.out.println("Nazwa: " + appName + " Wersja: " + version + " Adres: " + address);

    }

    public void installAnnApp(String appName, String version, String serverAddress) {
        System.out.println("Nazwa: " + appName + " Wersja: " + version + " Adres: " + serverAddress);
    }

    public void installAnnApp(List<String> appNames) {
        for(String x : appNames) {
            System.out.println("Nazwa: " + x + " Wersja: " + version + " Adres: " + address);
        }
    }

    public void installAnnApp(URL url) {
        System.out.println(url);
    }

}
