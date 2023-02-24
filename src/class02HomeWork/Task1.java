package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
/*
    HW1:
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
*/
public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.id("customer.firstName")).sendKeys("Asli");
    driver.findElement(By.id("customer.lastName")).sendKeys("Aladinov");
    driver.findElement(By.id("customer.address.street")).sendKeys("124563 street 120 west");
    driver.findElement(By.id("customer.address.city")).sendKeys("Tucson");
    driver.findElement(By.id("customer.address.state")).sendKeys("AZ");
    driver.findElement(By.id("customer.address.zipCode")).sendKeys("12456");
    driver.findElement(By.id("customer.phoneNumber")).sendKeys("(201)457-2060");
    driver.findElement(By.id("customer.ssn")).sendKeys("1234456789");
    driver.findElement(By.id("customer.username")).sendKeys("selen@gmail.com");
    driver.findElement(By.id("customer.password")).sendKeys("124567890");
    driver.findElement(By.id("repeatedPassword")).sendKeys("124567890", Keys.ENTER);
    Thread.sleep(3000);
    //driver.findElement(By.className("button")).click();
    Thread.sleep(3000);
    driver.quit();
}
}
