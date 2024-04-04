package Abstract_FactoryDesignPattern;

public class AndroidFactory extends Employee_AbstractFactory{
    @Override
    public Employee createemployee() {
        return new Android_developer();
    }
}
