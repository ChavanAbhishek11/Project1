import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookjava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
//		driver.findElement(By.I(//*[@id=\"voiceSearchButton\"]")).click();
		driver.findElement(By.id("voiceSearchButton")).click();
		driver.findElement(By.xpath("//button[@id='lensSearchButton' ]")).click();
		driver.findElement(By.xpath("//input[@data-ved='0ahUKEwiSmq3t9dmBAxUjCrkGHXqtB04Q4dUDCA8']")).click();  
	} 

}
