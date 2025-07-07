package CarRental;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    static CarRentalSystem instance;
    private List<Car> cars;
    private List<Reservation> reservations;
    private CarRentalSystem() {
        cars = new ArrayList<Car>();
        reservations = new ArrayList<>();
    }

    public static CarRentalSystem getInstance() {
        if (instance == null) {
            instance = new CarRentalSystem();
        }
        return instance;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getAvailableCars() {
        return cars.stream()
                .filter((i) -> i.getCarStatus() == CarStatus.AVAILABLE)
                .toList();
    }

    public List<Car> searchCar(CarType carType) {
        return cars.stream()
                .filter((i) -> i.getCarType().equals(carType))
                .filter((c) -> c.getCarStatus() == CarStatus.AVAILABLE)
                .toList();
    }

    public double totalPrice(Car car, LocalDateTime start, LocalDateTime end) {
        double price = car.getCarPrice();
        long hours = ChronoUnit.HOURS.between(start, end);
        return price * hours;
    }

    public boolean isCarAvailable(Car car) {
        return car.getCarStatus() == CarStatus.AVAILABLE;
    }

    public synchronized Reservation makeReservation(User user, Car car, LocalDateTime start, LocalDateTime end) {
        if(!isCarAvailable(car)) {
            throw new IllegalArgumentException("Car is not available");
        }
        car.setCarStatus(CarStatus.BOOKED);
        Reservation reservation = new Reservation();
        reservation.makeReservation(start, end, user, car);
        reservation.setTotalPrice(totalPrice(car, start, end));
        reservations.add(reservation);
        return reservation;
    }

    public synchronized boolean cancelReservation(User user, Car car, LocalDateTime start, LocalDateTime end, Reservation reservation) {
        car.setCarStatus(CarStatus.AVAILABLE);
        reservations.remove(reservation);
        return true;
    }

    public boolean processPayment(PaymentGateway paymentGateway, Reservation reservation) {
        boolean status =  paymentGateway.pay(reservation.getTotalPrice());

        if(status) {
            reservation.setPaymentStatus(PaymentStatus.PAID);
        } else {
            reservation.setPaymentStatus(PaymentStatus.PENDING);
        }


        return status;
    }





}
