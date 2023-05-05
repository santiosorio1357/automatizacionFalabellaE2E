package co.com.falabella.pages;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class BarraInicio {
    public static Target DESPLEGABLE_LOGIN = Target.the("Desplegable Login").located(By.id("testId-UserAction-userinfo"));
    public static Target DESPLEGABLE_USUARIO_LOGEADO = Target.the("Desplegable del usuario ya logueado").locatedBy("//div[@class='Popover-module_popover-container__3qpkj Popover-module_bottom-caret-login__1WGhj']");
    public static Target MUESTRA_TARJETAS_CUENTAS = Target.the("Muestra tarjetas y cuentas").locatedBy("//div[@id='testId-extra-links-dropdown-1']");
}
