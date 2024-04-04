package Singleton;

public class EagerSingletonObject

{
    private static EagerSingletonObject a=new EagerSingletonObject();

    public static EagerSingletonObject geta()
    {
        return a;
    }

    public static void main(String[] args) {
        EagerSingletonObject eagerSingletonObject= Singleton.EagerSingletonObject.geta();
        System.out.println(eagerSingletonObject.hashCode());

        EagerSingletonObject eagerSingletonObject1= Singleton.EagerSingletonObject.geta();
        System.out.println(eagerSingletonObject1.hashCode());

    }
}