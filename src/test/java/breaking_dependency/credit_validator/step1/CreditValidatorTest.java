package breaking_dependency.credit_validator.step1;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class CreditValidatorTest {

    public static final int DEFAULT_PORT = 9090;

    @Test
    public void testCreate() throws IOException {
        RGHConnection connection = new RGHConnection(DEFAULT_PORT,
                "admin", "rii8ii9s");
        CreditMaster master = new CreditMaster("crm2.mas", true);
        CreditValidator validator = new CreditValidator(
                connection, master, "a");
    }
}