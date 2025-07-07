package CarRental;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private String reservationID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private User user;
    private Car car;
    private double totalPrice;
    private PaymentStatus paymentStatus;

    Reservation() {
        this.reservationID = UUID.randomUUID().toString();
        totalPrice = 0.0;
        paymentStatus = PaymentStatus.NOT_PAID;
    }

    public Reservation makeReservation(LocalDateTime startDate, LocalDateTime endDate, User user, Car car) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.car = car;
        return this;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }


    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return String.format("User : %s has reserved %s from %s to %s at the cost of %f and the payment is %s", user.name, car.getRegistrationId(), startDate, endDate, totalPrice, paymentStatus);
    }
}
