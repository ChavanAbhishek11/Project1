import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailjava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'For my personal use')]")).click();
	driver.findElement(By.name("firstName")).sendKeys("Shruti");
	driver.findElement(By.name("lastName")).sendKeys("Chavan");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	driver.findElement(By.name("day")).sendKeys("2");
	driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
	driver.findElement(By.name("year")).sendKeys("1995");
	driver.findElement(By.xpath("(//select[@class='UDCCJb'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//option[contains(text(),'Male')])[1]")).click();
     driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
     driver.findElement(By.name("Username")).sendKeys("chavanikshruti999");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
     driver.findElement(By.name("Passwd")).sendKeys("Shruti@123");
     driver.findElement(By.name("PasswdAgain")).sendKeys("Shruti@123");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
     
     }

}
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE'
