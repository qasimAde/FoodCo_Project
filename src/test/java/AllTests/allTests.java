package AllTests;

import org.testng.annotations.Test;
import pageObjects.*;
import setUp.SetUps;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class allTests extends SetUps {
    @Test(priority = 1)
    public void testFoodCo() throws InterruptedException {
        //assert pop up window
        assertEquals(homePage.getPopupHeading(),"PLEASE SELECT A DELIVERY AREA");
        assertEquals(homePage.getPopupHeading(),"PLEASE SELECT A DELIVERY AREA","The Popup heading  is not correct");
        //assert lagos
        assertTrue(homePage.getLagosText());
        System.out.println("Location assertion is correct");
        //click on lagos
        homePage.pickLagos();
        //login into dashboard
        LoginPage loginPage= homePage.clickmyAccount();
        loginPage.enterUsername("wadegbite@mailinator.com");
        loginPage.enterPassword("#$Admin12345.");
        DashboardPage dashboardPage= loginPage.clickLoginBtn();
        //select category- household
        HouseHPage houseHPage= dashboardPage.clickHhBtn();
        //select subcategory- home decoration
        HomeDecoPage homeDecoPage=houseHPage.clickHomeDecor();
        //Assert 3 items in the subcategory
        assertTrue(homeDecoPage.addItem1());
        assertTrue(homeDecoPage.addItem2());
        assertTrue(homeDecoPage.addItem3());
        System.out.println("Items added correctly");
        //click on logout
        homeDecoPage.clickLogout();
        //confirm logout
        dashboardPage.clickLogout();
        //go back to home page and print out "Account logged out. Page URL is https://foodco.ng/"
        loginPage.clickHomeP();

    }




}
