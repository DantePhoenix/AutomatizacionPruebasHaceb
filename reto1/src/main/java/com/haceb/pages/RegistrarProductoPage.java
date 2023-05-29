package com.haceb.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrarProductoPage extends PageObject {

    By mnCategoria = By.xpath("//*[@id='btnDropMenu']/a");
    By lstCategorias = By.xpath("//a[@class='link-parent']");
    By lstSubCategorias = By.xpath("//h2/a");
    By lstSeleccionarProducto = By.xpath("//a[@class='shelve-link-name']");
    By btnComprar = By.xpath("//a[@class='btn btn-default buy-in-page-button' and @href='#']");
    By btnCarrito = By.xpath("//*[@class='icon-cart'][1]");

    public By getMnCategoria() {
        return mnCategoria;
    }

    public By getLstCategorias() {
        return lstCategorias;
    }

    public By getLstSubCategorias() {
        return lstSubCategorias;
    }

    public By getLstSeleccionarProducto() {
        return lstSeleccionarProducto;
    }

    public By getBtnComprar() {
        return btnComprar;
    }

    public By getBtnCarrito() {
        return btnCarrito;
    }
}
