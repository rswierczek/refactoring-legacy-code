package breaking_dependency.irritating_global_dependency.after_solution_4;

public interface PermitRepository {
    Permit findAssociatedPermit(PermitNotice notice);
}
