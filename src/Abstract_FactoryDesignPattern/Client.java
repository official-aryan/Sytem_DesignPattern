package Abstract_FactoryDesignPattern;

public class Client {

    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());
        System.out.println(e1.name());
        System.out.println(e1.salary());
        System.out.println("______________________________________");
        Employee e2 = EmployeeFactory.getEmployee(new WebFactory());
        System.out.println(e2.name());
        System.out.println(e2.salary());


    }
}
