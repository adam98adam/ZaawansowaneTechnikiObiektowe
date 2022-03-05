package lab1;

import lab1.creatures.Animal;
import lab1.devices.Car;
import lab1.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human{
    Animal pet;
    Double cash;
    Phone phone;
    private Car car;
    private Double salary;

    public Double getSalary() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
        System.out.println("Dane zostaly pobrane : " + dt.format(new Date()));
        System.out.println("Wartość przed zwróceniem wartosci : " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Nie mozna wprowadzic ujemnej wartosci");
            return;
        }
        System.out.println("Dane zostaly wyslane do systemu ksiegowego");
        System.out.println("Odbierz aneks do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        this.salary = salary;
    }

    public Car getCar() { return car; }

    public void setCar(Car car) {
        if(this.salary > car.getPrice()) {
            System.out.println("Udalo sie kupic auto za gotowke");
            this.car = car;
        } else if(this.salary > (car.getPrice()/12)) {
            System.out.println("Udalo sie kupic auto na kredyt");
            this.car = car;
        } else {
            System.out.println("Znajdz lepsza prace bo bieda czlowieniu");
        }
    }

    public Animal getPet() { return pet; }

    public void setPet(Animal pet) { this.pet = pet; }

    public Double getCash() { return cash; }

    public void setCash(Double cash) { this.cash = cash; }

    public Phone getPhone() { return phone; }

    public void setPhone(Phone phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "lab1.Human{" +
                "pet='" + pet + '\'' +
                ", cash='" + cash + '\'' +
                ", car='" + car + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
