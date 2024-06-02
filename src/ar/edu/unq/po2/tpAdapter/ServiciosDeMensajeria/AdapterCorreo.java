package ar.edu.unq.po2.tpAdapter.ServiciosDeMensajeria;

public class AdapterCorreo implements ServicioDeMensajeria{
	
	private CorreoService correo;
	
	public AdapterCorreo(CorreoService correo) {
		this.correo = correo;
	}
	
	@Override
	public void enviarMensajeA(SmsService smsDestinatario) {
		correo.recibirMensaje(smsDestinatario.getMensaje());
	}

	@Override
	public void recibirMensaje(String mensaje) {
		correo.recibirMensaje(mensaje);
	}
	@Override
	public String getMensaje() {
		return correo.getCuerpo();
	}

}
