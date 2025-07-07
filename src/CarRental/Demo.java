package CarRental;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem  = CarRentalSystem.getInstance();
        User user1 = new User("Nayana", "email");
        User user2 = new User("Nayana", "email");

        Car car = new Car("1", CarType.HATCHBACK, 20);
        Car ca2 = new Car("2", CarType.HATCHBACK, 40);

        CreditCardPaymentGateway creditCardPaymentGateway = new CreditCardPaymentGateway();
        Reservation reservation = carRentalSystem.makeReservation(user1, car, LocalDateTime.now(), LocalDateTime.now().plusDays(2));
        System.out.println(reservation);
        carRentalSystem.processPayment(creditCardPaymentGateway, reservation);
        System.out.println(reservation);






    }
}
