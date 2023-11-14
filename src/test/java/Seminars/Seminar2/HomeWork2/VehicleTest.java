package Seminars.Seminar2.HomeWork2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VehicleTest {


    @Test /* Проверить, что экземпляр объекта Car также является экземпляром
    транспортного средства (используя оператор instanceof). */
    public void testIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test /* Проверить, что объект Car создается с 4-мя колесами. */
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test /* Проверить, что объект Motorcycle создается с 2-мя колесами. */
    public void testMotorcycleHasTwoWheels(){
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test /* Проверить, что объект Car развивает скорость 60
    в режиме тестового вождения (используя метод testDrive()). */
    public void testCarSpeedAfterTestDrive() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test /* Проверить, что объект Motorcycle развивает скорость 75
    в режиме тестового вождения (используя метод testDrive()). */
    public void testMotorcycleSpeedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }

    @Test /* Проверить, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) машина останавливается (speed = 0). */
    public void testCarSpeedAfterPark() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test /* Проверить, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0). */
    public void testMotorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}