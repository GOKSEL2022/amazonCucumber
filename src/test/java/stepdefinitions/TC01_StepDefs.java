package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_StepDefs {
    Actions actions=new Actions(Driver.getDriver());
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

    @Given("kullanici dil alanina gelir")
    public void kullaniciDilAlaninaGelir() {
        actions.moveToElement(homePage.changeLanguageHome).perform();
    }


    @And("kullanici dil olarak Deutsch secer")
    public void kullaniciDilOlarakDeutschSecer() {
        ReusableMethods.clickByJS(homePage.deutschLanguageHome);
    }
}
