package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseHPage {
    public HouseHPage(WebDriver driver) {
        this.driver=driver;
    }
    private final WebDriver driver;
    //click on household sub-category
    private final By homedeco= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/a");
    public HomeDecoPage clickHomeDecor() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(homedeco).click();
        return new HomeDecoPage(driver);
        }
    }

