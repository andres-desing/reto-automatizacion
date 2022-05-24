package co.com.choucair.certificate.reto.open.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IngresoFiltro  extends PageObject {
    public static final Target PRODUCTO = Target.the("ingresa producto")
            .located(By.id("input-name"));
    public static final Target MODELO = Target.the("ingresa modelo")
            .located(By.id("input-model"));
    public static final Target PRECIO = Target.the("ingre saprecio")
            .located(By.id("input-price"));
    public static final Target CANTIDAD = Target.the("ingresa cantidad")
            .located(By.id("input-quantity"));
    public static final Target STATUS = Target.the("ingesa seleccion")
            .located(By.id("input-status"));
    public static final Target BOTON_FILTRAR = Target.the("onclick boton").
            located(By.id("button-filter"));

    public static final Target LBL_FILTRO = Target.the("ingreso filtros").
            located(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]/a"));
}