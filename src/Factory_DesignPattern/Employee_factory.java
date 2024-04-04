package Factory_DesignPattern;

public class Employee_factory {

    public static Employee getEmployee(String EmployeeType)
    {
        if(EmployeeType.trim().equalsIgnoreCase("ANDROID DEVELOPER"))
        {
            return new Android_developer();
        } else if (EmployeeType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new Web_Developer();

        }
        else {
            return null;
        }
    }
}
