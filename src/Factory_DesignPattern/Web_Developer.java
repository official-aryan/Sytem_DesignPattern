package Factory_DesignPattern;

public class Web_Developer implements Employee{
    @Override
    public int salary() {

            System.out.println("WebDeveloper salary is " );
            return 900000;
        }

}
