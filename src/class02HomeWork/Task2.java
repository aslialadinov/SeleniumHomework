package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
   /*
   HW2
   navigate to fb.com
   click on create new account
   fill up all the textboxes
   click on sign up button
   close the pop-up
   close the browser
   just fill in text boxes or button, no need to deal with other webElements
   also u will need a Thread.sleep after clcikng on create new account
    */
   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(3000);
       driver.findElement(By.name("firstname")).sendKeys("Eva");
       driver.findElement(By.name("lastname")).sendKeys("Swift");
       driver.findElement(By.name("reg_email__")).sendKeys("swift@gmail.com");
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("swift@gmail.com");
       driver.findElement(By.name("reg_passwd__")).sendKeys("nmkj4578");
       driver.findElement(By.name("birthday_month")).sendKeys("February");
       driver.findElement(By.name("birthday_day")).sendKeys("4");
       driver.findElement(By.name("birthday_year")).sendKeys("2000");
      // driver.findElement(By.name("sex")).click();
       //driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
       driver.findElement(By.name("websubmit")).click();
     //  driver.findElement(By.xpath("//*[contains(text),'Continue')]")).click();
     //  driver.findElement(By.linkText("Continue")).click();
       Thread.sleep(3000);
       driver.quit();
   }
}
