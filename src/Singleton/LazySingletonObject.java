package Singleton;

import java.io.Serializable;

public class LazySingletonObject implements Serializable, Cloneable{

    private LazySingletonObject()  {
        //This will not allow any initialization from outside
    }

    private static LazySingletonObject a; //private to make safe and static so it can be used inside a static method

    public static LazySingletonObject geta()
    {
        if(a==null)
        {
            a  = new LazySingletonObject();
        }
        return a;
    }

    @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args)
    {
        LazySingletonObject lazySingletonObject= Singleton.LazySingletonObject.geta();
        System.out.println(lazySingletonObject.hashCode());

        LazySingletonObject lazySingletonObject1= Singleton.LazySingletonObject.geta();
        System.out.println(lazySingletonObject1.hashCode());


    }
}
