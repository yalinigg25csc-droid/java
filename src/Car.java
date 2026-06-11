public class Car{
}
class Car {
    String brand;
    String color;
    int fuel;
    int speed;

    Car(String brand, String color, int fuel, int speed) {
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
        this.speed = speed;
    }

    void acceleration() {
        speed += 10;
        System.out.println("Speed after acceleration: " + speed);
    }

    void deceleration() {
        speed -= 10;
        System.out.println("Speed after deceleration: " + speed);
    }

    void fuel(int amount) {
        fuel += amount;
        System.out.println("Fuel added: " + amount);
        System.out.println("Current Fuel: " + fuel);
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Fuel: " + fuel);
        System.out.println("Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Hyundai", "White", 20, 60);

        c.display();
        c.acceleration();
        c.deceleration();
        c.fuel(15); // adds 15 litres
    }
}
