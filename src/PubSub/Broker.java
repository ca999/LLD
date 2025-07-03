package PubSub;

import java.util.HashMap;
import java.util.Map;

public class Broker {

    private Map<String, Topic> topics;

    Broker() {
        topics = new HashMap<String, Topic>();
    }

    public void createTopic(String topic) {
        topics.put(topic, new Topic());
    }
    public void subscribe(String topic, Subscriber subscriber) {
        topics.get(topic).addSubscriber(subscriber);
    }

    public void unsubscribe(String topic, Subscriber subscriber) {
        topics.get(topic).removeSubscriber(subscriber);
    }

    public void publish(String topic, Message message) {
        topics.get(topic).broadcastMessage(message);
    }
}
