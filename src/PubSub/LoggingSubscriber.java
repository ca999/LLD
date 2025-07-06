package PubSub;

public class LoggingSubscriber implements Subscriber {

    @Override
    public void consume(Message message) {
        System.out.println(message.toString());

    }
}
