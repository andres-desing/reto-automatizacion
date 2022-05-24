package co.com.choucair.certificate.reto.open.questions;

import co.com.choucair.certificate.reto.open.userinterface.IngresoFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarFiltro implements Question {

    public static VerificarFiltro filtrar(){return new VerificarFiltro();}

    @Override
    public Object answeredBy(Actor actor) {return Text.of(IngresoFiltro.LBL_FILTRO).viewedBy(actor).asString();}
}
