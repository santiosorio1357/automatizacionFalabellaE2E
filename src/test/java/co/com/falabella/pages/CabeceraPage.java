package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("testId-SearchBar-Input"));
    public static Target OK_SALTAR = Target.the("Saltar").located(By.id("testId-onboarding-desktop-skip"));
    public static Target NO_GRACIAS = Target.the("No gracias").locatedBy("/html/body/div[2]//div/div/div[3]/button[1]");

}
