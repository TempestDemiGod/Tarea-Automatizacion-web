@TaskProducto
Feature: Registrar un usuario

  @RegistrarUsuario
  Scenario Outline: Registrar de manera existosa a un usuario con credenciales validas
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de registro
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>"
    And selecciona el boton registrar
    Then se realiza el registro de manera exitosa
    Examples:
      | username | password |
      | usuarioqwer | pass123 |

  @iniciarSesion
  Scenario Outline: Iniciar sesion y añadir un producto
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de inicio sesion
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>" para iniciar sesion
    And selecciona el boton login
    And selecciona el un producto
    And el usuario esta en la pagina de del producto
    And selecciona agregar al carrito
    Then se realiza el login de manera exitosa
    Examples:
      | username | password |
      | usuarioqwer | pass123 |


#  @agregarProducto
#  Scenario:  Seleccionar un producto y agregar al carrito
#    Given el usuario esta en la pagina de inicio
#    And selecciona el un producto
#    And selecciona agregar al carrito
#    Then se agrega el producto de manera exitosa
