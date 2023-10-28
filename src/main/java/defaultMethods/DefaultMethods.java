package defaultMethods;

public class DefaultMethods implements Sayable {
    //    implementing abstract method
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();

//        calling default method
        dm.say();
//        calling abstract method
        dm.sayMore("This is abstract method");
    }
}
