
import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Employee manos = new PermanemtEmployee(1,"manos");

        Employee yiannis = new TemporaryEmployee(2,"yiannis");

        //Employee dimi = new ContractorEmployee(2,"dimi");

        int bonus = manos.calculateBonus(1000);
        System.out.println(bonus);

        int bonus1 = yiannis.calculateBonus(1000);
        System.out.println(bonus1);

        List<IEmployee> employees = new ArrayList();
        employees.add(new PermanemtEmployee(1,"manos"));
        employees.add(new TemporaryEmployee(2,"yiannis"));
        employees.add(new ContractorEmployee(3,"dimi"));


        System.out.println("---");
        employees.stream().forEach(e-> System.out.println(e.getMinimumSalary()));
    }
}
