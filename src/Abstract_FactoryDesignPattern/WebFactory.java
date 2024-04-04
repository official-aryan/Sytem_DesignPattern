package Abstract_FactoryDesignPattern;

public class WebFactory extends Employee_AbstractFactory{
    @Override
    public Employee createemployee() {
        return new Web_Developer();
    }
}
