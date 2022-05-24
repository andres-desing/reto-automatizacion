package co.com.choucair.certificate.reto.open.questions;

import co.com.choucair.certificate.reto.open.userinterface.Catalogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VerificarProducto implements Question{

    public static VerificarProducto opcion(){return new VerificarProducto();}

    @Override
    public Object answeredBy(Actor actor) {return Text.of(Catalogo.LBL_PRODUCTS).viewedBy(actor).asString();}
}

