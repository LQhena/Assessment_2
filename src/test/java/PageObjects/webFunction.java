package PageObjects;

import Data.ApplicationDetails;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import extentReport.reporting;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import webPageObjects.GraduatesApplicationiLab;
import webPageObjects.LandingiLab;
import webPageObjects.careersiLab;
import webPageObjects.saOpeningiLab;
import webUtilities.webActions;

import java.io.IOException;
import java.util.Random;

import static org.testng.Assert.fail;

public class webFunction extends webActions {
    reporting repo = new reporting();

    public void navigateToCareers(WebDriver driver, ExtentTest test){
        LandingiLab landPage = new LandingiLab(driver);

        clickObject(landPage.careerLink, driver);

        //validation
        try {
            String filename = repo.CaptureScreenShot(driver);

            if(driver.getCurrentUrl().contains("careers")){
                test.pass("Navigation to Career page Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }else{
                test.fail("Navigation to Career page Unsuccessfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void navigateToSA(WebDriver driver,ExtentTest test){
        careersiLab careersPage = new careersiLab(driver);

        clickObject(careersPage.SALinkTag,driver);

        //validation
        try {
            String filename = repo.CaptureScreenShot(driver);

            if(driver.getCurrentUrl().contains("careers/south-africa/")){
                test.pass("Navigation to South Africa careers page Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }else{
                test.fail("Navigation to South Africa careers page Unsuccessfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void navigateToInternOpening(WebDriver driver,ExtentTest test){
        saOpeningiLab openingsPage = new saOpeningiLab(driver);

        clickObject(openingsPage.internlinkTag,driver);

        //validation
        try {
            String filename = repo.CaptureScreenShot(driver);

            if(driver.getCurrentUrl().contains("/job/bsc-computer-science-national-diploma-it-development-graduates/")){
                test.pass("Navigation to Interns page Successfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }else{
                test.fail("Navigation to Interns page Unsuccessfully.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendInternApplication(WebDriver driver,ExtentTest test, ApplicationDetails applicationData){
        //validation
        try {
            GraduatesApplicationiLab applicationPage = new GraduatesApplicationiLab(driver);

            clickObject(applicationPage.showApplyForm,driver);

            enterData(applicationPage.txtName,driver, applicationData.getName());
            enterData(applicationPage.txtEmail, driver, applicationData.getEmail_address());
            enterData(applicationPage.txtPhone, driver, applicationData.getPhone_Number());
            enterData(applicationPage.txtMotivation, driver, applicationData.getMotivation_Letter());

            //Validation and screenshot
            String filename = repo.CaptureScreenShot(driver);

            if(applicationPage.btnSendApplication.isDisplayed()){
                test.pass("application form Successful.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }else{
                test.fail("application form Unsuccessful.", MediaEntityBuilder.createScreenCaptureFromBase64String(filename).build());
            }

            clickObject(applicationPage.btnSendApplication,driver);

            if(applicationPage.errMsg.isDisplayed()){
                //Assert.fail("No file uploaded.");
                String filenameErr = repo.CaptureScreenShot(driver);
                test.fail("Application Form Error : "+applicationPage.errMsg.getText(), MediaEntityBuilder.createScreenCaptureFromBase64String(filenameErr).build());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String generatePhoneNumbers(){
        String strPhoneNums = "0";
        Random rand = new Random();

        strPhoneNums += ""+(6+rand.nextInt(3));

        for(int i = 0; i<8; i++)
            strPhoneNums += "" + rand.nextInt(10);

        return strPhoneNums;
    }
}
