package breaking_dependency.irritating_global_dependency.before;

public class Permit {
    private PermitNotice notice;
    public Permit(PermitNotice notice) {
        this.notice = notice;

    }

    public boolean isValid() {
        return false;
    }

    public void validate() {
    }
}
