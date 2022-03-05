package lab1.devices;
import lab1.Human;
import lab1.creatures.Salleable;
import lab1.device.Device;
public class Phone extends Device implements Salleable {

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
}
