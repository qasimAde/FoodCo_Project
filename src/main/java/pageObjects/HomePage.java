package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public HomePage(WebDriver driver) {
        this.driver=driver;

    }
    private WebDriver driver;

    private By popupHeading = By.xpath("/html/body/div[6]/div[2]/h3");

    public String getPopupHeading(){
        return driver.findElement(popupHeading).getText();
    }
    public boolean getLagosText() {
        return driver.findElement(lagos).isDisplayed();
    }
    //select delivery location as Lagos
    private By lagos=By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");
    public void pickLagos() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(lagos).click();
    }
    //get login page
    private By myAccount=By.xpath("//*[@id=\"nav-menu-item-20267\"]/a");
    public LoginPage clickmyAccount() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(myAccount).click();
        return new LoginPage(driver);
    }


}

