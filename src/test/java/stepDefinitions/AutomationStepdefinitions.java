package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepdefinitions {

    AutomationPage auto=new AutomationPage();
    String kullaniciEmail;
    String kullaniciIsim;
    String password;
    Faker faker=new Faker();
    Actions actions;

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        auto.signUpLinkILk.click();
    }
    @Given("user Create and account bolumunene email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
        kullaniciEmail=faker.internet().emailAddress();
        kullaniciIsim=faker.name().firstName();
        auto.isimKutusu.sendKeys(kullaniciIsim);
        auto.emailKutusu.sendKeys(kullaniciEmail);


    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        auto.signUpButton.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        password=faker.internet().password();
        actions=new Actions(Driver.getDriver());
        actions.click(auto.mrRadioElementi)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("24")
                .sendKeys(Keys.TAB)
                .sendKeys("Temmuz")
                .sendKeys(Keys.TAB)
                .sendKeys("1980")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Turkiye")
                .sendKeys(Keys.TAB)
                .sendKeys("Karabuk")
                .sendKeys(Keys.TAB)
                .sendKeys("Karabuk")
                .sendKeys(Keys.TAB)
                .sendKeys("78000")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();

    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        auto.createAccount.click();

    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {

        Assert.assertTrue(auto.accountCreated.isDisplayed());

    }
}
