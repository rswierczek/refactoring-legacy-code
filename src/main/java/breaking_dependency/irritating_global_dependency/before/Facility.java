package breaking_dependency.irritating_global_dependency.before;

/**
 * The constructor uses a class named PermitRepository, and it needs to
 * be initialized with a particular set of permits to set up our tests properly.
 * We could get past this by parameterizing the constructor, but in this
 * application, this isn’t an isolated case. There are 10 other classes that have
 * roughly the same line of code. It sits in constructors, regular methods, and
 * static methods. We can imagine spending a lot of time confronting this
 * problem in the code base.
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
