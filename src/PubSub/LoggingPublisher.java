package PubSub;

public class LoggingPublisher extends AbstractPublisher {
    public LoggingPublisher(Broker broker) {
        super(broker);
    }

    @Override
    public void publish(String topic, Message message) {
        broker.publish(topic, message);
    }
}
