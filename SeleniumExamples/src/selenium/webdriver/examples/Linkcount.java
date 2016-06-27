package selenium.webdriver.examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.MarionetteDriver;

/**
 * @author Jayakumar Manian
 *
 */
public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Mjk_Lab\\Automation\\geckodriver.exe");
		WebDriver driver = new MarionetteDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys("jayakumar manian");
	    driver.findElement(By.name("btnG")).click();
	    Thread.sleep(10000);
	    
	    List<WebElement> Links = driver.findElements(By.tagName("a"));
	    Links.size();
	    System.out.println("'Total no of links'"+Links.size());
	    for(int i=0;i<Links.size();i++)
	    {
	    	System.out.println("Link Name = "+Links.get(i).getText());
	    	System.out.println("URL ="+Links.get(i).getAttribute("href"));
	   	}
   }
}

