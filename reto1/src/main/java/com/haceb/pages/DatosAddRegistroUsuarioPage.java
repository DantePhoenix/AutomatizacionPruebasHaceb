package com.haceb.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class DatosAddRegistroUsuarioPage extends PageObject {

    By txtEmail = By.xpath("//*[@id='gigya-loginID-51216659851706440']");
    By txtNombre = By.xpath("//*[@id='gigya-textbox-72173553995486780']");
    By txtApellido = By.xpath("//*[@id='gigya-textbox-146410824335495100']");
    By txtClave = By.xpath("//*[@id='gigya-password-54061940132406190']");
    By txtConfClave = By.xpath("//*[@id='gigya-password-142670944012194750']");
    By chkAutorizo = By.xpath("//*[@id='gigya-register-form']/div[2]/div[10]/div[2]/label");
    By btnRegistrar = By.xpath("//input[@type='submit' and @class='gigya-input-submit hc-register-screen-submit invi' and @value='REGISTRARME']");
    By txtCedula = By.xpath("//input[@type='number' and @class='gigya-input-text']");
    By slcGenero = By.xpath("//*[@id='gigya-dropdown-153944062160082270']");
    By txtFecha = By.xpath("//*[@id='gigya-textbox-29430652596742216']");
    By btnEnviar = By.xpath("//*[@type='submit' and @class='gigya-input-submit hc-c-register-screen-submit invi' and @value='Enviar']");




    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getTxtConfClave() {
        return txtConfClave;
    }

    public By getChkAutorizo() {
        return chkAutorizo;
    }

    public By getBtnRegistrar() {
        return btnRegistrar;
    }

    public By getTxtCedula() {
        return txtCedula;
    }

    public By getSlcGenero() {
        return slcGenero;
    }

    public By getTxtFecha() {
        return txtFecha;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }
}
