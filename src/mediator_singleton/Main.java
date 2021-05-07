package mediator_singleton;

public class Main {

    public static void main(String[] args) {

        MessageMediator chat = new Chat();


        User ivan = new ChatUser(chat, "Ivan");
        User maria = new ChatUser(chat, "Maria");
        User george = new ChatUser(chat, "George");


        maria.send("cat");
        george.send("addBot");
        maria.send("cat");
        george.send("test");

    }
}
