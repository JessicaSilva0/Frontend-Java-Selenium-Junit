package ao.ui.portal.test.Declaracoes;

import ao.ui.portal.declaracoes.DeclaracaoIRT;
import ao.ui.portal.homePage.loginPage;
import ao.ui.portal.homePage.EmpresasInstituicoesContribuinte;
import ao.ui.utils.Utils;
import jdk.jfr.Description;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static ao.ui.portal.Application.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class DeclaracaoAnualIRT {

    @BeforeClass
    public static void AbrirNavegador(){
        driver.manage().window().maximize();
        driver.get(Utils.url);
        loginPage novoLogin = new loginPage(driver);
        novoLogin.credenciais(Utils.nifRepresentante, Utils.senhaRepresentante);
        EmpresasInstituicoesContribuinte representante = new EmpresasInstituicoesContribuinte(driver);
        representante.selecionaEmpresa(driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS));
    }

    @Test
    @Description("Criar nova Declaracao Anual IRT Grupo A")
    public void CriarDA_IRTGrupoA() {
        DeclaracaoIRT novaDeclaracao = new DeclaracaoIRT(driver);
        //Menu de Serviços - Declarações
        novaDeclaracao.MenuIRT();
        novaDeclaracao.setBtnCriarDeclaracao();
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(elementToBeClickable(By.id("j_id_96:j_id_ak")));
        novaDeclaracao.setBtnConfirmar();
        //declaracaoIRTGroupA.setBtnGravar();


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("/home/jessica-silva/Documentos/scr001.png"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


 //  @AfterClass
 //public static void fecharNavegador(){
 //     driver.quit();
 //  }

}
