
@redactarCorreo
Feature: Redactar un correo
Yo quiero crear un correo
con mi usuario de zimbra
para cumplir mi reto


  @redactarCorreo @datoQuemado
  Scenario: Con datos quemados
  logueando por aplicativo zimbra
    Given Ingresar al aplicativo zimbra con usuario "yguayaboc" y contrasena"Bogo789*"
    And ingresar al modulo redactar correo 
    When diligenciar el formulario 
    |para							|scoronado@choucairtesting.com			     				             				 |		
    |copia						|yguayaboc@choucairtesting.com									       							 |
    |asunto						|Prueba de Robot YC														 	        						 |
    |Mensaje					|https://www.guru99.com/xpath-selenium.html		       							   |
    |Archivo adjunto	|C:\CapacitacionWorkspaceYG\com.choucair.zimbra.yg\Lighthouse.jpg    |
    |Prioridad				|Baja	  																       	       							 |
       And envio el correo
      Then valido que el correo se haya enviado correctamente
  

 @redactarCorreo @datoDinamico
  Scenario Outline: Redactar un correo con datos dinamicos
  logueando por aplicativo zimbra
    Given Ingresar al aplicativo zimbra con usuario "<txtusuario>" y "<txtcontraseña>"
    And ingresar al modulo redactar correo
    When diligenciar el formulario
    
    |para   	|"<txtpara>" 			|
    |copia		|"<txtcopia>"			|
    |Asunto		|"<txtadjunto>"		|
    |Mensaje	|"<txtasunto>"		|
    |Adjunto	|"<txtadjunto>"		|
    |Prioridad|"<cboPrioridad>"	|
    And envio el correo
    Then valido que el correo se haya enviado

    Examples: 
      | txtusuario  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
