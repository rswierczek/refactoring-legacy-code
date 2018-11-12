package breaking_dependency.credit_validator.step2;

public interface RGHConnection {
    void connect();

    void disconnect();

    RFDIReport RFDIReportFor(int id);

    ACTIOReport ACTIOReportFor(int customerID);
}
