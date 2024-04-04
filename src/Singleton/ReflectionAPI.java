package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAPI {

    public static void main(String[] args) throws Exception {
        LazySingletonObject s1=LazySingletonObject.geta();
        System.out.println(s1.hashCode());



        Constructor<LazySingletonObject> declaredConstructor = LazySingletonObject.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazySingletonObject s2 = declaredConstructor.newInstance();
        System.out.println(s2.hashCode());
    }

}
