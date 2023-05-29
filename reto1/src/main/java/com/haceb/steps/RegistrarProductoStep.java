package com.haceb.steps;


import com.haceb.pages.RegistrarProductoPage;
import com.haceb.utils.ClicElementoLista;
import com.haceb.utils.EsperaImplicita;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class RegistrarProductoStep {

    @Page
    RegistrarProductoPage registrarProductoPage;
    Excel excel = new Excel();

    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        String url = excel.leerDatosExcel("Data.xlsx", "Url", 1, 0);
        registrarProductoPage.openUrl(url);
    }

    @Step("El usuario haga click en el menu lateral")
    public void clickMenu() {
        registrarProductoPage.getDriver().findElement(registrarProductoPage.getMnCategoria()).click();
    }

    @Step("El usuario seleccione la categoria")
    public void seleccionCategoria() throws IOException {
        String categoria = excel.leerDatosExcel("Data.xlsx", "Categoria", 1, 0);
        JavascriptExecutor executer = (JavascriptExecutor) registrarProductoPage.getDriver();
        List<WebElement> elementos = registrarProductoPage.getDriver().findElements(registrarProductoPage.getLstCategorias());
        ClicElementoLista.elemento(elementos, categoria);
    }

    @Step("El usuario seleccione la subcategoria")
    public void seleccionSubCategoria() throws IOException {
        String subCategoria = excel.leerDatosExcel("Data.xlsx", "subCategoria", 1, 0);
        JavascriptExecutor executer = (JavascriptExecutor) registrarProductoPage.getDriver();
        List<WebElement> elementos = registrarProductoPage.getDriver().findElements(registrarProductoPage.getLstSubCategorias());
        ClicElementoLista.elemento(elementos, subCategoria);
    }

    @Step("El usuario seleccione el producto")
    public void seleccionProducto() throws IOException {
        String producto = excel.leerDatosExcel("Data.xlsx", "producto", 1, 0);
        JavascriptExecutor executer = (JavascriptExecutor) registrarProductoPage.getDriver();
        List<WebElement> elementos = registrarProductoPage.getDriver().findElements(registrarProductoPage.getLstSeleccionarProducto());
        ClicElementoLista.elemento(elementos, producto);
    }

    @Step("El usuario haga click en boton comprar")
    public void comprar() {
        registrarProductoPage.getDriver().findElement(registrarProductoPage.getBtnComprar()).click();
        EsperaImplicita.esperaImplicita(5);
    }

    @Step("El usuario haga clic en el boton de carrito")
    public void clicCarrito() {
        registrarProductoPage.getDriver().findElement(registrarProductoPage.getBtnCarrito()).click();
    }



}
