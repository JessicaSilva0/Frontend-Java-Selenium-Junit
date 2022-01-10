package ao.ui.portal.test.Declaracoes;

import ao.ui.portal.declaracoes.irt;
import ao.ui.portal.homePage.loginPage;
import ao.ui.portal.homePage.frmRepresentations;
import ao.ui.utils.Utils;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static ao.ui.portal.Application.driver;

public class IRTdAM2Test {


    @BeforeClass
    public static void AbrirNavegador(){
        driver.manage().window().maximize();
        driver.get(Utils.url);
        loginPage novoLogin = new loginPage(driver);
        novoLogin.loginValidUser(Utils.nifRepresentante, Utils.senhaRepresentante);
       // novoLogin.setUserName(Utils.nifRepresentante);
       // novoLogin.setPswd(Utils.senhaRepresentante);
       // novoLogin.setBtnLogin();
    }

    @Test
    public void CriarDeclaracaoAnualIRT() throws Exception{
        frmRepresentations representations = new frmRepresentations(driver);
        representations.setButtonSelect();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        irt consulta = new irt(driver);
        consulta.setMenuDeclaracoes();
        consulta.setSubmenuIRT();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        consulta.setOpcaoDeclaracaoAnual();
        consulta.setBtnCriarDeclaracao();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_id_94:j_id_ai")));
        consulta.setBtnConfirmar();
        consulta.setBtnGravar();


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("/home/jessica-silva/Documentos/scr001.png"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


   //@AfterClass
 //public static void fecharNavegador(){
   //   driver.quit();
  // }

}
