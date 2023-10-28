package defaultMethods;

public interface Sayable {
    //    abstract method
    void sayMore(String msg);

    //    default method
    default void say() {
        System.out.println("This is default method");
    }
}
