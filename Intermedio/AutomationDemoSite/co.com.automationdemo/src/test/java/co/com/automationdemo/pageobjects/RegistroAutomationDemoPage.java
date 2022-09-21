package co.com.automationdemo.pageobjects;

import co.com.automationdemo.models.RegistroData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demo.automationtesting.in/Register.html")
public class RegistroAutomationDemoPage extends PageObject {
    @FindBy (xpath = "//input[@ng-model='FirstName']")
    WebElementFacade FIRST_NAME;
    public void diligenciarPantalla(RegistroData registroData) {
        FIRST_NAME.sendKeys(registroData.getFisrtName());
    }
}
