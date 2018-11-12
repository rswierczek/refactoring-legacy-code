package breaking_dependency.hidden_dependency.after;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailingListDispatcherTest {
    private MailService mailService;

    @BeforeEach
    void setUp() {
        mailService = new MailService();
    }

    @Test
    public void testCreate(){
        MailingListDispatcher dispatcher = new MailingListDispatcher(mailService);

    }
}