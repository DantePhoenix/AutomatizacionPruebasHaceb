package com.haceb.steps;

import com.haceb.pages.RegistroUsuarioPage;
import com.haceb.pages.ValidarRegistroUsuarioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.ArrayList;


public class ValidarRegistroUsuarioSteps {
    @Page
    ValidarRegistroUsuarioPage validarRegistroUsuarioPage;
    @Page
    RegistroUsuarioPage registroUsuarioPage;
    @Step
    public void cambiarVentana() {
        ArrayList<String> ventana = new ArrayList(registroUsuarioPage.getDriver().getWindowHandles());
        registroUsuarioPage.getDriver().switchTo().window(ventana.get(0));
    }

    @Step("El usuario podra visualizar su nombre en pantalla")
    public void validarPerfil() {

        Assert.assertThat(
                "El registro del usuario fue exitoso",
                validarRegistroUsuarioPage.getDriver().findElement(validarRegistroUsuarioPage.getLblPerfil()).isDisplayed(),
                Matchers.is(true));
    }
}

