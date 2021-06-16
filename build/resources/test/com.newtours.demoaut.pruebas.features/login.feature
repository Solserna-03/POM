#language: es

Característica: Inicio de sesion



  @InicioDeSesionExitoso
  Esquema del escenario: Inicio  de sesion exitoso
  Dado Thomas esta en la pagina de Mercury Tours
  Cuando Thomas ingresa los datos
      | usuario          | clave     |
      | <Usuario>        | <Clave>  |
  Entonces Thomas valida que se muestre el boton Continue

    Ejemplos:
      | Usuario              | Clave         |
      | cocovarela@gmail.com | Thomas13*     |
      | usuarioNovalido      | NewYork20     |
      | UsuarioNovalido      | ClaveInvalida |
