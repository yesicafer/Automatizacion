package validaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;

import logueo.logueoPageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;




public class validacionesPageObject extends PageObject {
	
	@FindBy(xpath="//*[@target='_new' and contains(text(),'Ayuda')]")
	WebElementFacade Ayuda;
	@FindBy(xpath="//*[@id=\"app_st_msg_div\"]/table/tbody/tr/td[1]")
	WebElementFacade correoEnviado;
	
	public void valido_inicio_sesion () {
		String imagenzimbra = "Ayuda";
		String var2=Ayuda.getText();
		

		assertThat(var2,imagenzimbra);
	}
	
	public void valido_Envio_correo () {
		String envioCorreo = "Tu mensaje ha sido enviado";
		String varcorreo=correoEnviado.getText();
		assertThat(varcorreo,envioCorreo);
		
		
	}

	public void assertThat(String var2, String imagenzimbra) {
		// TODO Auto-generated method stub
		
	}

}
