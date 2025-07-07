package CarRental;

public class Car {
    private final String registrationId;
    private final CarType carType;
    private CarStatus carStatus;
    private double carPrice;
    Car(String registrationId, CarType carType, double carPrice) {
        this.registrationId = registrationId;
        this.carType = carType;
        this.carStatus = CarStatus.AVAILABLE;
        this.carPrice = carPrice;
    }

    public String getRegistrationId() {
        return registrationId;
    }
    public CarType getCarType() {
        return carType;
    }
    public CarStatus getCarStatus() {
        return carStatus;
    }
    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public double getCarPrice() {
        return carPrice;
    }
}
