import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
//     driver.findElement(By.xpath("//div[@data-preferred-mime-type='image/jpeg']")).click();
		driver.findElement(By.xpath("(//input[(//input[@class=\"RNmpXc\"])[2]])[1]")).click();

	}

}
