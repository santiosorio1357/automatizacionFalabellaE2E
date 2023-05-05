package co.com.falabella.pages;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class FormLogin {
    public static Target INPUT_CORREO = Target.the("Input del email").located(By.id("testId-cc-login-form-email-input"));
    public static Target INPUT_CONTRASENA = Target.the("Input de la contraseña").located(By.id("testId-cc-login-form-password-input"));
    public static Target BOTON_INGRESAR = Target.the("Boton para iniciar sesion").located(By.id("testId-cc-login-form-submit"));
    public static Target BOTON_CUENTA = Target.the("Boton configuracion de la cuenta").located(By.id("testId-navigationCard-configuremyaccount"));

}
