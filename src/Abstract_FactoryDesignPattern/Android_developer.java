package Abstract_FactoryDesignPattern;

public class Android_developer implements Employee {

    @Override
    public int salary() {
        System.out.println("AndroidDeveloper salary is " );
        return 800000;
    }

    @Override
    public String name() {
        return "ANDROID DEVELOPER";
    }
}
