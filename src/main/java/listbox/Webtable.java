package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://magnus.jalatechnologies.com/");
driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
driver.findElement(By.id("Password")).sendKeys("jobprogram");
driver.findElement(By.id("btnLogin")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Employee")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Search")).click();
Thread.sleep(3000);
WebElement table=driver.findElement(By.tagName("table"));
List<WebElement> tableRow=table.findElements(By.tagName("tr"));
for(int i=0;i<=tableRow.size();i++) {
		System.out.println(tableRow.get(i).getText());

	}

}

}