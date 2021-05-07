package mediator_singleton;

public class ChatUser extends User{

    boolean b;

    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
        if(message.equals("cat") && b == true){
            Singleton bot = Singleton.getInstance();
            bot.consumeMessage("cat");
            mediator.removeUser(this);

        }

    }


    @Override
    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
        if(message.equals("addBot")){
            b = true;
        }

    }
}
