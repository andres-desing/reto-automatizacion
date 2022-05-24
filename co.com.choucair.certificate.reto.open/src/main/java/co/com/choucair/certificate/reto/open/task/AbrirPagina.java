package co.com.choucair.certificate.reto.open.task;


import co.com.choucair.certificate.reto.open.userinterface.PaginaOpencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private PaginaOpencart paginaOpencart;

    public static AbrirPagina urlApp() {
        return Tasks.instrumented(AbrirPagina.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaOpencart));
    }
}


