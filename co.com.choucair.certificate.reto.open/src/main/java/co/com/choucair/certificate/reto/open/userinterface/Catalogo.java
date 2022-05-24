package co.com.choucair.certificate.reto.open.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Catalogo extends PageObject {


    public static final Target BOTON_CATALOGO = Target.the("catalogo").
            located(By.cssSelector("#menu-catalog > a"));

    public static final Target BOTON_PRODUCTO = Target.the("producto").
            located(By.xpath("//*[@id=\"collapse1\"]/li[2]"));

    public static final Target LBL_PRODUCTS = Target.the("home productos").
            located(By.xpath("//*[@id=\"content\"]/div[1]/div/h1"));
}
