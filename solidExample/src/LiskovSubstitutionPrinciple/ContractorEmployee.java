package LiskovSubstitutionPrinciple;

/**
 * Created by manoskammas on 10/11/2018.
 */
public class ContractorEmployee implements IEmployee{


    private int id;
    private String name;

    public ContractorEmployee() {
    }

    public ContractorEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMinimumSalary() {
        return 50000;
    }
}
