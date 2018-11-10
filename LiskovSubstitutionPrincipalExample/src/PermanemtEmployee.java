/**
 * Created by manoskammas on 10/11/2018.
 */
public class PermanemtEmployee extends Employee{


    public PermanemtEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public int calculateBonus(int salary) {
        return salary*2;
    }

    @Override
    public int getMinimumSalary() {
        return 6000;
    }

}
