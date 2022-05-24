package co.com.choucair.certificate.reto.open.stepdefinitions;

import co.com.choucair.certificate.reto.open.questions.Verificar;
import co.com.choucair.certificate.reto.open.task.AbrirPagina;
import co.com.choucair.certificate.reto.open.task.Ingresar;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class LoginStepDefinition {

    @Before
    public void Iniciartest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que un cliente accede al sistema$")
    public void queUnClienteAccedeAlSistema() {
        OnStage.theActorCalled("").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("^ingresa las credenciales$")
    public void ingresaLasCredenciales(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> data : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(
                    data.get(0), data.get(1)));
        }
    }

    @Entonces("^se valida el acceso$")
    public void seValidaElAcceso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(),
                Matchers.equalTo("Dashboard")));
    }

}
