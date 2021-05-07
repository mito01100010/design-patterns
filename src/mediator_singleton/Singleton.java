package mediator_singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
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
        }

    }

}
