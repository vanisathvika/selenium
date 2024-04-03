package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\student\\Downloads\\chrome-win64.zip\\chrome-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://results.cmrithyderabad.edu.in/result/c88a87f82b0320187a608f347e37fdeb");
		WebElement Username=driver.findElement(By.className("hallticket"));
		Username.sendKeys("22r01a05n7");
		Username.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

}
