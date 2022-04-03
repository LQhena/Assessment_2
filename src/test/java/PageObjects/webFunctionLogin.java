package PageObjects;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.codoid.products.fillo.Recordset;
//import data.BookingData;
//import extentReport.reporting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webPageObjects.*;
import webUtilities.webActions;

import java.util.Properties;


public class webFunctionLogin extends webActions {
    /*
    reporting repo = new reporting();
    public void Login(WebDriver driver, ExtentTest test){
        loginAdactin log = new loginAdactin(driver);

        try {

            //String Username = PropertiesManager.getProperty(web.prop.username);
            //String Password = PropertiesManager.getProperty(prop.password);

            enterData(log.txtUsernme, driver ,"lebohang" );

            enterData(log.txtPassword, driver ,"02142T" );

            clickObject(log.btnLogin,driver);

            String filename = repo.CaptureScreenShot(driver);
            if(!driver.getCurrentUrl().contains("SearchHotel")){
                test.fail("Invalid Login details or Your Password might have expired.");
                System.out.println("Invalid Login details or Your Password might have expired.");
            }
            else {
                test.pass("Logged In Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }

        }catch (Exception e) {
            System.out.println("Login unsuccessful,Errors"+e.getMessage());
            Assert.fail();
        }
    }

    public  void search (WebDriver driver, BookingData rs, ExtentTest test) {
        searchHotel search = new searchHotel(driver);
        seleHotel selHotel = new seleHotel(driver);

        try {

            //Thread.sleep(2000);
            selectObject(search.location,driver ,"selectByVisibleText", rs.getLocation());
            selectObject(search.hotels, driver,"selectByVisibleText",rs.getHotels());
            selectObject(search.room_type,driver, "selectByVisibleText",rs.getRoomType());
            selectObject(search.room_no, driver,"selectByVisibleText", rs.getNumberOfRooms());
            enterData(search.check_in_date, driver ,rs.getCheckInDate());
            enterData(search.check_out_date, driver , rs.getCheckOutDate());
            selectObject(search.adults, driver, "selectByVisibleText",rs.getAdultsPerRoom());
            selectObject(search.children, driver, "selectByVisibleText",rs.getChildrenPerRoom());
            clickObject(search.submit,driver);

            String filename = repo.CaptureScreenShot(driver);
            if(!driver.getCurrentUrl().contains("SelectHotel")){
                test.fail("Test Failed: failed to proceed to the next page ");
                System.out.println("Invalid hotel search details.");
            }
            else {
                test.pass("Searched Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }

        } catch (Exception e) {
            System.out.println("search was unsuccessful,Errors" + e.getMessage());
            Assert.fail();
        }
    }


    public  void select_Hotel (WebDriver driver, ExtentTest test) {
        seleHotel selHotel = new seleHotel(driver);

        try {

            clickObject(selHotel.sel_hotel, driver);
            clickObject(selHotel.contin, driver);

            String filename = repo.CaptureScreenShot(driver);


            if(!driver.getCurrentUrl().contains("BookHotel")){
                test.fail("Test Failed: failed to proceed to the next page ");
                System.out.println("Invalid hotel search details.");
            }
            else {
                test.pass("Selected Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }
        } catch (Exception e) {
            System.out.println("select hotel was unsuccessful,Errors" + e.getMessage());
            Assert.fail();
        }
    }

    public  void Book_hotel (WebDriver driver, BookingData rs, ExtentTest test) {
        bookHotel bookHotel = new bookHotel(driver);

        try {


            enterData(bookHotel.firstname, driver ,rs.getFirstName());
            enterData(bookHotel.surname, driver ,rs.getLastName());
            enterData(bookHotel.billing, driver ,rs.getBilingAddress());

            enterData(bookHotel.account, driver ,rs.getCreditCardNumber());
            selectObject(bookHotel.account_type, driver, "selectByVisibleText",rs.getCreditCardType());
            selectObject(bookHotel.month, driver, "selectByVisibleText",rs.getExpiryDateMonth());
            selectObject(bookHotel.year, driver, "selectByVisibleText",rs.getExpiryDateYear());


            enterData(bookHotel.cvv, driver ,rs.getCVVNumber());

            clickObject(bookHotel.book,driver);
            WebElement ordernumber =bookHotel.orderno;
            ordernumber.getAttribute("value");
            System.out.println(ordernumber.getAttribute("value"));

            String filename = repo.CaptureScreenShot(driver);


            if(!driver.getCurrentUrl().contains("BookingConfirm")){
                test.fail("Test Failed: failed to proceed to the next page ");
                System.out.println("Invalid hotel search details.");
            }
            else {
                test.pass("Booked Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }
        } catch (Exception e) {
            System.out.println(" successfully booked,Errors" + e.getMessage());
            Assert.fail();
        }
    }

    public  void logout (WebDriver driver, ExtentTest test) {
        logout logout = new logout(driver);

        try {
            clickObject(logout.logout,driver);

            String filename = repo.CaptureScreenShot(driver);

            if(!driver.getCurrentUrl().contains("Logout")){
                test.fail("Test Failed: failed to proceed to the next page ");
                System.out.println("Invalid hotel search details.");
            }else {
                test.pass("Logged out Successful", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }

            clickObject(logout.loginAgain,driver);
        } catch (Exception e) {
            System.out.println("successfully logged out,Errors" + e.getMessage());
            Assert.fail();
        }
    }
*/
}
