package Abstract_FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(Employee_AbstractFactory employeeAbstractFactory)
    {
        return employeeAbstractFactory.createemployee();

    }
}
