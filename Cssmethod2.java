import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
