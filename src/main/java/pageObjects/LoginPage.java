package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    private WebDriver driver;
    //locate username element
    private By username= By.xpath("//*[@id=\"username\"]");
    private By password= By.xpath("//*[@id=\"password\"]");

    public void enterUsername(String uName){
        driver.findElement(username).sendKeys(uName);
    }
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button")).click();
        //return dashboard page
        return new DashboardPage(driver);
    }
    //back to home page
    public HomePage clickHomeP(){
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div[2]/ul/li[1]/a")).click();
        System.out.println("You are logged out, page URL is https://foodco.ng");
        return new HomePage(driver);
    }
}


