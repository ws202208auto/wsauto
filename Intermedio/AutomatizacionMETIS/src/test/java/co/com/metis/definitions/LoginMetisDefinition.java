package co.com.metis.definitions;

import co.com.metis.steps.LoginMetisSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginMetisDefinition {
    @Steps
    LoginMetisSteps loginMetisSteps;

    @Dado("^que Yeison quiere ingresar a Metis$")
    public void queYeisonQuiereIngresarAMetis() {
        loginMetisSteps.abrirLaPagina();
    }

    @Cuando("^el escribe el usuario (.*) y la clave (.*)$")
    public void elEscribeElUsuarioEjercicioYLaClaveEjercicio(String usuario, String password) {
        loginMetisSteps.realizarLaAutenticacion(usuario,password);
    }

    @Entonces("^el ve el mensaje (.*)$")
    public void elVeElMensajeBootstrapAdminTemplate(String titulo) {
        loginMetisSteps.verificarElAccesoExitoso(titulo);
    }

}
