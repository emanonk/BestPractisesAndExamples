package InterfaceSegregationPrinciple;

/**
 * Created by manoskammas on 14/11/2018.
 */
public interface Deposit {

    boolean depositFunction(Integer amount);

    Integer accountBalance(Long id);
}
