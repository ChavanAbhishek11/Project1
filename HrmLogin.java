import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@ type='submit']")).click();
//		driver.findElement(By.xpath("//a[@ class='href=\"/web/index.php/time/viewTimeModule']")).click();
////		driver.findElement(By.linkText("Forgot your password?")).click();
//		
//
//	}
//
//}
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='Submit']")).click();
	
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
	}
}
