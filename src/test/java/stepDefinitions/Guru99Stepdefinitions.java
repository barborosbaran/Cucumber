package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Guru99Stepdefinitions {

    List<String> companylistSTR;

    Guru99Page guru=new Guru99Page();
    @Given("guru99 cookies kabul eder")
    public void guru99_cookies_kabul_eder() {

       // Driver.getDriver().switchTo().frame(guru.cookieIframe);

        try {
            guru.cookies.click();
        } catch (Exception e) {
        }

       // JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
      //  jse.executeScript("arguments[0].click();",guru.cookies);
    }
    @Then("Compani listesini consola yazdirir")
    public void compani_listesini_consola_yazdirir() {

        List<WebElement> companyElementleri=guru.companyElementList;

        companylistSTR = ReusableMethods.getElementsText(companyElementleri);
        System.out.println(companylistSTR);

    }
    @Then("{string} in listede oldugunu test eder")
    public void in_listede_oldugunu_test_eder(String istenenCompany) {

        Assert.assertTrue(companylistSTR.contains(istenenCompany));
    }
}
