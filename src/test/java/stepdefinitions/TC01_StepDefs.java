package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_StepDefs {
    HomePage homePage=new HomePage();
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        Assert.assertTrue(homePage.amazonTitleHome.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("kullanici search alaninda nokia aratir")
    public void kullaniciSearchAlanindaNokiaAratir() {
        homePage.searchButtonHome.sendKeys("nokia", Keys.ENTER);
    }

    @When("kullanici arama sonuclarinda nokia gorundugunu dogrular")
    public void kullaniciAramaSonuclarindaNokiaGorundugunuDogrular() {
        Assert.assertTrue(homePage.searchResultNokiaHome.getText().contains("nokia"));
    }
}
