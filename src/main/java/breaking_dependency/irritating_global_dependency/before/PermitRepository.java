package breaking_dependency.irritating_global_dependency.before;


/**
 * In Java, the singleton pattern is one of the mechanisms people use to make
 * global variables.
 * In general, global variables are a bad idea for a couple of reasons. One of them is opacity.
 */
public class PermitRepository {
    private static PermitRepository instance = new PermitRepository();

    public static PermitRepository getInstance() {
        if (instance == null) {
            instance = new PermitRepository();
        }
        return instance;
    }

    public Permit findAssociatedPermit(PermitNotice notice) {

        return new Permit(notice);

    }
}
