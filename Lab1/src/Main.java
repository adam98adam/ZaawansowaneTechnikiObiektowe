import devices.Car;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("mammal");
        int x = 0;
        while(x < 11) {
            animal.takeForAWALK();
            x++;
        }

        Human human = new Human();
        human.setSalary(10000.0);
        Car car = new Car("X7", "BMW", 2000.0);
        human.setCar(car);

        System.out.println(human);
    }
}
