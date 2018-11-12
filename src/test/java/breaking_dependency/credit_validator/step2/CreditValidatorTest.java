package breaking_dependency.credit_validator.step2;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditValidatorTest {

    private static final double THRESHOLD = 0;

    @Test
    public void testCreate() throws IOException {
        RGHConnection connection = new FakeConnection("admin", "rii8ii9s");
        CreditMaster master = new CreditMaster("crm2.mas", true);
        CreditValidator validator = new CreditValidator(
                connection, master, "a");
    }

    void testAllPassed100Percent() throws Exception {
        FakeConnection connection = new FakeConnection("admin", "rii8ii9s");
        CreditValidator validator = new CreditValidator(
                connection, null, "a");
        connection.report = new RFDIReport();
        Certificate result = validator.validateCustomer(new Customer());
        assertEquals(100.0, validator.getValidationPercent(), THRESHOLD);
    }
}