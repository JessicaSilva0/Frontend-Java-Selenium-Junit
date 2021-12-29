package ao.ui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
    public static WebDriver driver;
    public PageObjects (WebDriver driver)
    {
        PageObjects.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
