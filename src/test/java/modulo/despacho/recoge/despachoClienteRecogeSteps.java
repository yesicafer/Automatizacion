package modulo.correo.redactar;

import java.util.Map;

import logueo.logueoPageObject;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import validaciones.validacionesPageObject;

public class redactarCorreoSteps {
	
	logueoPageObject clogin;
	validacionesPageObject validaciones;
	redactarCorreoPageObject redactarCorreo;
	
	@Step
	@Screenshots(forEachAction=true)
	public void Ingresar_al_aplicativo_zimbra_con_usuario_y_contrasena(String strUsuario, String strContrasena) {
		clogin.open();
		clogin.ingresarUsuarioDeLogueo(strUsuario);
		clogin.ingresarContraseñaDeLogueo(strContrasena);
		clogin.seleccionarVersion("Estándar (HTML)");
		clogin.seleccionarOpcionIniciarSesion();
		Serenity.takeScreenshot();
		validaciones.valido_inicio_sesion();
		
		
	}

	@Step
	public void ingresar_al_modulo_redactar_correo() {
		
		redactarCorreo.redactar();
		
		// TODO Auto-generated method stub
		
	}
	@Step
	public void diligenciar_el_formulario(Map<String, String> mapDatosFormulario) {
		redactarCorreo.para(mapDatosFormulario.get("para"));
		redactarCorreo.copia(mapDatosFormulario.get("copia"));
		redactarCorreo.Asunto(mapDatosFormulario.get("asunto"));
		redactarCorreo.redactarCorreo(mapDatosFormulario.get("Mensaje"));
		redactarCorreo.adjuntarArchivo(mapDatosFormulario.get("Archivo adjunto"));
				// TODO Auto-generated method stub
		
	}
	@Step
	public void valido_que_el_correo_se_haya_enviado_correctamenteo() {
		validaciones.valido_Envio_correo();
		// TODO Auto-generated method stub
		
	}
	
	
	public void envio_el_correo() {
		redactarCorreo.enviarCorreo();
	
		// TODO Auto-generated method stub
		
	}

}
