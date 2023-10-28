package functionalInterface;

public class FunctionalInterface implements Sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String args[]) {
        FunctionalInterface FI = new FunctionalInterface();
        FI.say("Welcome to the South Africa ");

    }
}
