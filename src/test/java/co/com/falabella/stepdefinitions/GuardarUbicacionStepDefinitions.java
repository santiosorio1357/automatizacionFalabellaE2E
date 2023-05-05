package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.CabeceraPage.*;
import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.DetalleUbicacionPage.*;

public class GuardarUbicacionStepDefinitions {
    @Dado("que {actor} se dirige a elegir ubicacion")
    public void busquedaIngresoUbicacion(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_HOMECENTER).isDisplayed()


        );
    }
    @Cuando("{actor} selecciona como departamento antioquia, ciudad medellin, y barrio medellin")
    public void ingresaCamposDepatamentoCiudadBarrio(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_INGRESAR_UBICACION).isDisplayed(),
                Ensure.that(MODAL_LOCATION).isDisplayed(),

                Click.on(INPUT_DEPARTAMENTO),
                Click.on(INPUT_DEPARTAMENTO_SELECTED),

                Click.on(INPUT_CIUDAD),
                Scroll.to(INPUT_CIUDAD_SELECTED),
                Click.on(INPUT_CIUDAD_SELECTED),

                Click.on(INPUT_BARRIO),
                Click.on(INPUT_BARRIO_SELECTED),

                Click.on(BOTON_GUARDAR)

        );
    }
    @Entonces("{actor} observa que se {string}")
    public void muestraUbicacion(Actor actor, String ciudad_entrega) {
        actor.attemptsTo(
                Ensure.that(ETIQUETA_UBICACION).text().isEqualTo(ciudad_entrega)
        );
    }
}