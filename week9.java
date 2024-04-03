package selenium;
import java.util.List;                                                                                                                                                                                                                                                                                                                                                                              
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class week9{

	public static void main(String args[])throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/hyderabad");
	Thread.sleep(2000);
	List<WebElement> n =driver.findElements(By.xpath("//h4[@class='sc-1hp8d8a-0 sc-cgThhu dFwWJC']"));
	for(int i=0;i<n.size();i++) {
		String s=n.get(i).getText();
		System.out.println("restaurant "+i+" is "+s);
	}
	driver.quit();
	}
}
