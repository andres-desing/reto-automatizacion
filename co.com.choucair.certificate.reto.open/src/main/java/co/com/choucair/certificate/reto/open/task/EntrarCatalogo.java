package co.com.choucair.certificate.reto.open.task;

import co.com.choucair.certificate.reto.open.userinterface.Catalogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EntrarCatalogo implements Task {


    public static EntrarCatalogo open() {
        return Tasks.instrumented(EntrarCatalogo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Catalogo.BOTON_CATALOGO)
        );

    }
}
