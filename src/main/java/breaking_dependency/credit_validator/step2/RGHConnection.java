package breaking_dependency.credit_validator.step2;

import java.io.IOException;

public class RGHConnection {

    private RFDIReport report;

    /**
     * When an RGHConnection is constructed, it connects with a server
     * @param port
     * @param Name
     * @param passwd
     * @throws IOException
     */
    public RGHConnection(int port, String Name, String passwd)
            throws IOException {
        System.out.println("Connecting please wait ... ");
    }

    public void connect() {}
    public void disconnect() {}
    public RFDIReport RFDIReportFor(int id) { return report; }
    public ACTIOReport ACTIOReportFor(int customerID) { return null; }
    
}
