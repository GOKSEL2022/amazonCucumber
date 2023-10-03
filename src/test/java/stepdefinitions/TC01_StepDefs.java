package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_StepDefs {
    HomePage homePage=new HomePage();
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("kullanici ansayfanin acildigini dogrular")
    public void kullaniciAnsayfaninAcildiginiDogrular() {
        Assert.assertTrue(homePage.amazonTitleHome.getText().contains("amazon"));
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
