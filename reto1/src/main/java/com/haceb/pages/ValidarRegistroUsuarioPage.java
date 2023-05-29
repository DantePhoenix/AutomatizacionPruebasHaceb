package com.haceb.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarRegistroUsuarioPage extends PageObject {
    By lblPerfil = By.xpath("//span[text()='Hola']");

    public By getLblPerfil() {
        return lblPerfil;
    }

}
