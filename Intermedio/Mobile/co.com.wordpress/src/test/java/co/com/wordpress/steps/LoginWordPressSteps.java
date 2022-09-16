package co.com.wordpress.steps;

import co.com.wordpress.pageobjects.LoginWordPressPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class LoginWordPressSteps {
    LoginWordPressPage loginWordPressPage;

    @Step
    public void abrirApp() {
    }

    @Step
    public void autenticarseEnLaApp(List<List<String>> loginData) {
        loginWordPressPage.realizarLogueo(loginData.get(1));
    }

    @Step
    public void verificarAcceso(List<List<String>> loginData) {
        loginWordPressPage.verificarAcceso(loginData.get(1));
    }
}
