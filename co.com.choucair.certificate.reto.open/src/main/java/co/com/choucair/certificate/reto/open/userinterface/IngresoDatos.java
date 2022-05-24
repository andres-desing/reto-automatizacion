package co.com.choucair.certificate.reto.open.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class IngresoDatos extends PageObject {
    public static final Target USUARIO = Target.the("ingresa usuario")
            .located(By.id("input-username"));
    public static final Target CONTRASENNA = Target.the("ingresa contraseña")
            .located(By.id("input-password"));
    public static final Target BOTON_LOGIN = Target.the("onclick boton")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button"));
    public static final Target LBL_DASHBOARD = Target.the("label home").
            located(By.cssSelector("#content > div.page-header > div > h1"));

}
