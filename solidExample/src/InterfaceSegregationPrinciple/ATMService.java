package InterfaceSegregationPrinciple;

/**
 * Created by manoskammas on 14/11/2018.
 */
public class ATMService implements Deposit,Withdraw{
    @Override
    public boolean depositFunction(Integer amount) {
        System.out.println("deposit");
        return false;
    }

    @Override
    public Integer accountBalance(Long id) {
        System.out.println("deposit");
        return null;
    }

    @Override
    public boolean withdrawAmount(Long id, Integer amount) {
        System.out.println("withdraw");
        return false;
    }
}
