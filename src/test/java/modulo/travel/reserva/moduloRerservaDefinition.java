package modulo.travel.reserva;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modulo.travel.reserva.moduloReservaPageObjet;
import net.thucydides.core.annotations.Steps;

import java.util.*;


public class moduloRerservaDefinition {
	
@Steps
	
	moduloReservaSteps reservaSteps;

@Given("^En la pantalla de inicio, seleccionando la opción Hotel$")
public void en_la_pantalla_de_inicio_seleccionando_la_opción_Hotel()  {
	reservaSteps.en_la_pantalla_de_inicio_seleccionando_la_opción_name();
}


@Given("^iniciar una reserva de hotel seleccionando cualquiera de los destinos disponibles en la \"([^\"]*)\"$")
public void iniciar_una_reserva_de_hotel_seleccionando_cualquiera_de_los_destinos_disponibles_en_la(String arg1)  {
   reservaSteps.iniciar_una_reserva_de_hotel_seleccionando_cualquiera_de_los_destinos_disponibles(arg1);
   
}



@Given("^ingresando las fechas de inicio \"([^\"]*)\" y final \"([^\"]*)\"$")
public void ingresando_las_fechas_de_inicio_y_final(String fechaIncio, String fechaFinal)  {
  reservaSteps.ingresando_las_fechas_de_inicio_y_final(fechaIncio, fechaFinal);
}

	@Given("^con dos adultos$")
	public void con_dos_adultos()  {
	reservaSteps.con_dos_adultos();
	   
	  
	}

	@Given("^cero niños$")
	public void cero_niños()  {
	reservaSteps.cero_niños();	
	   
	    
	}

	@Given("^haciendo clic en la opción Search$")
	public void haciendo_clic_en_la_opción_Search()  {
	reservaSteps.haciendo_clic_en_la_opción_Search();
	   
	}

	@When("^Seleccionar alguno de los cuartos disponibles$")
	public void seleccionar_alguno_de_los_cuartos_disponibles()  {
    reservaSteps.seleccionar_alguno_de_los_cuartos_disponibles();	    
	}

	@When("^hacer clic en el botón Book now$")
	public void hacer_clic_en_el_botón_Book_now() {
	reservaSteps.hacer_clic_en_el_botón_Book_now();
	}

	@When("^diligenciar todos los campos del formulario Personal details Nombre\"([^\"]*)\" Apellido\"([^\"]*)\" Email\"([^\"]*)\" ConfirmarEmail\"([^\"]*)\" Contacto\"([^\"]*)\" Direccion\"([^\"]*)\" Pais \"([^\"]*)\"$")
	public void diligenciar_todos_los_campos_del_formulario_Personal_details_Nombre_Apellido_Email_ConfirmarEmail(String nombre, String apellido, String email, String confirmarEmail, String contacto, String Direccion, String pais)  {
	reservaSteps.diligenciar_todos_los_campos_del_formulario_Personal_details_Nombre_Apellido_Email_ConfirmarEmail(nombre, apellido, email, confirmarEmail, contacto, Direccion, pais);
	}
	
	
	@When("^Verificar que el cupón \"([^\"]*)\" de descuento no es válido cerrando la alerta de navegador que se presenta$")
	public void verificar_que_el_cupón_de_descuento_no_es_válido_cerrando_la_alerta_de_navegador_que_se_presenta(String cupon) {
	reservaSteps.verificar_que_el_cupón_de_descuento_no_es_válido_cerrando_la_alerta_de_navegador_que_se_presenta(cupon);    
	}

	@When("^continuando con el proceso haciendo clic en el botón confirm this booking$")
	public void continuando_con_el_proceso_haciendo_clic_en_el_botón_confirm_this_booking() {
	reservaSteps.continuando_con_el_proceso_haciendo_clic_en_el_botón_confirm_this_booking();
	 
	}

	@When("^Hacer clic en el botón Pay Now$")
	public void hacer_clic_en_el_botón_Pay_Now() {
	reservaSteps.hacer_clic_en_el_botón_Pay_Now();    
	}


	@When("^Seleccionar como método de pago Tarjeta de crédito \"([^\"]*)\"$")
	public void seleccionar_como_método_de_pago_Tarjeta_de_crédito(String tarjeta)  {
	reservaSteps.seleccionar_como_método_de_pago_Tarjeta_de_crédito(tarjeta);  
	}


	@When("^diligenciar los datos correspondientes Nombre \"([^\"]*)\" Apellido \"([^\"]*)\"$")
	public void diligenciar_los_datos_correspondientes_Nombre_Apellido(String nombre, String apellido)  {
	reservaSteps.diligenciar_los_datos_correspondientes_Nombre_Apellido(nombre, apellido);
	    
	}


	@When("^El campo \"([^\"]*)\" deberá ser diligenciado con una cadena númerica de longitud (\\d+) generada aleatoriamente y deberá iniciar únicamente con alguno de los siguientes números NumeroTarjeta <NumeroTarjeta> Mes <Mes> Año <Ano> Contraseña <Contrasena> y culminar pago\\.$")
	public void el_campo_deberá_ser_diligenciado_con_una_cadena_númerica_de_longitud_generada_aleatoriamente_y_deberá_iniciar_únicamente_con_alguno_de_los_siguientes_números_NumeroTarjeta_NumeroTarjeta_Mes_Mes_Año_Ano_Contraseña_Contrasena_y_culminar_pago(String arg1, int arg2)  {
	reservaSteps.el_campo_deberá_ser_diligenciado_con_una_cadena_númerica_de_longitud_generada_aleatoriamente_y_deberá_iniciar_únicamente_con_alguno_de_los_siguientes_números_NumeroTarjeta_NumeroTarjeta_Mes_Mes_Año_Ano_Contraseña_Contrasena_y_culminar_pago(arg1, arg2);    
	}


	@Then("^Al terminar la reserva, se debe mostrar un mensaje \"([^\"]*)\" del cual se debe comprobar con una aserción y se debe tomar captura de pantalla\\.$")
	public void al_terminar_la_reserva_se_debe_mostrar_un_mensaje_del_cual_se_debe_comprobar_con_una_aserción_y_se_debe_tomar_captura_de_pantalla(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("^ingresando las fechas de (\\d+) y Fail$")
	public void ingresando_las_fechas_de_y_Fail(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
