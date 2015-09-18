package beans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import datatypes.DataAgencia;
import datatypes.DataResultadoAgencia;
import excepciones.PersistenciaException;
import logica.AgenciaManager;

public class AgenciaBean {

	private int id_agencia;
	private String nombre;
	private String direccion;
	private String telefono;
	private AgenciaManager agenciaManager;
	
	private HttpServletRequest httpServletRequest;
	private FacesContext faceContext;
	private FacesMessage facesMessage;
	private String msgingresar;
	
	private UIComponent btnAltaAgencia;
	
	


	public AgenciaBean() {
		super();
		this.id_agencia = id_agencia;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		agenciaManager = new AgenciaManager();
		
		faceContext=FacesContext.getCurrentInstance();
		httpServletRequest=(HttpServletRequest)faceContext.getExternalContext().getRequest();	
	}
	
	
	public int getId_agencia() {
		return id_agencia;
	}

	public void setId_agencia(int id_agencia) {
		this.id_agencia = id_agencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String ingresarAgencia()
	{	
		String resultado = "altaagencia";

		faceContext = FacesContext.getCurrentInstance();

		DataResultadoAgencia dra = null;

		if (!nombre.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty())
		{
			DataAgencia da = new DataAgencia(nombre,direccion,telefono);
			dra = agenciaManager.altaAgencia(da);
		}
			

		if (dra != null) {
			if (dra.getIdAgencia() != -1) {
				msgingresar = "Se ingresó agencia con numero " + dra.getIdAgencia()
						+ " al sistema.";
				facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Mensaje: ", msgingresar);
				//faceContext.addMessage(null, facesMessage);
				faceContext.addMessage(btnAltaAgencia.getClientId(faceContext), facesMessage);
				
				resultado = "inicio";
				
				reset();
			} else {
				msgingresar = "No fue posible ingresar la información de la agencia. Verifique los datos.";
				facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Mensaje: ", msgingresar);
				faceContext.addMessage(btnAltaAgencia.getClientId(faceContext), facesMessage);
				
				resultado = "altaagencia";

			}
		} 
		else
		{
			msgingresar = "No fue posible ingresar la información de la agencia. Error de acceso a la base.";
			facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Mensaje: ", msgingresar);
			faceContext.addMessage(btnAltaAgencia.getClientId(faceContext), facesMessage);
			resultado = "altaagencia";
		}
		

		faceContext.getExternalContext().getFlash().setKeepMessages(true);
		return resultado;

	}

	public void reset() {
		nombre = "";
		direccion = "";
		telefono = "";
		
	}
	
	public UIComponent getBtnAltaAgencia() {
		return btnAltaAgencia;
	}


	public void setBtnAltaAgencia(UIComponent btnAltaAgencia) {
		this.btnAltaAgencia = btnAltaAgencia;
	}
}
