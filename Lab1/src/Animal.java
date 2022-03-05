public class Animal {
    final String species;
    private Double weight;


    Animal(String species) {
        switch (species) {
            case "amphibian":
                this.weight = 30.0;
                break;
            case "mammal":
                this.weight = 50.0;
                break;
            default:
                this.weight = 40.0;
                break;
        }
        this.species = species;
    }

    public void feed() {
        if(weight > 0) {
            this.weight = this.weight + 5.00;
        } else {
            System.out.println("Zdechl !!!! Nie ma co dokarmiac 🙂");
        }
    }

    public void takeForAWALK(){
        if(weight > 0) {
            this.weight = this.weight - 5.00;
        } else {
            System.out.println("Zdechl !!!! Nie ma czego wyprowadzac na spacer 🙂");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speceis='" + species + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
