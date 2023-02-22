package class01HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
            /*
     Task 1:
        * 1. launch the browser
        * 2. navigate to amazon website
        * 3. print out the title and the url in the console
        * 4. close the browser
    */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com?");
        driver.navigate().to("https://www.amazon.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.close();

    }

}
