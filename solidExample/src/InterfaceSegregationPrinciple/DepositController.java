package InterfaceSegregationPrinciple;

/**
 * Created by manoskammas on 14/11/2018.
 */
public class DepositController {

    Deposit service = new ATMService();

    public void depositJourney(){
        service.depositFunction(5);
    }

}
