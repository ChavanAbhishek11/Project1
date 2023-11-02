import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idgooglejava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.google.com");
		
		obj.findElement(By.id("APjFqb")).sendKeys("java");

	}

}
