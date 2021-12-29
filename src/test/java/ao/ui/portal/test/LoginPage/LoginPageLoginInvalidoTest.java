package ao.ui.portal.test.LoginPage;

import ao.ui.utils.Utils;
import ao.ui.portal.homePage.loginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static ao.ui.portal.Application.driver;

public class LoginPageLoginInvalidoTest {

    @BeforeClass
    public static void openBrowser(){
        driver.manage().window().maximize();
        driver.get(Utils.url);
    }
    @Test
    public void CredenciaisInvalidas(){
        loginPage InicioSessao = new loginPage(driver);
        InicioSessao.setUserName("ANA NARCISO");
        InicioSessao.setPswd("7485599");
        InicioSessao.setBtnLogin();

        try {
            driver.findElement(By.id("j_username"));
            System.out.println("Utilizador ou Palavra Passe Incorrecta!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
