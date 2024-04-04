package Factory_DesignPattern;

public class Android_developer implements Employee {

    @Override
    public int salary() {
        System.out.println("AndroidDeveloper salary is " );
        return 800000;
    }
}
