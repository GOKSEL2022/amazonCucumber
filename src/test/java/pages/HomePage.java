package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='nav-logo-sprites']")
    public WebElement amazonTitleHome;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchButtonHome;

    @FindBy(xpath = "(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement searchResultNokiaHome;

    @FindBy(xpath = "//*[@class='icp-nav-flag icp-nav-flag-us icp-nav-flag-lop']")
    public WebElement changeLanguageHome;

    @FindBy(xpath = "(//i[@class='icp-radio icp-radio-active'])[1]")
    public WebElement englishLanguageHome;

    @FindBy(xpath = "(//*[@class='icp-radio icp-radio-active'])[1]")
    public WebElement deutschLanguageHome;
}
