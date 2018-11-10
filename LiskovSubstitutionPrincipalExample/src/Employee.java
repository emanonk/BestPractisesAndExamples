/**
 * Created by manoskammas on 10/11/2018.
 */
public abstract class Employee implements IEmployee, IEmployeeBonus{

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract int calculateBonus(int salary);
}
