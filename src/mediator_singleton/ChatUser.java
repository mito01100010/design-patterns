package mediator_singleton;

public class ChatUser extends User{

    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
        if(message.equals("addBot")){
            Singleton bot = Singleton.getInstance();
            bot.consumeMessage("cat");

        }

    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
