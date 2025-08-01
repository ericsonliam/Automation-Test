package TestXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs {

    WebDriver driver;

    public SwagLabs(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsernameInput() {
        return driver.findElement(By.id("user-name"));
    }


    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }


    @FindBy(xpath = "//div[@class='login_logo'or contains(text(),\"Swag Labs\")]")
    public WebElement swagLabsLoginHeader;

    @FindBy(xpath = "//div[@class='form_group']//input[@placeholder='Username']")
    public WebElement swagLabsusernameInput;

    @FindBy(xpath = "//div[@class='form_group']//input[@placeholder='Password']")
    public WebElement swagLabspasswordInput;

    @FindBy(xpath = "//div[@class='login-box']//input[@type='submit']")
    public WebElement swagLabsLoginButton;




}