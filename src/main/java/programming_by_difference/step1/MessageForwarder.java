package programming_by_difference.step1;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public abstract class MessageForwarder {
    private Session session;
    private String domain = "example.com";


    public MessageForwarder(Session session) {
        this.session = session;
    }

    public Message forwardMessage(Message message) throws MessagingException {
        MimeMessage forward = new MimeMessage (session);
        forward.setFrom (getFromAddress (message));
        return forward;
    }

    protected InternetAddress getFromAddress(Message message)
            throws MessagingException {
        Address[] from = message.getFrom ();
        if (from != null && from.length > 0)
            return new InternetAddress (from [0].toString ());
        return new InternetAddress (getDefaultFrom());
    }

    private String getDefaultFrom() {
        return null;
    }

    public String getDomain() {
        return domain;
    }
}
