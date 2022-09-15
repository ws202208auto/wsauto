package co.com.eribank.pageobjects;

import co.com.eribank.utils.MobilePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.*;

public class LoginEribankAppPage extends MobilePageObject {
    public LoginEribankAppPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id="com.experitest.ExperiBank:id/usernameTextField")
    WebElement TXT_USAURIO;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/passwordTextField")
    WebElement TXT_CLAVE;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/loginButton")
    WebElement BTN_LOGIN;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View")
    WebElement LBL_MENSAJE;

    By loc_acceptAlert = MobileBy.ByAndroidUIAutomator.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    //WebElement BTN_YES;
    public void realizarAutenticacion(String usuario, String clave) {
        if (!Serenity.getWebdriverManager().getCurrentDriver().findElements(loc_acceptAlert).isEmpty()) Serenity.getWebdriverManager().getCurrentDriver().findElement(loc_acceptAlert).click();
        TXT_USAURIO.sendKeys(usuario);
        TXT_CLAVE.sendKeys(clave);
        BTN_LOGIN.click();
    }

    public void verificarAccesoExitoso(String mensaje) {
        String mensaje_pantalla = LBL_MENSAJE.getText();
        //mensaje_pantalla.contains(mensaje);
        assertThat(mensaje_pantalla,mensaje_pantalla.contains(mensaje));
    }
}
