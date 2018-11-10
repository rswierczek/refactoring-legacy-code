package programming_by_difference.step2;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

public class AnonymousMessageForwarder extends MessageForwarder {

    private String listAddress = "members@";

    public AnonymousMessageForwarder(Session session, Properties configuration) {
        super(session, configuration);
    }

    @Override
    protected InternetAddress getFromAddress(Message message)
            throws MessagingException {
        String anonymousAddress = "anon-" + listAddress+getDomain();
        return new InternetAddress(anonymousAddress);
    }


}
