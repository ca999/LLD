package PubSub;

public abstract class AbstractPublisher implements Publisher {
    protected Broker broker;

    public AbstractPublisher(Broker broker) {
        this.broker = broker;
    }


}
