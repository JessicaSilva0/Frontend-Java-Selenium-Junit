package ao.ui.portal.test.LoginPage;

import ao.ui.utils.Utils;
import jdk.jfr.Description;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static ao.ui.portal.Application.driver;
import static ao.ui.utils.Utils.User;
import static ao.ui.utils.Utils.pass;

public class loginPageTest {

    @BeforeClass
    public static void openBrowser(){
        driver.manage().window().maximize();
        driver.get(Utils.url);
    }
    @Test
    @Description("TC01 - Sessão inválida")
    public void Login_Invalido(){
        ao.ui.portal.homePage.loginPage InicioSessao = new ao.ui.portal.homePage.loginPage(driver);
        InicioSessao.credenciais("ANA NARCISO","test124");

        try {
            driver.findElement(By.id("j_username"));
            System.out.println("Utilizador ou Palavra Passe Incorrecta!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    @Description("TC02 - Sessão válida")
    public void Login_Valido(){
        System.out.println("Validando " + new Object() {}.getClass().getEnclosingMethod().getName());
        ao.ui.portal.homePage.loginPage IniciarSessao = new ao.ui.portal.homePage.loginPage(driver);
        IniciarSessao.credenciais(User, pass);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName() + " com Sucesso!");
    }

    @AfterClass
    public static void closeBrowser(){

        driver.quit();
    }

}
