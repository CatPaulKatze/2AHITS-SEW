package at.htlhl.sew2.oop.basics;

public class Car {
    private String brand;
    private float maxSpeed;

    public Car() {
        this.brand = "Default Brand";
        this.maxSpeed = 0f;
    }

    public Car(String brand, float maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    static void main() {
        Car c1 = new Car("Reiskocher", 0.1f);
        Car c2 = new Car("BMW", 250f);
        Car c3 = new Car("Audi", 240f);
        Car c4 = new Car("Skoda", 220f);

        Car[] myCars = {c1, c2, c3, c4};
        Car[] cars = new Car[4];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;

        float sumMaxSpeed = 0f;
        for (Car item : cars) {
            sumMaxSpeed += item.maxSpeed;
        }
        System.out.println(sumMaxSpeed);
    }
}
