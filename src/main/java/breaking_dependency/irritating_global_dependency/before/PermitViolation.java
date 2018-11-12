package breaking_dependency.irritating_global_dependency.before;

public class PermitViolation extends RuntimeException {
    public PermitViolation(Permit permit) {
    }
}
