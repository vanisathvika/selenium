package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week8{
	public static void main(String[] args)throws InterruptedException, AWTException {
	System.setProperty("webdriver.chormedriver","C:\\Users\\student\\Downloads\\chromedriver-win64 (1).zip\\chromedriver-win64");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement searchBar=driver.findElement(By.name("q"));
	searchBar.sendKeys("cmrit hyderabad ");
	searchBar.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"hdtb-sc\"]/div/div/div[1]/div[2]/a/div\r\n")).click();
	Thread.sleep(2000);
	WebElement Image =driver.findElement(By.xpath("/html/body/div[4]/div/div[12]/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/div[2]/div[2]/h3/a/div/div/div/g-img/img"));
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	action.contextClick(Image).build().perform();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.quit();
}
}
