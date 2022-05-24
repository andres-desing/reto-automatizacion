package co.com.choucair.certificate.reto.open.task;

import co.com.choucair.certificate.reto.open.userinterface.Catalogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EntrarProductos implements Task{
    public static EntrarProductos open() {
        return Tasks.instrumented(EntrarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Catalogo.BOTON_PRODUCTO)
        );

    }
}

