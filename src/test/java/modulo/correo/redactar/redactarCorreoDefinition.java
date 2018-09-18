package modulo.correo.redactar;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.*;

public class redactarCorreoDefinition {
	
	@Steps
	
	redactarCorreoSteps redactarCorreoSteps;
 
	@Given ("^Ingresar al aplicativo zimbra con usuario \"([^\"]*)\" y contrasena\"([^\"]*)\"$")
	public void  Ingresar_al_aplicativo_zimbra_con_usuario_y_contrasena (String strUsuario, String strContrasena)
	{
	redactarCorreoSteps.Ingresar_al_aplicativo_zimbra_con_usuario_y_contrasena(strUsuario,strContrasena);	
	
	}
	/*@Given("^Ingresar al aplicativo zimbra con usuario\"([^\"]*)\" y contrasena\"([^\\]*)\"$")
	public void  Ingresar_al_aplicativo_zimbra_con_usuario_y_contrasena (String strUsuario, String strContrasena)
	{
		redactarCorreoSteps.Ingresar_al_aplicativo_zimbra_con_usuario_y_contrasena(strUsuario,strContrasena);
		
	}*/
	@Given("^ingresar al modulo redactar correo$")
	public void  ingresar_al_modulo_redactar_correo () {
		redactarCorreoSteps.ingresar_al_modulo_redactar_correo ();
		
	}
	
	@When ("^diligenciar el formulario$")
	public void diligenciar_el_formulario(Map<String,String> mapDatosFormulario) {
		redactarCorreoSteps.diligenciar_el_formulario(mapDatosFormulario);
	}
	@When ("^envio el correo$")
	public void  envio_el_correo() {
		redactarCorreoSteps.envio_el_correo();
			}
	
	@Then  ("^valido que el correo se haya enviado correctamente$")
	
	public void  valido_que_el_correo_se_haya_enviado_correctamenteo () {
		redactarCorreoSteps.valido_que_el_correo_se_haya_enviado_correctamenteo ();
		
	}
	
}
