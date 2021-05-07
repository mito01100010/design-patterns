package mediator_singleton;

public interface MessageMediator {

    void addUser(User user);

    void removeUser(User user);

    void sendMessage(String message, User user);

}
