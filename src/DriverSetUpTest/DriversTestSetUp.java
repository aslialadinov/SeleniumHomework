package DriverSetUpTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversTestSetUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //For windows add extension .exe
        //You can use \\
        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("https://www.google.com/");//Navigate to the specified url

        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        // For windows add extension .exe
        //You van use\\
        WebDriver driver1=new FirefoxDriver();//Launch the browser
        driver1.get("https://www.google.com/");//Navigate to the specified url


        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver driver2=new EdgeDriver();
        driver2.get("https://www.google.com/");


    }

}
