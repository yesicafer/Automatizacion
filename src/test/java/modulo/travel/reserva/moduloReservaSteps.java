package modulo.travel.reserva;


import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;


public class moduloReservaSteps {
	
	moduloReservaPageObjet rPageObect;
	
	

	@Step
	public void  en_la_pantalla_de_inicio_seleccionando_la_opción_name () {
		
		rPageObect.open();
		rPageObect.seleccionarOpcionHotel();
		
	}
	
	@Step
	public void iniciar_una_reserva_de_hotel_seleccionando_cualquiera_de_los_destinos_disponibles(String string) {
		rPageObect.seleccionarDestino(string);

	}

	@Step
	public void ingresando_las_fechas_de_inicio_y_final (String fechaIncio, String fechaFinal) {
	   rPageObect.ingresarCheckIn(fechaIncio);
	   rPageObect.ingresarCheckOut(fechaFinal);
	}
	
	@Step	
	public void con_dos_adultos(int x) {
		rPageObect.dosAdultos(x);
	}
	
	@Step
	public void cero_niños(int x) {
		
		rPageObect.ceroniños(x);
	}
	
	@Step
	public void haciendo_clic_en_la_opción_Search() {
		rPageObect.hacer_click_opcion_Search();
	}
	
	@Step
	public void seleccionar_alguno_de_los_cuartos_disponibles() {
		rPageObect.seleccionar_cuarto();
	}
	
	@Step
	public void hacer_clic_en_el_botón_Book_now() {
		
		rPageObect.hacer_clic_en_el_botón_Book_now();
	}
	
	@Step
	public void diligenciar_todos_los_campos_del_formulario_Personal_details_Nombre_Apellido_Email_ConfirmarEmail (String nombre, String apellido, String email, String confirmarEmail, String contacto, String Direccion, String pais) {
		
		rPageObect.diligenciar_datos_personales(nombre, apellido, email, confirmarEmail, contacto, Direccion, pais);
	}
	
	@Step
	public void verificar_que_el_cupón_de_descuento_no_es_válido_cerrando_la_alerta_de_navegador_que_se_presenta(String cupon) {
		rPageObect.validarCupon(cupon);
	}

	@Step
	public void continuando_con_el_proceso_haciendo_clic_en_el_botón_confirm_this_booking() {
		rPageObect.confirmar();
	}
	@Step
	public void  hacer_clic_en_el_botón_Pay_Now() {
		rPageObect.pagar();
	}

	@Step
	public void seleccionar_como_método_de_pago_Tarjeta_de_crédito(String tarjeta)   {
	    rPageObect.seleccionarPago(tarjeta);
	}
	
	@Step
	public void diligenciar_los_datos_correspondientes_Nombre_Apellido(String nombre, String apellido)  {
	    rPageObect.diligenciarDatosPago(nombre, apellido);
	    
	}
	
	@Step
	public void el_campo_deberá_ser_diligenciado_con_una_cadena_númerica_de_longitud_generada_aleatoriamente_y_deberá_iniciar_únicamente_con_alguno_de_los_siguientes_números_NumeroTarjeta_NumeroTarjeta_Mes_Mes_Año_Ano_Contraseña_Contrasena_y_culminar_pago(String arg1) {
		rPageObect.ingresarNumeroTarjetaCredito(arg1);
		
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void al_terminar_la_reserva_se_debe_mostrar_un_mensaje_del_cual_se_debe_comprobar_con_una_aserción_y_se_debe_tomar_captura_de_pantalla(String comparacion)  {
		rPageObect.resultadoEsperado(comparacion);
	}

}

