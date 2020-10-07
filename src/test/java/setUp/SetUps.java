package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SetUps {
    private WebDriver driver;

    //create Homepage page object
    protected HomePage homePage;
    //create login page object
    protected LoginPage loginPage;
    //create Dashboard page object
    protected DashboardPage dashboardPage;
    //create Household Items page object
    protected HouseHPage househPage;
    //create Home Decoration category of the Household category page object
    protected HomeDecoPage homedecoPage;


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate Webdriver object
        driver= new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //launch FoodCo Website
        driver.get("https://foodco.ng/");
        // Instantiate the Home Page
        homePage = new HomePage(driver);
    }
    @AfterTest
    //Close the browser
    public void closeBrowser(){
        driver.quit();
    }

}
