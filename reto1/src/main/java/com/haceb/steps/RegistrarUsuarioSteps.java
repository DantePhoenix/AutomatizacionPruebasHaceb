package com.haceb.steps;

import com.haceb.pages.RegistroUsuarioPage;
import com.haceb.utils.EsperaImplicita;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;


public class RegistrarUsuarioSteps {
    @Page
    RegistroUsuarioPage registroUsuarioPage;
    Excel excel = new Excel();

    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        String url = excel.leerDatosExcel("Data.xlsx", "Url", 1,0 );
        registroUsuarioPage.openUrl(url);
    }

    @Step("El usuario haga click en: Mi perfil")
    public void clickEnMiPerfil() {
        registroUsuarioPage.getDriver().findElement(registroUsuarioPage.getBtnUser()).click();
    }

    @Step("El usuario haga click en: Registrarte")
    public void clickEnRegistrarte() {
        registroUsuarioPage.getDriver().findElement(registroUsuarioPage.getBtnReg()).click();
    }

    @Step("El usuario haga click en: Ingresar a haceb")
    public void clickEnIngresar() {
        registroUsuarioPage.getDriver().findElement(registroUsuarioPage.getBtnIngresar()).click();
        EsperaImplicita.esperaImplicita(5);
    }

}
