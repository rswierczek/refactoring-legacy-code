package breaking_dependency.hidden_dependency.before;

public class MailingListDispatcher {
    private MailService mailService;

    public MailingListDispatcher() {
        mailService = new MailService();
        mailService.connect();
        //...
    }
}
