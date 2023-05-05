package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadosBusquedaPage {
    public static Target BOTON_AGREGAR_CARRITO_PRIMER_ELEMENTO = Target.the("boton Agregar al carrito primer elemento").locatedBy("//div[@pod-layout='LIST'][1]//button[contains(@class,'button-primary')]");

}
