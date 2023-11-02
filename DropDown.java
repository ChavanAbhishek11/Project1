import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Create new account")).click();
//	WebElement day = driver.findElement(By.name("birthday_day"));
//		Select select = new Select(day);
/////		select.selectByVisibleText("6");
//
//   select.selectByIndex(5);
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts(10,TimeUnit.SECONDS);
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("12");
//		select.selectByIndex(4);

		
		
		

	}

}
