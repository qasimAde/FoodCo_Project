package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }
    private WebDriver driver;
    //click on household category
    public HouseHPage clickHhBtn() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-3339\"]/a")).click();
        return new HouseHPage(driver);
    }
    //verify logout
    public LoginPage clickLogout() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a")).click();
        return new LoginPage(driver);

    }




    }


