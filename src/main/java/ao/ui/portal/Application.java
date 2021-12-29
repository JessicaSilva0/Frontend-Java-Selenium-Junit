package ao.ui.portal;

import ao.ui.utils.Utils;
import ao.ui.portal.Annotations.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Main
public class Application {
    public static final WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().window().maximize();
        driver.get(Utils.url);
    }
}
