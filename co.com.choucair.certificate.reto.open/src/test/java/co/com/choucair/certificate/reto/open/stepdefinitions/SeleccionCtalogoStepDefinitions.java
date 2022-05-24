package co.com.choucair.certificate.reto.open.stepdefinitions;

import co.com.choucair.certificate.reto.open.questions.VerificarProducto;
import co.com.choucair.certificate.reto.open.task.EntrarCatalogo;
import co.com.choucair.certificate.reto.open.task.EntrarProductos;
import co.com.choucair.certificate.reto.open.task.Ingresar;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.E;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class SeleccionCtalogoStepDefinitions {

    @Cuando("^entra y selecciona la opcion catalog$")
    public void entraYSeleccionaLaOpcionCatalog(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> data : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(
                    data.get(0), data.get(1)), EntrarCatalogo.open());
        }
    }
    @Y("^despues se toma la opcion Products que muestra en pantalla los productos que hay.$")
    public void despuesSeTomaLaOpcionProductsQueMuestraEnPantallaLosProductosQueHay() {
       OnStage.theActorInTheSpotlight().attemptsTo(EntrarProductos.open());
    }



    @Entonces("^se verica el ingreso a la opcion productos$")
    public void seVerificaElIngresoAlAopcionProductos() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarProducto.opcion(),
                Matchers.equalTo("Products")));
    }


}
