package selenium.webdriver.examples;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Jayakumar Manian
 *
 */
public class DownloadImage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver firefox = new FirefoxDriver();
		firefox.get("https://developer.android.com/studio/run/managing-avds.html");
		File files = null;
		Integer counter=0;
		 
		Thread.sleep(5000);
		List<WebElement> listImages=firefox.findElements(By.tagName("img"));
		System.out.println("No. of Images: "+listImages.size());
		 
		for(WebElement image:listImages)
		{
			if(image.isDisplayed())
			{
				counter++;
				String[] names = image.getAttribute("src").split("/");
				String name = names[names.length-1];
				System.out.println(name);
				URL myURL = new URL(image.getAttribute("src"));
				System.out.println("URL = "+myURL);
				files= new File("C:\\downloadedPictures\\"+ System.currentTimeMillis()+ "." +name);
				org.apache.commons.io.FileUtils.copyURLToFile(myURL, files);
			}
		}
		System.out.println("No. of total displable images: "+counter);
		}
	}

