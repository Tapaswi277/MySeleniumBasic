package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameclass {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://magnus.jalatechnologies.com/");
WebElement username=driver.findElement(By.id("UserName"));
username.sendKeys("training@jalaacademy.com");

WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
password.sendKeys("jobprogram");

driver.findElement(By.xpath("//button[text()='Sign In']")).click();
Thread.sleep(3000);


WebElement moretab=driver.findElement(By.linkText("More"));
moretab.click();
Thread.sleep(3000);

WebElement iframetab=driver.findElement(By.linkText("iFrames"));
iframetab.click();
Thread.sleep(3000);

driver.switchTo().frame("iframe2");
WebElement toggle=driver.findElement(By.linkText("Toggle navigation"));
toggle.click();
Thread.sleep(3000);

WebElement employee=driver.findElement(By.linkText("Employee"));
employee.click();
Thread.sleep(3000);


WebElement create=driver.findElement(By.linkText("Create"));
create.click();
//driver.switchTo().parentFrame();
Thread.sleep(3000);

WebElement firstname=driver.findElement(By.id("FirstName"));
firstname.sendKeys("saladi");


Thread.sleep(3000);

WebElement lastname=driver.findElement(By.id("LastName"));
lastname.sendKeys("tapaswi");
Thread.sleep(3000);

WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email Id']"));
email.sendKeys("tapaswisaladi@gmail.com");
Thread.sleep(3000);


WebElement phonenno=driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
phonenno.sendKeys("8790905716");
Thread.sleep(3000);

WebElement dob=driver.findElement(By.id("DOB"));
dob.sendKeys("26/07/1994");
Thread.sleep(3000);





}

}
