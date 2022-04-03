package webPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GraduatesApplicationiLab {
    protected WebDriver driver;
    public GraduatesApplicationiLab(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 10), this);
    }

    @FindBy(xpath = "//a[text()[contains(.,'Apply Online')]]")
    public WebElement showApplyForm;
    @FindBy(xpath = "//*[@id=\"applicant_name\"]")
    public WebElement txtName;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement txtEmail;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement txtPhone;
    @FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement txtMotivation;
    @FindBy(xpath = "//*[@id=\"html5_1fuu0s240kc9mg21s0e19kgsuk3\"]")
    public WebElement uploadResume;
    @FindBy(xpath = "//*[@id=\"wpjb_submit\"]")
    public WebElement btnSendApplication;
    @FindBy(xpath = "//li[text()[contains(.,'You need to upload')]]")
    public WebElement errMsg;


}
