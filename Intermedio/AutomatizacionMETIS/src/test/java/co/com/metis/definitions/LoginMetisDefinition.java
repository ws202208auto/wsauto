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

    @Cuando("^el escribe el usuario ejercicio y la clave ejercicio$")
    public void elEscribeElUsuarioEjercicioYLaClaveEjercicio() {
        loginMetisSteps.realizarLaAutenticacion();
    }

    @Entonces("^el ve el mensaje Bootstrap-Admin-Template$")
    public void elVeElMensajeBootstrapAdminTemplate() {
        loginMetisSteps.verificarElAccesoExitoso();
    }



}
