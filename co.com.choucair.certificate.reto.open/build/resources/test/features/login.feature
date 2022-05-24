#language: es

@IngresoUsuario
Característica: Portal Open Cart se realizara el ingreso de un usuario y contraseña para validar el ingreso

  Antecedentes: ingreso a la pagina opencart
    Dado que un cliente accede al sistema

  @Escenario1
  Esquema del escenario: Ingreso de credenciales
    Cuando ingresa las credenciales
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces se valida el acceso

    Ejemplos:
      | usuario | contrasenna |
      | demo    | demo        |

  @Escenario2
  Esquema del escenario: Ingreso a navegacion de Productos
    Cuando entra y selecciona la opcion catalog
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |

    Y despues se toma la opcion Products que muestra en pantalla los productos que hay.

    Entonces se verica el ingreso a la opcion productos

    Ejemplos:
      | usuario | contrasenna |
      | demo    | demo        |

  @Escenario3
  Esquema del escenario: Ingresar los datos del producto a buscar
    Cuando se loguea
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y selecciona la opcion catalog y selecciona productos
    Y filtra por producto, modelo, precio, status
      | producto   | modelo   | precio   | cantidad   |
      | <producto> | <modelo> | <precio> | <cantidad> |
    Y despues se le da click en el boton filter

    Entonces se verifica el producto filtrado

    Ejemplos:
      | usuario | contrasenna | producto         | modelo     | precio | cantidad |
      | demo    | demo        | Apple Cinema 30" | Product 15 | $90.00 | 446      |
