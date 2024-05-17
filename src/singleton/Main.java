package singleton;
// References  https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
//https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Before jumping into pattern just explain what is lazy loading and eager loading
// Mainly this class used to show violations using serializable and reflection.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //exampleSerialization();
       exampleReflection();
    }
    private static void exampleSerialization() throws IOException, ClassNotFoundException {

        // Here we are sending object to the file and then retreiving the object and cheking the hashcode
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + lazySingleton.hashCode());
        System.out.println("Object 2 :" + deserializedLazy.hashCode());

        // they will print different hashcode, our pattern is breaked.
        // So to solve it, we use SerializableSingleton
        // below is the same code as above, but this time we are using SerializableSingleton instead of LazySingleton

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("SerializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println(" SerializableSingleton Object 2 :" + deserializedInstance.hashCode());

        // Now we are getting same hashcodes.

    }
    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        // It is getting all constructors of LazySingleton class
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        //Knowing only one constructor taking it using index
        Constructor constructor = constructors[0];
        // making the constructor public
        constructor.setAccessible(true);
        // creating the instance of LazySingleton once by public  constructor and other by getInstance() method
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Reflected hashcode singleton :"+lazySingleton.hashCode());
        System.out.println("Singleton instance : "+ instance.hashCode());
        // And we will get different hashcodes

        //Solution to this is go by enum
        EnumSingleton.INSTANCE.doSomething();
    }
}
