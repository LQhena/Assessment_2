package webTests;

import PageObjects.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.exception.FilloException;
//import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
//import data.*;
//import extentReport.reporting;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webUtilities.webUtilities;


import javax.xml.transform.Result;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;


public class bookHotelTest {
    /*

    public webUtilities web = new webUtilities();
    public webFunctionLogin logAdactin = new webFunctionLogin();
    public reporting repo = new reporting();
    ExtentReports reports;
    String sUrl, sBrowser;

    @Parameters({"adactinURL", "Browser"})
    @BeforeTest
    public void beforeMethod(String sAdactinUrl, String Browser) {

        sUrl = sAdactinUrl;
        sBrowser = Browser;
        web.setWebDriver(web.initializeWebDriver(Browser));

        reports = repo.initializeExtentReports("reports/test.html");
    }

    @Test
    public void testLogin() throws FilloException {
        ExtentTest node = reports.createTest("Adactin Hotel Booking").assignAuthor("Room1");
        ExtentTest test;

        File f = new File("TestData/DataExcel.xlsx");
        data dataTransfer = new data();

        try {
            web.navigate(sUrl);
            if(f.exists()){
                Recordset rs =  dataTransfer.readExcelFile();
                while(rs.next()) {
                    BookingData booking = new BookingData(rs.getField("Location"),rs.getField("Hotels"),rs.getField("RoomType"),rs.getField("NumberOfRooms"),rs.getField("CheckInDate"),
                            rs.getField("CheckOutDate"),rs.getField("AdultsPerRoom"),rs.getField("ChildrenPerRoom"),rs.getField("FirstName"),rs.getField("LastName"),
                            rs.getField("BillingAddress"),rs.getField("CreditCardType"),rs.getField("CreditCardNumber"),rs.getField("ExpiryDateMonth"),rs.getField("ExpiryDateYear"),
                            rs.getField("CVVNumber"));

                    test = node.createNode("Adactin Book Hotel - " + rs.getField("Location"));
                    logAdactin.Login(web.getWebDriver(), test);
                    logAdactin.search(web.getWebDriver(), booking, test);
                    logAdactin.select_Hotel(web.getWebDriver(), test);
                    logAdactin.Book_hotel(web.getWebDriver(), booking, test);
                    logAdactin.logout(web.getWebDriver(), test);
                }
                rs.close();
            }else {
                ResultSet rs = dataTransfer.loadfromDatabase();

                while(rs.next()) {
                    System.out.println(rs.getRow());
                    BookingData booking = new BookingData(rs.getString("Location"),rs.getString("Hotels"),rs.getString("RoomType"),rs.getString("NumberOfRooms"),rs.getString("CheckInDate"),
                            rs.getString("CheckOutDate"),rs.getString("AdultsPerRoom"),rs.getString("ChildrenPerRoom"),rs.getString("FirstName"),rs.getString("LastName"),
                            rs.getString("BillingAddress"),rs.getString("CreditCardType"),rs.getString("CreditCardNumber"),rs.getString("ExpiryDateMonth"),rs.getString("ExpiryDateYear"),
                            rs.getString("CVVNumber"));

                    test = node.createNode("Adactin Book Hotel - " + rs.getString("Location"));
                    logAdactin.Login(web.getWebDriver(), test);
                    logAdactin.search(web.getWebDriver(), booking, test);
                    logAdactin.select_Hotel(web.getWebDriver(), test);
                    logAdactin.Book_hotel(web.getWebDriver(), booking, test);
                    logAdactin.logout(web.getWebDriver(), test);
                }
                rs.close();


            }


            //web.CloseWindow();
        } catch (Exception e) {
            System.out.println("Error During testing the Adactin page, Error: "+e.getMessage());
        }



    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //web.getWebDriver().close();
        reports.flush();
    }
*/
}

