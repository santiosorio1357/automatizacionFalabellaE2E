package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.BarraInicio.MUESTRA_TARJETAS_CUENTAS;
import static co.com.falabella.pages.CabeceraPage.OK_SALTAR;
import static co.com.falabella.pages.OportunidadesUnicasPage.SECCION_NINOS_JUGUETERIA;
import static co.com.falabella.pages.TargetasYCuentas.BOTON_OPORTUNIDADES_UNICAS;

public class OpotunidadesUnicasStepDefinitions {
    @Dado("que {actor} busca la seccion de ninos y jugueteria")
    public void buscarOportunidadesUnicas(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                MoveMouse.to(MUESTRA_TARJETAS_CUENTAS)
        );
    }
    @Cuando("{actor} selecciona la opcion de oportunidades unicas")
    public void seleccionOportunidadesUnicas(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_OPORTUNIDADES_UNICAS)

        );
    }
    @Entonces("{actor} debe encontrar la seccion de de ninos y jugueteria")
    public void encontrarSeccionDeportes(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Ensure.that(SECCION_NINOS_JUGUETERIA).isDisplayed()
        );
    }
}
