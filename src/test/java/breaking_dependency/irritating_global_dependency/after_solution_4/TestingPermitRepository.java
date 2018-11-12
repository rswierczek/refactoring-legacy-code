package breaking_dependency.irritating_global_dependency.after_solution_4;


import java.util.HashMap;
import java.util.Map;

public class TestingPermitRepository implements PermitRepository
{
    private Map<PermitNotice, Permit> permits = new HashMap<>();
    public void addAssociatedPermit(PermitNotice notice, Permit permit) {
        permits.put(notice, permit);
    }
    public Permit findAssociatedPermit(PermitNotice notice) {
        return permits.get(notice);
    }
}
