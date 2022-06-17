package classroom.polymorphism;

public class example {
    public static  void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,5));
        System.out.println(calculator.add(9, 5, 7));

        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.stop();

        Car car = new Car();
        car.move();
        car.stop();

        Vehicle polymorpCar = new Car();
        polymorpCar.move();
    }

}
