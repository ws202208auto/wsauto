package co.com.wordpress.definitions;

import co.com.wordpress.steps.LoginWordPressSteps;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginWordPressDefinition {
    @Steps
    LoginWordPressSteps loginWordPressSteps;


    @Dado("^que Yeison quiere ingresar a WordPress$")
    public void queYeisonQuiereIngresarAWordPress() {
        loginWordPressSteps.abrirApp();
    }

    @Cuando("^el ingresa el ingresa las credenciales$")
    public void elIngresaElIngresaLasCredenciales(DataTable loginData){
        List<List<String>> dato = loginData.asLists(String.class);
        loginWordPressSteps.autenticarseEnLaApp(dato);
    }

    @Entonces("^el ve el mensaje$")
    public void elVeElMensaje(DataTable loginData) {
        List<List<String>> datos = loginData.asLists(String.class);
        loginWordPressSteps.verificarAcceso(datos);
    }

}
