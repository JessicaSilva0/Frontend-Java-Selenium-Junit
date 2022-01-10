package ao.ui.portal.test.LoginPage;

import ao.ui.utils.Utils;
import ao.ui.portal.homePage.loginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static ao.ui.utils.Utils.User;
import static ao.ui.utils.Utils.pass;
import static ao.ui.portal.Application.driver;

public class LoginPageLoginValidoTest {

    @BeforeClass
    public static void openBrowser(){
        driver.manage().window().maximize();
        driver.get(Utils.url);
    }
    @Test
    public void Credenciais() {
        System.out.println("Validando " + new Object() {
        }.getClass().getEnclosingMethod().getName());
        loginPage IniciarSessao = new loginPage(driver);
        IniciarSessao.credenciais(User, pass);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName() + " Validadas com Sucesso!");
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }


}
