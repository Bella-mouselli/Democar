public class Main {

    public static void main(String[] args) {
        Car car1;

        car1 = new Car();
        car1.model = "Audi A6";
        car1.price = 500_000;
        car1.year = 2020;
        car1.color = "svart";

        System.out.printf("%s kostar: %,d kr. Årsmodell: %d. Den har färgen %s\n\n", car1.model, car1.price, car1.year, car1.color);

        Car car2 = new Car();
        car2.model = "Audi A3";
        car2.price = 30_000;
        car2.year = 2020;
        car2.color = "svart";

        System.out.printf("%s kostar: %,d kr. Årsmodel: %d. Den har färgen %s\n\n", car2.model, car2.price, car2.year, car2.color);

    }
}
