/**
 * 
 */
package selenium.webdriver.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Jayakumar Manian
 *
 */
public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(3000);            //delay
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
}
