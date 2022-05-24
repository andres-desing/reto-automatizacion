package co.com.choucair.certificate.reto.open.task;

import net.serenitybdd.screenplay.Task;
import co.com.choucair.certificate.reto.open.userinterface.IngresoFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class IngresarFiltro implements Task {
    private String producto;
    private String modelo;
    private String precio;
    private String cantidad;



    public IngresarFiltro (String producto, String modelo, String precio, String cantidad) {
        this.producto = producto;
        this.modelo = modelo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public static IngresarFiltro filtro(String producto, String modelo, String precio, String cantidad) {
        return Tasks.instrumented(IngresarFiltro.class, producto, modelo, precio, cantidad);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(IngresoFiltro.PRODUCTO),
                Enter.theValue(modelo).into(IngresoFiltro.MODELO),
                Enter.theValue(precio).into(IngresoFiltro.PRECIO),
                Enter.theValue(cantidad).into(IngresoFiltro.CANTIDAD),
                Click.on(IngresoFiltro.STATUS),
                Hit.the(Keys.ARROW_DOWN).into(IngresoFiltro.STATUS),
                Hit.the(Keys.ENTER).into(IngresoFiltro.STATUS),
                Click.on(IngresoFiltro.BOTON_FILTRAR)
        );

    }
}
