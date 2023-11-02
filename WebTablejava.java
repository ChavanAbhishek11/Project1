import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/chava/Downloads/WebTable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	String value =	driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
	System.out.println("Value is  " + value);
		

	}

}
