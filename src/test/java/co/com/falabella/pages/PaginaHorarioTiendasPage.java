package co.com.falabella.pages;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PaginaHorarioTiendasPage {
    public static Target BOTON_TIENDAFALABELLA = Target.the("Boton de horarios de las tiendas de falabella").locatedBy("//a[@href=\"https://tienda.falabella.com.co/falabella-co/page/tiendas\"]");

    public static Target IFRAME_WAIT = Target.the("Esperar el iframe").located(By.id("main-Iframe-3db32790-2418-474f-90e4-7180811daa8d"));

}
