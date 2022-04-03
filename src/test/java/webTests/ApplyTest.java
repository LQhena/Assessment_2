package webTests;

import Data.ApplicationDetails;
import PageObjects.webFunction;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentReport.reporting;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webUtilities.webUtilities;

import java.sql.ResultSet;
import java.sql.SQLException;

@Test
public class ApplyTest {
    public webUtilities web = new webUtilities();
    private webFunction iLabWebFuncx = new webFunction();
    public reporting repo = new reporting();
    public ExtentReports reports;

    String sUrl, sBrowser;

    @Parameters({"ilabURL", "Browser"})
    @BeforeTest
    public void beforeMethod(String ilabUrl, String Browser) {

        sUrl = ilabUrl;
        sBrowser = Browser;
        web.setWebDriver(web.initializeWebDriver(Browser));

        reports = repo.initializeExtentReports("reports/test.html");
    }

    @Test
    public void testApplyForGraduateProgram(){
        ExtentTest node = reports.createTest("Adactin Hotel Booking").assignAuthor("Lebohang");
        ExtentTest test;

        ResultSet internApplicationsRS = data.data.loadfromDatabase("applicationsdb","root","password");

        try {
            while(internApplicationsRS.next()){
                ApplicationDetails objInternApplication = new ApplicationDetails(internApplicationsRS.getString("Name"), internApplicationsRS.getString("Email_address"),iLabWebFuncx.generatePhoneNumbers(),internApplicationsRS.getString("MotivationLetter"),internApplicationsRS.getString("CV"));
                test = node.createNode("Intern Application for : " + objInternApplication.getName());
                web.navigate(sUrl);

                iLabWebFuncx.navigateToCareers(web.getWebDriver(),test);

                iLabWebFuncx.navigateToSA(web.getWebDriver(),test);

                iLabWebFuncx.navigateToInternOpening(web.getWebDriver(), test);

                iLabWebFuncx.sendInternApplication(web.getWebDriver(), test, objInternApplication);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        try {
            Thread.sleep(5000);
            web.getWebDriver().close();
            reports.flush();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
