package breaking_dependency.irritating_global_dependency.after_solution_4;


/**
 * Solution 4: Extract Interface
 */
public class Facility {
    public static final int RESIDENCE = 0;
    private Permit basePermit;

    public Facility(int facilityCode, String owner, PermitNotice notice)
            throws PermitViolation {
        Permit associatedPermit =
                PermitRepositoryImpl.getInstance().findAssociatedPermit(notice);
        if (associatedPermit.isValid() && !notice.isValid()) {
            basePermit = associatedPermit;
        } else if (!notice.isValid()) {
            Permit permit = new Permit(notice);
            permit.validate();
            basePermit = permit;
        } else {
            throw new PermitViolation(new Permit(notice));
        }
    }
}
