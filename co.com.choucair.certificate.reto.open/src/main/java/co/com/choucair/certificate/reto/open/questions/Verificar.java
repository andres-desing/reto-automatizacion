package co.com.choucair.certificate.reto.open.questions;

import co.com.choucair.certificate.reto.open.userinterface.IngresoDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar resultado() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(IngresoDatos.LBL_DASHBOARD).viewedBy(actor).asString();
    }
}
