package selenium;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;                                                                                
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class wk {
public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "F:\\Lab\\Updated\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.ajio.com/");
Thread.sleep(2000);
WebElement ajioLink = driver.findElement(By.xpath("//span[normalize-space()='Sign In / Join AJIO']"));
ajioLink.click();	
Thread.sleep(2000);
WebElement facebookBtn = driver.findElement(By.xpath("//span[normalize-space()='Facebook']"));
facebookBtn.click();
Thread.sleep(2000);
Set<String> parentWindow = driver.getWindowHandles();
Iterator iterator = parentWindow.iterator();
while(iterator.hasNext())
{
String childWindow = (String) iterator.next();
if(!parentWindow.equals(childWindow))
{
driver.switchTo().window(childWindow);
}
}
WebElement emailOrMobileNo =driver.findElement(By.xpath("//input[@id='email']"));
emailOrMobileNo.sendKeys("bhumi27@gmail.com");
WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
pwd.sendKeys("@123");
WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[4]/label[2]/input"));
loginBtn.click();
}
}

