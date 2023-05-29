package com.haceb.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarRegistroProductoPage extends PageObject {

    By lblValidarProd = By.xpath("//*[@class='cart-prod-item__prod-name']");


    public By getLblValidarProd() {
        return lblValidarProd;
    }

}
