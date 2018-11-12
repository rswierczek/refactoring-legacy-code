package breaking_dependency.irritating_global_dependency.after_solution_4;

public class PermitNotice {
    private int id;
    private String description;

    public PermitNotice(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public boolean isValid() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermitNotice notice = (PermitNotice) o;

        if (id != notice.id) return false;
        return description != null ? description.equals(notice.description) : notice.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
