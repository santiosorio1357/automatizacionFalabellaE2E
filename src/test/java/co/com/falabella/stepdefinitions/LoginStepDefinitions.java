package co.com.falabella.stepdefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static co.com.falabella.pages.BarraInicio.DESPLEGABLE_LOGIN;
import static co.com.falabella.pages.BarraInicio.DESPLEGABLE_USUARIO_LOGEADO;
import static co.com.falabella.pages.BarraLogin.*;
import static co.com.falabella.pages.CabeceraPage.OK_SALTAR;
import static co.com.falabella.pages.FormLogin.*;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginStepDefinitions {
    @Dado("que {actor} busca ingresar con su cuenta")
    public void ingresoMenu(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                MoveMouse.to(DESPLEGABLE_LOGIN),
                Click.on(BOTON_INCIAR_SESION)

        );
    }
    @Cuando("{actor} ingresa su correo {string} y contrasena {string}")
    public void llenarInformacion(Actor actor,String correo, String contrasena) {
        actor.attemptsTo(
                Enter.theValue(correo).into(INPUT_CORREO),
                Enter.theValue(contrasena).into(INPUT_CONTRASENA),
                Click.on(BOTON_INGRESAR),
                Switch.toNewWindow()
        );
    }
    @Entonces("{actor} debe tener acceso a la informacion de su cuenta")
    public void ingresoCuienta(Actor actor) {
        actor.attemptsTo(
                Click.on(DESPLEGABLE_USUARIO_LOGEADO),
                Click.on(BOTON_MI_CUENTA),
                WaitUntil.the(BOTON_CUENTA, isVisible()).forNoMoreThan(5).seconds()

        );
    }
}
