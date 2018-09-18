package modulo.correo.redactar;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class redactarCorreoPageObject extends PageObject{
	
	@FindBy(xpath="//*[@id='TAB_COMPOSE']/span['Redactar']")
	WebElementFacade btnRedactar;

	//Mensaje
	@FindBy(id="body")
	WebElementFacade txtRedactar;
	
	@FindBy(xpath="//*[@id=\"toField\"]")
	WebElementFacade txtPara;
	
	@FindBy(xpath="//*[@id=\"ccField\"]")
	WebElementFacade txtCopia;
	
	@FindBy(id="subjectField")
	WebElementFacade txtAsuntoo;
	
	@FindBy(xpath="//*[@id=\"SOPATTACH\"]")
	WebElementFacade btnAdjuntar;
	
	@FindBy(xpath="//td[text()='2.']//preceding::input[@name='fileUpload']")
	WebElementFacade nombreAdjunto;
	
	@FindBy(xpath="/html/body/table/tbody/tr[5]/td[2]/form/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/input")
	WebElementFacade btnhecho;
	
	
	@FindBy(id="SOPSEND")
	WebElementFacade btnEnviar;
	
	
	
public void redactar () {
	
	btnRedactar.click();
	
}

public void redactarCorreo (String Redactar) {
	
	txtRedactar.sendKeys(Redactar);
	
}

public void para(String btnpara) {
	
	txtPara.sendKeys(btnpara);
	

}

public void copia (String txtcopia) {
	
	txtCopia.sendKeys(txtcopia);

}

public void Asunto (String txtAsunto) {
	
	txtAsuntoo.sendKeys(txtAsunto);

}

public void adjuntarArchivo (String Adjuntar)
{
	btnAdjuntar.click();
	nombreAdjunto.sendKeys(Adjuntar);
	btnhecho.click();

}


public void enviarCorreo ()
{
	btnEnviar.click();	
}
}