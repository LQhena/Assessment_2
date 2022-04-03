package Data;

public class ApplicationDetails {
    private String strName;
    private String strEmail_address;
    private String strPhone_Number;
    private String strMotivation_Letter;
    private String strResume;

    public ApplicationDetails(String strName, String strEmail_address, String strPhone_Number, String strMotivation_Letter, String strResume) {
        this.strName = strName;
        this.strEmail_address = strEmail_address;
        this.strPhone_Number = strPhone_Number;
        this.strMotivation_Letter = strMotivation_Letter;
        this.strResume = strResume;
    }

    public String getName() {
        return strName;
    }

    public String getEmail_address() {
        return strEmail_address;
    }

    public String getPhone_Number() {
        return strPhone_Number;
    }

    public String getMotivation_Letter() {
        return strMotivation_Letter;
    }

    public String getStrResume() {
        return strResume;
    }

}
