package ao.ui.portal.homePage;
import ao.ui.utils.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//tela exibida quando acessado pelo Representante
public class EmpresasInstituicoesContribuinte extends PageObjects {

    public EmpresasInstituicoesContribuinte(WebDriver driver) {
        super(driver);
    }

    By buttonSelect = By.xpath("//*[@id=\"frmRepresentations:dtRepresentation:5:btnSelect\"]");

    public void selecionaEmpresa(WebDriver.Timeouts timeouts)
    {driver.findElement(buttonSelect).click();
    }
}
