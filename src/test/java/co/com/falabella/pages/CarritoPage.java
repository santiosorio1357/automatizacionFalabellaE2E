package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {
    public static Target LIST_CARRITO = Target.the("Elementos del carrito").locatedBy("//section[@class='fb-product-item']");

}
