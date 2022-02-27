public class Human {
    Animal pet;
    private Double salary;

    public Double getSalary() {
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
}
