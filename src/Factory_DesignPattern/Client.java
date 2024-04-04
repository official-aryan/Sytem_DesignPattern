package Factory_DesignPattern;

public class Client {

    public static void main(String[] args) {
        Employee androidDeveloper = Employee_factory.getEmployee("ANDROID DEVELOPER");
        int salary = androidDeveloper.salary();
        System.out.println(salary);

    }
}
