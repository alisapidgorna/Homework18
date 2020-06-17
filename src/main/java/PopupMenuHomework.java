import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class PopupMenuHomework {
    public static String browser = "chrome";
    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://deluxe-menu.com//popup-mode-sample.html");
        WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
        Actions actions = new Actions(driver);
        actions.contextClick(img).perform();

        WebElement first =  driver.findElement(By.id("dm2m1i1tdT"));
        actions.contextClick(first).perform();
        System.out.println("Tab number one is: " + first.getText());

        WebElement second =  driver.findElement(By.id("dm2m2i4tdT"));
        actions.contextClick(second).perform();
        System.out.println("Tab number two is: " + second.getText());

        WebElement third =  driver.findElement(By.id("dm2m4i1tdT"));
        actions.contextClick(third).perform();
        System.out.println("Tab number three is: " + third.getText());

        WebElement four =  driver.findElement(By.id("dm2m6i2tdT"));
        actions.contextClick(four).perform();
        System.out.println("Tab number four is: " + four.getText());
    }
}
