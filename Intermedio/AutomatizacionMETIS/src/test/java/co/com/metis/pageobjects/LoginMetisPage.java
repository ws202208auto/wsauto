package co.com.metis.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.*;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class LoginMetisPage extends PageObject {
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElementFacade TXT_USUARIO;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElementFacade TXT_PASSWORD;
    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    WebElementFacade BTN_SIGNIN;

    @FindBy(id = "bootstrap-admin-template")
    WebElementFacade LBL_TITULO;

    public void autenticarme(String usuario, String password) {
        TXT_USUARIO.sendKeys(usuario);
        TXT_PASSWORD.sendKeys(password);
        BTN_SIGNIN.click();
    }

    public void verificarTitulo(String titulo) {
        assertThat(LBL_TITULO.getText(),containsText(titulo));
    }
}
