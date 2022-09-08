package co.com.metis.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static co.com.metis.utilidades.Constantes.*;
import static org.hamcrest.MatcherAssert.*;

@DefaultUrl(URL)
public class LoginAutomationDemoPage extends PageObject {
    @FindBy(id="username")
    WebElementFacade TXT_USER;

    @FindBy(name="password")
    WebElementFacade TXT_PASSWORD;

    @FindBy(name="login")
    WebElementFacade BTN_LOGIN;

    @FindBy(css = "#page-36 > div > div.woocommerce > div > p:nth-child(1)")
    WebElementFacade LBL_HELLO;

    public void loginEnLaPagina(List<String> data) {
        TXT_USER.clear();
        TXT_USER.sendKeys(data.get(USUARIO));
        TXT_PASSWORD.sendKeys(data.get(PASSWORD));
        BTN_LOGIN.click();
    }

    public void mensajeExitoso(String mensaje) {
        assertThat(LBL_HELLO.getText(),containsText(mensaje));
    }
}
