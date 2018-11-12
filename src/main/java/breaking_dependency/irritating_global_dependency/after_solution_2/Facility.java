package breaking_dependency.irritating_global_dependency.after_solution_2;


/**
 * Solution 1: using setTestingInstance.
 */
public class Facility {
    public static final int RESIDENCE = 0;
    private Permit basePermit;

    public Facility(int facilityCode, String owner, PermitNotice notice)
            throws PermitViolation {
        Permit associatedPermit =
                PermitRepository.getInstance().findAssociatedPermit(notice);
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
