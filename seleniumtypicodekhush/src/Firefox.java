import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://jsonplaceholder.typicode.com/");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        System.out.println(driver.getPageSource());
    }
}
