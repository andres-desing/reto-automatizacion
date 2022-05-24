package co.com.choucair.certificate.reto.open.stepdefinitions;

import co.com.choucair.certificate.reto.open.questions.VerificarFiltro;
import co.com.choucair.certificate.reto.open.task.EntrarCatalogo;
import co.com.choucair.certificate.reto.open.task.EntrarProductos;
import co.com.choucair.certificate.reto.open.task.Ingresar;
import co.com.choucair.certificate.reto.open.task.IngresarFiltro;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class FiltroStepDefinition {

    @Cuando("^se loguea$")
    public void seLoguea(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> data : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(
                    data.get(0), data.get(1)));
        }
    }

    @Y("^selecciona la opcion catalog y selecciona productos$")
    public void seleccionaLaOpcionCatalogYSeleccionaProductos() {
     OnStage.theActorInTheSpotlight().attemptsTo(EntrarCatalogo.open(), EntrarProductos.open());
    }

    @Y("^filtra por producto, modelo, precio, status$")
    public void filtraPorProductoModeloPrecioStatus(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> data : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(IngresarFiltro.filtro(
                    data.get(0), data.get(1), data.get(2), data.get(3)));
        }
    }

    @Y("^despues se le da click en el boton filter$")
    public void despuesSeLeDaClickEnElBotonFilter() {
    }

    @Entonces("^se verifica el producto filtrado$")
    public void seVeriFicaElProductoFiltrado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarFiltro.filtrar(),
                Matchers.equalTo("Home")));
    }
}
