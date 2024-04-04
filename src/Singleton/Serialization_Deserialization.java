package Singleton;

import java.io.*;

public class Serialization_Deserialization {

    //Implement Serializable in LazySingletonObject

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazySingletonObject a=LazySingletonObject.geta();
        System.out.println(a.hashCode());
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(a);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        LazySingletonObject s2 = (LazySingletonObject) ois.readObject();
        System.out.println(s2.hashCode());


    }

}
