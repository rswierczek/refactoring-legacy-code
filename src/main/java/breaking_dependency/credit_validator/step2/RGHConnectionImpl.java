package breaking_dependency.credit_validator.step2;

import java.io.IOException;

public class RGHConnectionImpl implements RGHConnection {

    private RFDIReport report;

    /**
     * When an RGHConnection is constructed, it connects with a server
     * @param port
     * @param Name
     * @param password
     * @throws IOException
     */
    public RGHConnectionImpl(int port, String Name, String password)
            throws IOException {
        System.out.println("Connecting please wait ... ");
    }

    @Override
    public void connect() {}
    @Override
    public void disconnect() {}
    @Override
    public RFDIReport RFDIReportFor(int id) { return report; }
    @Override
    public ACTIOReport ACTIOReportFor(int customerID) { return null; }
    
}
