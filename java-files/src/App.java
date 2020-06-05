public class App {
//this is the user and this should be as simple as possible

    public static void main(String[] args) {
        //main is ONLY used to run the program
        //It recognises the class we've created MessageHandler
        //We then create an object using the same name
        //And create a constructor with = new...
        //This then gives us access to the classes methods
        MessageHandler messageHandler = new MessageHandler();
        //this allows a user input to be fed into the placeholder
        messageHandler.setName("Joe");
        messageHandler.printMessage();
    }
}
