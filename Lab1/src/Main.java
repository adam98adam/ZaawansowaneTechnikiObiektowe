public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("mammal");
        int x = 0;
        while(x < 11) {
            animal.takeForAWALK();
            x++;
        }
    }
}
