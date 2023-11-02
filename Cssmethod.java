import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("100027998746741");
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("pratik*123");
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
