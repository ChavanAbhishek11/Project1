import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook3java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		driver.findElement(By.name("lastname")).sendKeys("Chavan");
		driver.findElement(By.name("reg_email__")).sendKeys("chavanabhishek724@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("chavanabhishek724@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Abhishek@123");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_month")).sendKeys("july");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        
//        driver.findElement(By.className(" _58mt")).click();
        driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();     
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        driver.findElement(By.xpath("(//option[contains(text(),'Male')])[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        
	}

}
