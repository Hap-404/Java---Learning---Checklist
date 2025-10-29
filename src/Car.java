public class Car {

    //properties
    String color;
    String brand;
    String model;
    int year;
    int speed;

    //behaviour
    public void accelerate(int increment){
        speed = speed + increment;
    }

    public void brake(int decrement ){
        speed = speed - decrement;
        if(speed < 0){
            speed = 0;
        }
    }
}
