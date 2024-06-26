import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookReg01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Lab\\Updated\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		WebElement createAccount=driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]"));
		createAccount.click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("ashu");
		Thread.sleep(500);
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("kamatam");
		Thread.sleep(500);
		WebElement mobileNoOrEmailId= driver.findElement(By.name("reg_email__"));
		mobileNoOrEmailId.sendKeys("1234567890");
		Thread.sleep(500);
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("123ashu");
		Select dateDropdown = new Select(driver.findElement(By.name("birthday_day")));
		dateDropdown.selectByValue("24");
		Thread.sleep(500);
		Select monthDropdown = new Select(driver.findElement(By.name("birthday_month")));
		monthDropdown.selectByValue("12");
		Thread.sleep(500);
		Select yearDropdown = new Select(driver.findElement(By.name("birthday_year")));
		yearDropdown.selectByValue("1996");
		Thread.sleep(500);
		WebElement femaleRadioBtn = driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
		femaleRadioBtn.click();
		Thread.sleep(500);
		WebElement signUpBtn = driver.findElement(By.name("websubmit"));
		signUpBtn.click();

	}

}


