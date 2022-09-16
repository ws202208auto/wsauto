package co.com.wordpress.pageobjects;

import co.com.wordpress.utils.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;

public class LoginWordPressPage extends MobilePageObject {
    public LoginWordPressPage(WebDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id="org.wordpress.android:id/login_button")
    WebElement BTN_LOGIN;
    @AndroidFindBy(id="org.wordpress.android:id/input")
    WebElement TXT_CORREO;
    @AndroidFindBy(id="org.wordpress.android:id/primary_button")
    WebElement BTN_NEXT;
    @AndroidFindBy(id="org.wordpress.android:id/login_enter_password")
    WebElement BTN_ENTER_PASSWORD;
    @AndroidFindBy(id="org.wordpress.android:id/input")
    WebElement TXT_PASSWORD;
    @AndroidFindBy(id="org.wordpress.android:id/display_name")
    WebElement LBL_NAME;

    public void realizarLogueo(List<String> loginData) {
        BTN_LOGIN.click();
        TXT_CORREO.sendKeys(loginData.get(0));
        BTN_NEXT.click();
        BTN_ENTER_PASSWORD.click();
        TXT_PASSWORD.sendKeys(loginData.get(1));
        BTN_NEXT.click();
    }

    public void verificarAcceso(List<String> loginData) {
        assertThat(loginData.get(0),loginData.contains(LBL_NAME.getText()));
    }
}
