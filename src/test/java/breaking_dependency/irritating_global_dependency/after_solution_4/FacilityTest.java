package breaking_dependency.irritating_global_dependency.after_solution_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacilityTest {
    private PermitRepositoryImpl permitRepository;

    @BeforeEach
    void setUp() {
        TestingPermitRepository testingPermitRepository = new TestingPermitRepository();
        PermitNotice notice = new PermitNotice(1, "desc1");
        testingPermitRepository.addAssociatedPermit(notice, new Permit(notice));
        notice = new PermitNotice(2, "desc2");
        testingPermitRepository.addAssociatedPermit(notice, new Permit(notice));

        permitRepository.setTestingInstance(testingPermitRepository);
    }

    @Test
    void testCreate() {
        PermitNotice notice = new PermitNotice(1, "desc1");
        Facility facility = new Facility(Facility.RESIDENCE, "b", notice);
    }
}