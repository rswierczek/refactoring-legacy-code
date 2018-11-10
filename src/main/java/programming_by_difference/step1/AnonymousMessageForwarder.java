package programming_by_difference.step1;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;

public class AnonymousMessageForwarder extends MessageForwarder {

    private String listAddress = "members@";

    public AnonymousMessageForwarder(Session session) {
        super(session);
    }

    @Override
    protected InternetAddress getFromAddress(Message message)
            throws MessagingException {
        String anonymousAddress = "anon-" + listAddress+getDomain();
        return new InternetAddress(anonymousAddress);
    }


}
