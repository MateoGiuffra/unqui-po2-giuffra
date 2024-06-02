package ar.edu.unq.po2.tpAdapter.ServiciosDeMensajeria;

public class SmsService implements ServicioDeMensajeria{
	
	String numeroCelular;
	String mensajeAEnviar; 
	String mensajeRecibido;

	public SmsService(String numeroCelular, String mensajeAEnviar, String mensajeRecibido) {
		this.numeroCelular = numeroCelular;
		this.mensajeAEnviar = mensajeAEnviar;
		this.mensajeRecibido = mensajeRecibido;
	}
	
	@Override
	public void enviarMensajeA(SmsService smsDestinatario) {
		smsDestinatario.recibirMensaje(this.mensajeAEnviar);
	}
	
	@Override
	public void recibirMensaje(String msj) {
		this.mensajeRecibido = msj;
	}


	@Override
	public String getMensaje() {
		// TODO Auto-generated method stub
		return mensajeAEnviar;
	}

	//getteres y setters automaticos:
	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getMensajeAEnviar() {
		return mensajeAEnviar;
	}

	public void setMensajeAEnviar(String mensajeAEnviar) {
		this.mensajeAEnviar = mensajeAEnviar;
	}

	public String getMensajeRecibido() {
		return mensajeRecibido;
	}

	public void setMensajeRecibido(String mensajeRecibido) {
		this.mensajeRecibido = mensajeRecibido;
	}

	

}
