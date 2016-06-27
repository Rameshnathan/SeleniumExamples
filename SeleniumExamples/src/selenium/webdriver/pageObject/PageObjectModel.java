/**
 * 
 */
package selenium.webdriver.pageObject;

/**
 * @author Jayakumar Manian
 *
 * Jun 27, 2016
 *
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import pageObjects.Login_Page;

public class PageObjectModel {

private static WebDriver driver = null;

public static void main(String[] args) {

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://www.store.demoqa.com");

// Use page Object library now

HomePage.lnk_MyAccount(driver).click();

Login_Page.txtbx_UserName(driver).sendKeys("testuser_1");

Login_Page.txtbx_Password(driver).sendKeys("Test@123");

Login_Page.btn_LogIn(driver).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

HomePage.lnk_LogOut(driver).click(); 

driver.quit();

}
}
