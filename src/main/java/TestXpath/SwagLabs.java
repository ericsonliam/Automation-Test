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

    @FindBy(xpath = "//div[@id='inventory_container']")
    public WebElement swagLabsProductsPage;

    @FindBy(xpath = "//div[@class='right_component']//span[@class='select_container']")
    public WebElement swagLabsFiltderDropdown;

    @FindBy(xpath = "//select[@class='product_sort_container']//option[contains(text(),'Name (A to Z')]")
    public WebElement swagLabsFilterNameAToZ;

    @FindBy(xpath = "//select[@class='product_sort_container']//option[contains(text(),'Name (Z to A')]")
    public WebElement swagLabsFilterNameZToA;

    @FindBy(xpath = "//select[@class='product_sort_container']//option[contains(text(),'Price (low to high')]")
    public WebElement swagLabsFilterPriceLowToHigh;

    @FindBy(xpath = "//select[@class='product_sort_container']//option[contains(text(),'Price (high to low')]")
    public WebElement swagLabsFilterPriceHighToLow;

    @FindBy(xpath = "//div[@class='inventory_list']//div[@class='inventory_item_description']//button['btn btn_primary btn_small btn_inventory']")
    public WebElement swagLabsAddToCartButton;

    @FindBy(xpath = "//div[@class='inventory_list']//div[@class='inventory_item_description']//button['btn btn_primary btn_small btn_inventory']")
    public WebElement RandomCartSelector;









}