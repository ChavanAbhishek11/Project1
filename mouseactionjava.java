import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver  driver = new ChromeDriver();
driver.get("https://jqueryui.com/");
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.linkText("draggable")).click();
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
Actions mouse = new Actions(driver);
mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();
	}

}
