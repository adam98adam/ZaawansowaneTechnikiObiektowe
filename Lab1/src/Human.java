import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    Animal pet;
    Car car;
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

    public void setCar(Car car) { this.car = car; }
}
