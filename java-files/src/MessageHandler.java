public class MessageHandler {
    String name; //we have a string where

    public void setName(String name) {
        this.name = name;
    }

    // This is how our message will be formatted when we run the app
    public void printMessage() {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
