package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.CabeceraPage.OK_SALTAR;
import static co.com.falabella.pages.PaginaPrincipalPage.BOTON_POLITICA_DE_PRIVACIDAD;
import static co.com.falabella.pages.PoliticaPrivacidadPages.ACCORDEON_POLITICA_DE_PRIVACIDAD;

public class PoliticaPrivacidadStepDefinitions {
    @Dado("que {actor} busca las politicas de privacidad")
    public void ScrollHastaTerminosYCondiciones(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Scroll.to(BOTON_POLITICA_DE_PRIVACIDAD)
        );
    }
    @Cuando("{actor} da click a Politica de privacidad")
    public void ClickBotonTYC(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_POLITICA_DE_PRIVACIDAD)
        );
    }
    @Entonces("{actor} debe encontrar las politicas de privacidad")
    public void Acordion_TYC(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR)
                Ensure.that(ACCORDEON_POLITICA_DE_PRIVACIDAD).textValues().hasSizeGreaterThanOrEqualTo(23)

        );
    }
}
