package PubSub;

public class Demo {

    public static void main(String[] args) {
        Broker broker = new Broker();
        LoggingPublisher loggingPublisher = new LoggingPublisher(broker);
        broker.createTopic("logs");
        LoggingSubscriber loggingSubscriber = new LoggingSubscriber();
        broker.subscribe("logs", loggingSubscriber);
        Message message = new Message();
        message.setContent("Hi");
        loggingPublisher.publish("logs", message);
    }
}
