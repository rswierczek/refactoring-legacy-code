package programming_by_difference.step3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageForwarderTest {

    private Session session;

    @BeforeEach
    void setUp() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable
        session = Session.getInstance(props, null);

    }

    @Test
    public void testAnonymous () throws Exception {
        Properties configuration = new Properties();
        configuration.setProperty("anonymous", "true");

        MessageForwarder forwarder = new MessageForwarder(session, configuration);
        Message expectedMessage = forwarder.forwardMessage (makeFakeMessage());
        assertEquals ("anon-members@" + forwarder.getDomain(),
                expectedMessage.getFrom ()[0].toString());
    }

    private Message makeFakeMessage() throws MessagingException, UnsupportedEncodingException {
        MimeMessage msg = new MimeMessage(session);
        msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
        msg.addHeader("format", "flowed");
        msg.addHeader("Content-Transfer-Encoding", "8bit");

        msg.setFrom(new InternetAddress("no_reply@example.com", "NoReply-JD"));

        msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));

        msg.setSubject("subject", "UTF-8");

        msg.setSentDate(new Date());

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("toEmail.gmail.com", false));

        return msg;
    }
}