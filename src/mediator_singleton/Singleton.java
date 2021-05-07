package mediator_singleton;

public class Singleton extends Chat{

    private static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public void consumeMessage(String message){
        if(message.equals("cat")){
            System.out.println("The word " + "\"" + message + "\"" + " is not allowed in this chat room.");
            //mediator.removeUser(this);
        }

    }

}
