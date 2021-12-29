package ao.ui.portal.homePage;
import ao.ui.utils.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ao.ui.utils.PageObjects.driver;

//tela exibida quando acessado pelo Representante
public class frmRepresentations extends PageObjects {

    public frmRepresentations(WebDriver driver) {
        super(driver);
    }

    By buttonSelect = By.xpath("//*[@id=\"frmRepresentations:dtRepresentation:5:btnSelect\"]");

    public void setButtonSelect(){driver.findElement(buttonSelect).click();}
}
