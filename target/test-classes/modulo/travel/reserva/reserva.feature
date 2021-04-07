
@casoFallido
Feature: Reserva 


        
 @casoFallido
  Scenario Outline: Realizar una reserva 
  
    Given En la pantalla de inicio, seleccionando la opción Hotel
    And iniciar una reserva de hotel seleccionando cualquiera de los destinos disponibles en la <listaDespegable>
    And ingresando las fechas de inicio <Check-in> y final <Check-out> 
    And con dos adultos<Adultos> 
    And cero niños<ninos>
    And haciendo clic en la opción Search
    When Seleccionar alguno de los cuartos disponibles 
    And hacer clic en el botón Book now 
    And diligenciar todos los campos del formulario Personal details Nombre<Nombre> Apellido<Apellido> Email<Email> ConfirmarEmail<ConfirmarEmail> Contacto<Contacto> Direccion<Direccion> Pais <Pais>
    And Verificar que el cupón <Cupon> de descuento no es válido cerrando la alerta de navegador que se presenta 
    And continuando con el proceso haciendo clic en el botón confirm this booking
    And Hacer clic en el botón Pay Now 
    And Seleccionar como método de pago Tarjeta de crédito <TarjetaCredito>
    And diligenciar los datos correspondientes Nombre <Nombre> Apellido <Apellido> 
    And El campo Card number deberá ser diligenciado con una cadena númerica de longitud dieciseis generada aleatoriamente y deberá iniciar únicamente con alguno de los siguientes números NumeroTarjeta  Mes Año Contraseña<Contrasena> y culminar pago.
    Then Al terminar la reserva, se debe mostrar un mensaje <Mensaje> del cual se debe comprobar con una aserción y se debe tomar captura de pantalla.
   

    Examples: 
      | listaDespegable                          | Check-in      | Check-out    | Adultos| ninos    | Nombre    | Apellido | Email             | ConfirmarEmail       | Contacto      | Direccion             | Pais         | Cupon     | TarjetaCredito |Contrasena    | Mensaje																																			|
      | "Tria Hotel Istanbul Especial, Istanbul" | "14/02/2021"  | "19/02/2021" | 2      | 0        | "Shakira" | "Pique"  | "pruebak@kkk.com" | "pruebak@kkk.com"	  | "3221111256"  | "Calle falsa 123"     | "Colombia"   | "121213"  | "Credit Card"  | "123"        | "The merchant login ID or password is invalid or the account is inactive."  	|
      
