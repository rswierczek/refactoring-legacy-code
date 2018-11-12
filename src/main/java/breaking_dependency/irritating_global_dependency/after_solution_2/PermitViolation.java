package breaking_dependency.irritating_global_dependency.after_solution_2;

public class PermitViolation extends RuntimeException {
    public PermitViolation(Permit permit) {
    }
}
