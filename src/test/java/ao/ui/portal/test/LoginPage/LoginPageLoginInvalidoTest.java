package ao.ui.portal.test.LoginPage;

import ao.ui.utils.Utils;
import ao.ui.portal.homePage.loginPage;
import jdk.jfr.Description;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static ao.ui.portal.Application.driver;
import static ao.ui.utils.Utils.User;
import static ao.ui.utils.Utils.pass;

public class LoginPageLoginInvalidoTest {

    @BeforeClass
    public static void openBrowser(){
        driver.manage().window().maximize();
        driver.get(Utils.url);
    }
    @Test
    @Description("Sessão invalida")
    public void CredenciaisInvalidas(){
        loginPage InicioSessao = new loginPage(driver);
        InicioSessao.credenciais("ANA NARCISO","test124");

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

    @Test
    @Description("Sessão valida")
    public void credenciaisvalidas(){
        System.out.println("Validando " + new Object() {}.getClass().getEnclosingMethod().getName());
        loginPage IniciarSessao = new loginPage(driver);
        IniciarSessao.credenciais(User, pass);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName() + " Validadas com Sucesso!");
    }

}
