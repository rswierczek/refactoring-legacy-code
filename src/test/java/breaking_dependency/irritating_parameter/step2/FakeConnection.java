package breaking_dependency.irritating_parameter.step2;

/**
 * The FakeConnection class is a little weird. How often do we ever write methods
 * that don’t have any bodies or that just return null to callers? Worse, it has a
 * public variable that anyone can set whenever they want to. It seems like the
 * class violates all of the rules. Well, it doesn’t really. The rules are different for
 * classes that we use to make testing possible. The code in FakeConnection isn’t production code.
 * It won’t ever run in our full working application—just in the test
 * harness.
 */
public class FakeConnection implements RGHConnection
{
    public RFDIReport report;

    public FakeConnection(String Name, String password) {
    }

    public void connect() {}
    public void disconnect() {}
    public RFDIReport RFDIReportFor(int id) { return report; }
    public ACTIOReport ACTIOReportFor(int customerID) { return null; }
}