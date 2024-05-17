package singleton;

/**
 * This is eager initialization concept where
 * as soon as JVM start the object will be created irrespective whether it got accessed by
 * any code in application or not.
 * When to use : One possible usage can be let say your application has some static cache which is required to be loaded, in multithreaded environment.
 * Drawback : As mention consumes resource even if application does not use it, So we use MultithreadSingleton.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        // Do your init work here
    }
    public static  EagerSingleton getInstance() {
        return instance;
    }
}
