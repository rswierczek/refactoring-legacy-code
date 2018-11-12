package breaking_dependency.irritating_global_dependency.after_solution_4;


/**
 * Extract Interface
 */
public class PermitRepositoryImpl implements PermitRepository {
    private static PermitRepository instance;

    protected PermitRepositoryImpl(){}

    public static PermitRepository getInstance()
    {
        if (instance == null) {
            instance = new PermitRepositoryImpl();
        }
        return instance;
    }

    static void setTestingInstance(PermitRepository newInstance){
        instance = newInstance;
    }

    @Override
    public Permit findAssociatedPermit(PermitNotice notice) {
        // open permit database

        // select using values in notice

        // verify we have only one matching permit, if not report error

        // return the matching permit

        return new Permit(notice);
    }
}
