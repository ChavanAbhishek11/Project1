import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Kaushik");
		Thread.sleep(1000);
		driver.findElement(By.name("birthday_day")).sendKeys("01");

	}

}
