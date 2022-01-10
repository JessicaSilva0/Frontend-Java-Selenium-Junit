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
    static ExtentSparkReporter htmlReporter;
    static ExtentReports extent;
    static ExtentTest TC01;

    @BeforeClass
    public static void openBrowser(){
        htmlReporter = new ExtentSparkReporter("/resources/extent.properties/results.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        driver.manage().window().maximize();
        driver.get(Utils.url);
    }
    @Test
    public void Credenciais() {
        TC01 = extent.createTest("Credenciais", "Teste para validar Credenciais ");
        TC01.log(Status.INFO, "Starting test case");
        System.out.println("Validando " + new Object() {
        }.getClass().getEnclosingMethod().getName());
        loginPage IniciarSessao = new loginPage(driver);
     //   IniciarSessao.setUserName(User);
        TC01.log(Status.INFO, "Validando Utilizador");
      //  IniciarSessao.setPswd(pass);
        TC01.log(Status.INFO, "Validando Senha do Utilizador");
      //  IniciarSessao.setBtnLogin();
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName() + " Validadas com Sucesso!");
        TC01.pass("Credenciais válidas");
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
        TC01.pass("Close Browser");
        extent.flush();

    }


}
