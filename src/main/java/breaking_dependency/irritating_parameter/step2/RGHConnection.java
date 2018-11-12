package breaking_dependency.irritating_parameter.step2;

public interface RGHConnection {
    void connect();

    void disconnect();

    RFDIReport RFDIReportFor(int id);

    ACTIOReport ACTIOReportFor(int customerID);
}
