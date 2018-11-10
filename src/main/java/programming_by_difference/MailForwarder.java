package programming_by_difference;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailForwarder {
    private Session session;

    public MailForwarder(Session session) {
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
        return "example.com";
    }
}
