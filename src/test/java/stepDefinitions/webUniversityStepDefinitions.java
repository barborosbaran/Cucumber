package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

public class webUniversityStepDefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();
    String ilkSayfaHandleDegeri;


    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {

        // JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        // jse.executeScript("arguments[0].scrollIntoView(true);",webUniversityPage.loginPortal);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(webUniversityPage.loginPortal);

    }

    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortal.click();

    }

    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        //eger yeni windowa geciyorsa yeni window acilmadan ilk sayfanin window handle degerini kaydetmeliyiz
        Set<String> tumHandle = Driver.getDriver().getWindowHandles();
        String ikinciSaffaHanldle = "";
        for (String each : tumHandle
        ) {
            if (each != ilkSayfaHandleDegeri) {
                ikinciSaffaHanldle = each;
            }

        }
        Driver.getDriver().switchTo().window(ikinciSaffaHanldle);


    }

    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        webUniversityPage.username.sendKeys("username");

    }

    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webUniversityPage.password.sendKeys("password");

    }

    @Then("webunuversity login butonuna basar")
    public void webunuversity_login_butonuna_basar() {
        webUniversityPage.loginButonu.click();

    }

    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String actual = Driver.getDriver().switchTo().alert().getText();
        String expected = "validation failed";

        Assert.assertEquals(actual, expected);

    }

    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);

    }

    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {
        Assert.assertTrue(webUniversityPage.loginPortal.isDisplayed());

    }
}
