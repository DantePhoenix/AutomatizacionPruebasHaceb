package com.haceb.stepDefinitions;

import com.haceb.steps.DatosAddRegistroUsuarioSteps;
import com.haceb.steps.RegistrarUsuarioSteps;
import com.haceb.steps.ValidarRegistroUsuarioSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class RegistrarUsuarioStepDefinition {

    @Steps
    RegistrarUsuarioSteps registrarUsuarioSteps;
    @Steps
    DatosAddRegistroUsuarioSteps datosAddRegistroUsuarioSteps;
    @Steps
    ValidarRegistroUsuarioSteps validarRegistroUsuarioSteps;

    @Dado("Que el usuario ingrese al sitio web")
    public void queElUsuarioIngreseAlSitioWeb() throws IOException {
        registrarUsuarioSteps.abrirUrl();
    }

    @Cuando("El usuario haga click en: Mi perfil")
    public void elUsuarioHagaClickEnMiPerfil() throws IOException {
        registrarUsuarioSteps.clickEnMiPerfil();
    }

    @Cuando("El usuario haga click en: Registrarte")
    public void elUsuarioHagaClickEnRegistrarte() throws IOException {
        registrarUsuarioSteps.clickEnRegistrarte();
    }

    @Cuando("El usuario haga click en: Ingresar a haceb")
    public void elUsuarioHagaClickEnIngresarAHaceb() throws IOException {
        registrarUsuarioSteps.clickEnIngresar();
    }

    @Cuando("El usuario completa el formulario")
    public void elUsuarioCompletaElFormulario() throws IOException {
        datosAddRegistroUsuarioSteps.cambiarVentana();
        datosAddRegistroUsuarioSteps.llenarFormulario();
    }

    @Cuando("El usuario haga click en boton: Registrarme")
    public void elUsuarioHagaClickEnBotonRegistrarme() throws Exception {
        datosAddRegistroUsuarioSteps.registrarme();
    }

    @Cuando("El usuario  complete el formulario de datos adicionales")
    public void elUsuarioCompleteElFormularioDeDatosAdicionales() throws Exception {
        datosAddRegistroUsuarioSteps.llenarAdicionales();
    }

    @Entonces("El usuario podra visualizar Hola en pantalla")
    public void elusuariopodravisualizarHolaenpantalla() {
        validarRegistroUsuarioSteps.cambiarVentana();
        validarRegistroUsuarioSteps.validarPerfil();
    }
}
