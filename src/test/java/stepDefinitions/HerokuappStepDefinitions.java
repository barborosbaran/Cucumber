package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();

    @Then("Add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
        Thread.sleep(2000);

    }
    @Then("Delete butonunun gorunur oldugunnu test eder")
    public void delete_butonunun_gorunur_oldugunnu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonu.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        int flag=3;
        try {
            herokuappPage.deleteButonu.click();
            Assert.assertFalse(true);
            //exception olusmazsa bekledigimiz durum gerceklesmedi demektir
            //delete butonu hala gorunuyordur ve test fail olmasi gerekir
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
            //35. satirda delete buttonu gorunmuyorya exception olusur bu bizim
            //test edebilmemiz icin istedigimiz bir durumdur
        }

    }
}
