package singleton;

import java.io.Serializable;

/**
 * Lazy initialization mean application will create instance when it is requested.
 * However, this can be used when you have non-thread-safe application. If used in multi threading it might break,
 * Why? because your getinstance method if invoked by two thread at same time then!!!!
 *
 * When to use?  Non thread safe and creating common resource like db connection.
 * To make it thread safe we use Eager initialization.
 *
 */
public class LazySingleton implements Serializable {

    // it is static because it is not dependent on object of this class. This class only has one object, so it is
    // property of class not of object that's why it is static

    private static LazySingleton instance = null;

    private LazySingleton() {
        // private constructor so no one can create its object
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
