package lab1;

import lab1.creatures.Pet;
import lab1.devices.Car;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("123");
        System.out.println(pet);

        Human human = new Human();
        human.setSalary(10000.0);
        Car car = new Car("X7", "BMW", 2000.0);
        human.setCar(car);

        System.out.println(human);
    }
}
