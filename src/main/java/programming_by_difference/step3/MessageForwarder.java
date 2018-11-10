package programming_by_difference.step3;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MessageForwarder {
    private Session session;
    private Properties configuration;
    private String domain = "example.com";


    public MessageForwarder(Session session, Properties configuration) {
        this.session = session;
        this.configuration = configuration;
    }

    public Message forwardMessage(Message message) throws MessagingException {
        MimeMessage forward = new MimeMessage (session);
        forward.setFrom (getFromAddress (message));
        return forward;
    }

    protected InternetAddress getFromAddress(Message message)
            throws MessagingException {

        String fromAddress = getDefaultFrom();
        if (configuration.getProperty("anonymous").equals("true")) {
            fromAddress = getFromAnonymous();
        }
        else {
            fromAddress = getFrom(message, fromAddress);
        }
        return new InternetAddress (fromAddress);
    }

    private String getFrom(Message message, String fromAddress) throws MessagingException {
        Address[] from = message.getFrom ();
        if (from != null && from.length > 0) {
            fromAddress = from [0].toString ();
        }
        return fromAddress;
    }

    private String getFromAnonymous() {
        return "anon-members@" + domain;
    }

    private String getDefaultFrom() {
        return null;
    }

    public String getDomain() {
        return domain;
    }
}
