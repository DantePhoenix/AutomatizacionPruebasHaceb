package com.haceb.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroUsuarioPage extends PageObject {

    By btnUser = By.xpath("//span[contains(@class, 'icon-user')]");
    By btnReg = By.xpath("//a[contains(@class, 'cdc-fire cdc-register')]");
    By btnIngresar = By.xpath("//*[@id='vtexIdUI-custom-oauth']/p");

    public By getBtnUser() {
        return btnUser;
    }

    public By getBtnReg() {
        return btnReg;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
