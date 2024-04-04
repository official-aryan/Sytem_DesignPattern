package Abstract_FactoryDesignPattern;

public class Web_Developer implements Employee {
    @Override
    public int salary() {

            System.out.println("WebDeveloper salary is " );
            return 900000;
        }
    @Override
    public String name() {
        return "ANDROID DEVELOPER";
    }

}
