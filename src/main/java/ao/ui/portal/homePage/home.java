package ao.ui.portal.homePage;

import ao.ui.utils.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home extends PageObjects {
    //constructor
    public home (WebDriver driver) {super(driver);}

    //locators
    By userName = By.id("j_username");
    By pswd = By.id("j_password");
    By btnLogin = By.id("btnLoginDC");

    //metodos
    public void setUserName(String utilizador){driver.findElement(userName).sendKeys(utilizador);}
    public void setPswd(String password){driver.findElement(pswd).sendKeys(password);}
    public void setBtnLogin(){driver.findElement(btnLogin).click();}

}
