#language: es


Característica: Registrar un producto en el carrito de compras
  Yo como usuario necesito registrar un producto en el carrito

  @BEFORE
  Escenario: Registrar producto en el carrito
    Dado Que el usuario ingrese al sitio web Prod
    Cuando El usuario haga click en el menu lateral
    Y El usuario seleccione la categoria
    Y El usuario seleccione la subcategoria
    Y El usuario seleccione el producto
    Y El usuario haga click en boton comprar
    Y El usuario haga clic en el boton de carrito
    Entonces El usuario visualizara el producto en el carrito