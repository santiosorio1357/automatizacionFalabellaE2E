package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PaginaPrincipalPage {
    public static Target BOTON_HOMECENTER = Target.the("Boton de Homecenter").locatedBy("//div[@id=\"bottom-header\"]/nav/div[2]/div[1]/div/div[2]");
    public static Target BOTON_INGRESAR_UBICACION = Target.the("Boton ingresar ubicacion").located(By.id("geofinder-button-open"));
    public static Target MODAL_LOCATION = Target.the("Input Barrio").located(By.id("//div[@id='zone_modal_wrap']"));
    public static Target  SECCION_AYUDA= Target.the("Seccion de ayuda").located(By.id("testId-extra-links-dropdown-4"));
    public static Target  BOTON_HORARIO_TIENDA= Target.the("Boton de horario de las tiendas").located(By.id("testId-bottom-header-links-4-2"));
    public static Target  BOTON_POLITICA_DE_PRIVACIDAD= Target.the("Boton de Política de Privacidad").locatedBy("//div[@id=\"__next\"]/footer/section[2]/div/div[2]/a[3]");
}