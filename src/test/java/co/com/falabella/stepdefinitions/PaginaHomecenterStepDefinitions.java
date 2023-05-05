package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.CabeceraPage.OK_SALTAR;
import static co.com.falabella.pages.PaginaHomecenterPage.IMAGE_HOMECENTER;
import static co.com.falabella.pages.PaginaPrincipalPage.BOTON_HOMECENTER;

public class PaginaHomecenterStepDefinitions {
    @Dado("que {actor} comprueba que el boton Homecenter aparezca en la pagina principal")
    public void botonPaginaPincipal(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_HOMECENTER).isDisplayed()
        );
    }
    @Cuando("{actor} da click en el Homecenter")
    public void clickHomecenter(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
                Click.on(BOTON_HOMECENTER)

        );
    }
    @Entonces("{actor} esta en la pagina principal de Homecenter")
    public void estaPaginaHomecenter(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
                Ensure.that(IMAGE_HOMECENTER).isDisplayed()
        );
    }

}