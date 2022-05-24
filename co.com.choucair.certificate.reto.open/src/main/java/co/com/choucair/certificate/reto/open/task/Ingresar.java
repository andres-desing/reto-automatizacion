package co.com.choucair.certificate.reto.open.task;

import co.com.choucair.certificate.reto.open.userinterface.IngresoDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Ingresar implements Task {

    private String usuario;
    private String contrasenna;

    public Ingresar(String usuario, String contrasenna) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    public static Ingresar credenciales(String usuario, String contrasenna) {
        return Tasks.instrumented(Ingresar.class, usuario, contrasenna);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(IngresoDatos.USUARIO),
                Enter.theValue(contrasenna).into(IngresoDatos.CONTRASENNA),
                Click.on(IngresoDatos.BOTON_LOGIN)
        );

    }
}
