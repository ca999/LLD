package PubSub;


import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<Subscriber> subscribers;
    Topic() {
        subscribers = new ArrayList<Subscriber>();
    }
    void broadcastMessage(Message message) {
        for (Subscriber subscriber : subscribers) {
            Dispatcher.dispatch(subscriber, message);
        }
    }
    void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

}
