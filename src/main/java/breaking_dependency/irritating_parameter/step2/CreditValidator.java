package breaking_dependency.irritating_parameter.step2;

public class CreditValidator
{
    public CreditValidator(RGHConnection connection,
                           CreditMaster master,
                           String validatorID) {
    }
    Certificate validateCustomer(Customer customer)
            throws InvalidCredit {
        return null;
    }

    public double getValidationPercent() {
        return 0;
    }
}
