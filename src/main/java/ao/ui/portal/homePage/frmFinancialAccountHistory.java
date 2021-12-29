package ao.ui.portal.homePage;
import ao.ui.utils.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//tela exibida quando acessado pelo Responsavel
public class frmFinancialAccountHistory extends PageObjects {
    public frmFinancialAccountHistory(WebDriver driver) {super(driver);}

    //Menu Declaracoes-IRT-DA
    By menuDeclaracoes  =      By.xpath("//a[@id='btnDeclaration']/span");
    By subMenuIRT       =      By.xpath("//ul[@id='accordion2']/li[2]/a/span");
    By opcaoDeclaracaoAnual =  By.xpath("//li[9]/ul/li[2]/ul/li[4]/a/span");

    public void setMenuDeclaracoes(){driver.findElement(menuDeclaracoes).click();}
    public void setSubMenuIRT(){driver.findElement(subMenuIRT).click();}
    public void setOpcaoDeclaracaoAnual(){driver.findElement(opcaoDeclaracaoAnual).click();}

}

