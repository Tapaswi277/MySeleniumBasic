package scriptclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		 
		 js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
		 js.executeScript("document.getElementById('Password').value='jobprogram'");
		 js.executeScript("document.getElementById('btnLogin').click()");
		 Thread.sleep(3000);
		 String getURL = js.executeScript("return document.URL").toString();
		 System.out.println(getURL);
	}

}
