package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setCar(new K3Car());
        driver.drive();

        driver.setCar(new Model3Car());
        driver.drive();

        driver.setCar(new NewCar());
        driver.drive();
    }
}
