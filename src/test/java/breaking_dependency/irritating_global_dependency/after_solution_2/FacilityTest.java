package breaking_dependency.irritating_global_dependency.after_solution_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacilityTest {
    private PermitRepository permitRepository;

    @BeforeEach
    void setUp() {
        permitRepository = PermitRepository.getInstance();
        permitRepository.resetForTesting();
    }

    @Test
    void testCreate() {
        PermitNotice notice = new PermitNotice(0, "a");
        Facility facility = new Facility(Facility.RESIDENCE, "b", notice);
    }
}