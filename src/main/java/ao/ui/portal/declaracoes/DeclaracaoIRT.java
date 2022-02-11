package ao.ui.portal.declaracoes;
import ao.ui.utils.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DeclaracaoIRT extends PageObjects {
    public DeclaracaoIRT(WebDriver driver) {super(driver);}
//Menu de Serviços - Declarações
    By menuDeclaracoes  =         By.xpath("//a[@id='btnDeclaration']/span");
    By submenuIRT      =          By.xpath("//ul[@id='accordion2']/li[2]/a/span");
    By opcaoDeclaracaoAnual =     By.xpath("//li[9]/ul/li[2]/ul/li[4]/a/span");

    public void MenuIRT(){
        driver.findElement(menuDeclaracoes).click();
        driver.findElement(submenuIRT).click();
        driver.findElement(opcaoDeclaracaoAnual).click();
    }
    //public void setMenuDeclaracoes(){driver.findElement(menuDeclaracoes).click();}
    //public void setSubmenuIRT(){driver.findElement(submenuIRT).click();}
    //public void setOpcaoDeclaracaoAnual(){driver.findElement(opcaoDeclaracaoAnual).click();}

//tela Consulta de Declaração Anual de Imposto sobre os Rendimentos do Trabalho
    By snumeroFiscal         =  By.id("form-search:j_id_78");
    By snomeconta            =  By.id("form-search:account_label");
    By sexercicio            =  By.id("form-search:year-filter_label");
    By periodoEntregaInicio =  By.id("form-search:j_id_7s");
    By datecalendar          = By.id("ui-datepicker-div");
    By periodoEntregaFinal  =  By.id("form-search:j_id_7u");
    By sestadoForm           =  By.id("form-search:j_id_7x_label");
    By snumdeclaracao        =  By.id("form-search:j_id_84");
    By sorigemForm           =  By.id("form-search:j_id_89_label");
    By btnPesquisar          =  By.id("form-search:j_id_8g");
//Ações após search
    By acaoEditar    = By.id("form-search:annualDeclarations:0:j_id_8h");
    By acaoVisualizar = By.id("form-search:annualDeclarations:0:j_id_8i");
    By acaoCancelar  = By.id("form-search:annualDeclarations:0:j_id_8j");
    By acaoAbrirPDF = By.id("form-search:annualDeclarations:0:j_id_91");
    By btnCriarDeclaracao    =  By.id("form-search:j_id_8i");

    public void consultaPeriodo(){
        driver.findElement(btnPesquisar).click();
    }
    public void setBtnCriarDeclaracao(){
        driver.findElement(btnCriarDeclaracao).click();
    }
    ///modal irt-declaracao-anual-consulta ao clicar no btnCriarDeclaracao
     By numeroFiscal = By.id("j_id_94:j_id_99");
     By nomeconta    = By.id("j_id_94:j_id_9e_label");
     By ano          = By.id("j_id_96:year_input");
     By modeloirt    = By.id("j_id_94:groupType_label");
     By tipodeclaracao = By.id("j_id_94:mapType");
     By motivo         = By.id("j_id_94:reason_label");
     By numNotificacao    = By.id("j_id_94:notification");
     By dataNotificacao = By.id("j_id_94:notification-date_input");
     By btnConfirmar = By.id("j_id_96:j_id_ak");
     By btnVoltar    = By.id("j_id_94:j_id_aj");

        public void setBtnConfirmar() {
            //rever
            //Select drpexercicio = new Select (driver.findElement(ano));
            //drpexercicio.selectByIndex(2);
            driver.findElement(btnConfirmar).click();
        }

        //msg "Nº Notificação é obrigatório" caso motivo = notificacao e o campo numNotificacao não preenchido


    //tela Declaração Anual Modelo 2 (Grupo A) de Imposto sobre os Rendimentos do Trabalho
    //2 - ELEMENTOS DE SUPORTE À DECLARAÇÃO FISCAL (Modelo 2)
    By atualizarFicheiro = By.id("frmAnnualDeclarationModel2:j_id_9x");
    By btnGravar         = By.id("frmAnnualDeclarationModel2:j_id_ca");

    public void setBtnGravar(){driver.findElement(btnGravar).click();}

}