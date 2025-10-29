public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Blue";
        c1.speed = 50;
        c1.brand = "Hyundai";
        c1.year = 2025;
        c1.model = "Verna";

        c1.accelerate(20);
        System.out.println(c1.speed);
        c1.brake(30);
        System.out.println(c1.speed);

        System.out.println(c1);

    }
}
