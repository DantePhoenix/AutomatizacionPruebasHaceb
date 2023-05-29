package com.haceb.stepDefinitions;


import com.haceb.steps.RegistrarProductoStep;
import com.haceb.steps.ValidarRegistroProductoStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistrarProductoStepDefinition {


    @Steps
    RegistrarProductoStep registrarProductoStep;
    @Steps
    ValidarRegistroProductoStep validarRegistroProductoStep;


    @Dado("Que el usuario ingrese al sitio web Prod")
    public void queElUsuarioIngreseAlSitioWebProd() throws IOException {
        registrarProductoStep.abrirUrl();
    }

    @Cuando("El usuario haga click en el menu lateral")
    public void elUsuarioHagaClickEnElMenuLateral() {
        registrarProductoStep.clickMenu();
    }

    @Cuando("El usuario seleccione la categoria")
    public void elUsuarioSeleccioneLaCategoria() throws IOException {
        registrarProductoStep.seleccionCategoria();
    }

    @Cuando("El usuario seleccione la subcategoria")
    public void elUsuarioSeleccioneLaSubcategoria() throws IOException {
        registrarProductoStep.seleccionSubCategoria();
    }

    @Cuando("El usuario seleccione el producto")
    public void elUsuarioSeleccioneElProducto() throws IOException {
        registrarProductoStep.seleccionProducto();
    }

    @Cuando("El usuario haga click en boton comprar")
    public void elUsuarioHagaClickEnBotonComprar() {
        registrarProductoStep.comprar();
    }

    @Cuando("El usuario haga clic en el boton de carrito")
    public void elUsuarioHagaClicEnElBotonDeCarrito() {
        registrarProductoStep.clicCarrito();
    }

    @Entonces("El usuario visualizara el producto en el carrito")
    public void elUsuarioVisualizaraElProductoEnElCarrito() {
        validarRegistroProductoStep.validarNomProd();
    }
}
