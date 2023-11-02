import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj =new ChromeDriver();
		obj.navigate().to("https://www.google.com");
		
	}

}
