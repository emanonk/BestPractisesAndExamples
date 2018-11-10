/**
 * Created by manoskammas on 10/11/2018.
 */
public class TemporaryEmployee extends Employee{


    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public int calculateBonus(int salary) {
        return salary*4;
    }

    @Override
    public int getMinimumSalary() {
        return 5000;
    }
}
