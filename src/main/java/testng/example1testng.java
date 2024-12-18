package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1testng {
      @Test
      public void kitelogin(){
    	  ChromeDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://kite.zerodha.com/");
    	  Reporter.log("hi Good morning",true);
      }
}
