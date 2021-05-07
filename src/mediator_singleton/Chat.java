package mediator_singleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator{

    private List<User> users;

    public Chat() {
        this.users = new ArrayList<>();

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User chatUser: this.users){
            if(user != chatUser){
                chatUser.receive(message);
            }

        }
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
        System.out.println("User have been removed.");
    }
}
