package com.haceb.steps;


import com.haceb.pages.ValidarRegistroProductoPage;
import com.haceb.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class ValidarRegistroProductoStep {

    @Page
    ValidarRegistroProductoPage validarRegistroProductoPage;

    @Step("El usuario visualizara el producto en el carrito")
    public void validarNomProd() {

        EsperaImplicita.esperaImplicita(5);
        Assert.assertThat(
                "La registro del producto fue exitoso",
                validarRegistroProductoPage.getDriver().findElement(validarRegistroProductoPage.getLblValidarProd()).isDisplayed(),
                Matchers.is(true));
    }
}
