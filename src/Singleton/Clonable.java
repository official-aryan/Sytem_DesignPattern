package Singleton;

public class Clonable {

//Add cloneable and overside the clone method as it is protected

    public static void main(String[] args) throws CloneNotSupportedException {
        LazySingletonObject lazySingletonObject = LazySingletonObject.geta();
        System.out.println("Original Singleton hashcode: " + lazySingletonObject.hashCode());

        // Attempt to clone the Singleton instance
        LazySingletonObject clonedSingletonObject = (LazySingletonObject) lazySingletonObject.clone();
        System.out.println("Cloned Singleton hashcode: " + clonedSingletonObject.hashCode());
    }
    }

