package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class UsuarioPage extends PageObject {
    public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.id("input"));
}
