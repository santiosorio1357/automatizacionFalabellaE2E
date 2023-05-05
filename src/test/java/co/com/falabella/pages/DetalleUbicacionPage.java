package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class DetalleUbicacionPage {
    public static Target INPUT_DEPARTAMENTO = Target.the("Input Departamento").located(By.id("//div[@id=\"zone_modal_wrap\"]/div/div/div/div[2]/div[1]/div/div/label"));
    public static Target INPUT_CIUDAD = Target.the("Input Ciudad").located(By.id("//div[@id=\"zone_modal_wrap\"]/div/div/div/div[2]/div[2]/div/div"));
    public static Target INPUT_BARRIO = Target.the("Input Barrio").located(By.id("//input[@id=\"geofinder-input-level3\"]"));
    public static Target ETIQUETA_UBICACION = Target.the("Etiqueta Ubicacion").locatedBy("//p[@class='Zone-module_zone-lable__25mlT Zone-module_marketplace__2q8h5']");
    public static Target INPUT_DEPARTAMENTO_SELECTED = Target.the("Input Departamento").locatedBy("//div[@id=\"zone_modal_wrap\"]/div/div/div/div[2]/div[1]/div/div/ul/li[2]");
    public static Target INPUT_CIUDAD_SELECTED = Target.the("Input Ciudad").locatedBy("//div[@id=\"zone_modal_wrap\"]/div/div/div/div[2]/div[2]/div/div/ul/li[69]");
    public static Target INPUT_BARRIO_SELECTED = Target.the("Input Barrio").locatedBy("//div[@id=\"zone_modal_wrap\"]/div/div/div/div[2]/div[3]/div/div/ul/li");

    public static Target BOTON_GUARDAR = Target.the("Input Departamento").located(By.id("geofinder-button-save"));

}