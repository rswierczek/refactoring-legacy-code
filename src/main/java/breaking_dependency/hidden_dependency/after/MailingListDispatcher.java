package breaking_dependency.hidden_dependency.after;


public class MailingListDispatcher {
    private MailService mailService;

    public MailingListDispatcher() {
        this(new MailService());
    }

    public MailingListDispatcher(MailService mailService) {
        this.mailService = mailService;
        this.mailService.connect();
        //...
    }
}
