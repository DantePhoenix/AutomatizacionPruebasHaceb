#language: es

Característica: Realizar registro de nuevo usuario
  Yo como usuario necesito registrarme en el sitio web

  Escenario: Registrarse en el sitio web
    Dado Que el usuario ingrese al sitio web
    Cuando El usuario haga click en: Mi perfil
    Y El usuario haga click en: Registrarte
    Y El usuario haga click en: Ingresar a haceb
    Y El usuario completa el formulario
    Y El usuario haga click en boton: Registrarme
    Y El usuario  complete el formulario de datos adicionales
    Entonces El usuario podra visualizar Hola en pantalla