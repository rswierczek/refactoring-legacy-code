package breaking_dependency.irritating_global_dependency.after_solution_3;


/**
 * Those are the primary reasons why people want to enforce a single instance,
 * but they aren’t the primary reasons why people use singletons. Often people
 * create singletons because they want to have a global variable. They feel that it
 * would be too painful to pass the variable around to the places where it is
 * needed.
 * If we have a singleton for the latter reason, there really isn’t any reason to
 * keep the singleton property. We can make the constructor protected, public, or
 * package scope and still have a decent, testable system.
 */
public class PermitRepository {
    private static PermitRepository instance;

    protected PermitRepository(){}

    public static PermitRepository getInstance()
    {
        if (instance == null) {
            instance = new PermitRepository();
        }
        return instance;
    }

    static void setTestingInstance(PermitRepository newInstance){
        instance = newInstance;
    }

    public Permit findAssociatedPermit(PermitNotice notice) {
        // open permit database

        // select using values in notice

        // verify we have only one matching permit, if not report error

        // return the matching permit

        return new Permit(notice);
    }
}
