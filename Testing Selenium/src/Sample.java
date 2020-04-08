import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FillTimeSheet {
	
	WebDriver driver = null;
	@BeforeMethod
	public void getConection(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.indeed.com/");
	}
	@AfterMethod
	public void closeConnection(){
		driver.close();
	}
	public static void main(String[] args){
		
	}
}
