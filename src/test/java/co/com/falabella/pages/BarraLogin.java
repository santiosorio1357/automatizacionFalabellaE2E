package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class BarraLogin {
    public static Target BOTON_INCIAR_SESION = Target.the("Boton para iniciar sesion").located(By.id("testId-loggedout-item-0"));
    public static Target BOTON_MI_CUENTA = Target.the("Boton para acceder a la informacion de tu cuenta").located(By.id("testId-loggedin-item-0"));

}
