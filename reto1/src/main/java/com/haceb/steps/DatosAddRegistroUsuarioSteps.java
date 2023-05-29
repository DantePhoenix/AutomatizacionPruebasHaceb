
package com.haceb.steps;


import com.haceb.pages.DatosAddRegistroUsuarioPage;
import com.haceb.pages.RegistroUsuarioPage;
import com.haceb.utils.EsperaImplicita;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;

public class DatosAddRegistroUsuarioSteps {

    @Page
    DatosAddRegistroUsuarioPage datosAddRegistroUsuarioPage;
    @Page
    RegistroUsuarioPage registroUsuarioPage;
    Excel excel = new Excel();

    @Step
    public void cambiarVentana() {
        ArrayList<String> ventana = new ArrayList(registroUsuarioPage.getDriver().getWindowHandles());
        registroUsuarioPage.getDriver().switchTo().window(ventana.get(1));
    }


    @Step("El usuario  complete el formulario")
    public void llenarFormulario() throws IOException {
        EsperaImplicita.esperaImplicita(1);
        String email = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 0);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtEmail()).sendKeys(email);

        EsperaImplicita.esperaImplicita(1);
        String nombre = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 1);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtNombre()).sendKeys(nombre);

        EsperaImplicita.esperaImplicita(1);
        String apellido = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 2);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtApellido()).sendKeys(apellido);

        EsperaImplicita.esperaImplicita(1);
        String clave = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 3);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtClave()).sendKeys(clave);

        EsperaImplicita.esperaImplicita(1);
        String confClave = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 4);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtConfClave()).sendKeys(confClave);

        EsperaImplicita.esperaImplicita(1);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getChkAutorizo()).click();
    }

    @Step("El usuario haga click en boton: Registrarme")
    public void registrarme() throws Exception {
        EsperaImplicita.esperaImplicita(2);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getBtnRegistrar()).click();
    }


    @Step("El usuario  complete el formulario de datos adicionales")
    public void llenarAdicionales() throws Exception {
        EsperaImplicita.esperaImplicita(1);
        String cedula = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 5);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtCedula()).sendKeys(cedula);


        EsperaImplicita.esperaImplicita(1);
        String genero = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 6);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getSlcGenero()).sendKeys(genero);

        EsperaImplicita.esperaImplicita(1);
        String fecha = excel.leerDatosExcel("Data.xlsx", "DatosCuenta", 1, 7);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getTxtFecha()).sendKeys(fecha);

        EsperaImplicita.esperaImplicita(1);
        datosAddRegistroUsuarioPage.getDriver().findElement(datosAddRegistroUsuarioPage.getBtnEnviar()).click();
        EsperaImplicita.esperaImplicita(15);
    }

}




