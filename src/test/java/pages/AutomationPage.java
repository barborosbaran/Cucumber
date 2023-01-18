package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLinkILk;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement isimKutusu;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrRadioElementi;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreated;






}
