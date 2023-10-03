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
}
