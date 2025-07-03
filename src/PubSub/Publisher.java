package PubSub;

interface Publisher {
    void publish(String topic, Message message);
}
