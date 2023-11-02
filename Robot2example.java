import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot2example {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.google.com/signup/v2/createaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmail.google.com&dsh=S-1241452747%3A1697110067336287&ec=GAlAFw&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&theme=glif&authuser=0");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
				driver.findElement(By.name("firstName")).sendKeys("Ajit");
				driver.findElement(By.name("lastName")).sendKeys("chavan");
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
