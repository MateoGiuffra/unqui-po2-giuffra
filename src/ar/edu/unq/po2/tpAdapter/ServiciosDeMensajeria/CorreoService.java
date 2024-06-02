package ar.edu.unq.po2.tpAdapter.ServiciosDeMensajeria;
//Para integrar el nuevo servicio de mensajería por correo electrónico, se debe crear un nuevo componente que maneje este tipo de mensajes. Este componente 
//necesita almacenar la dirección de correo electrónico del destinatario, el asunto y el cuerpo del correo electrónico. También debe tener una funcionalidad 
//para enviar el correo electrónico. El constructor de este componente debe inicializar los datos correspondientes.
public class CorreoService {
	
	String correoDelDestinatario;
	String asunto;
	String cuerpo;
	String mensajeRecibido;
	
	public CorreoService(String correoDelDestinatario, String asunto, String cuerpo, String mensajeRecibido) {
		super();
		this.correoDelDestinatario = correoDelDestinatario;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.mensajeRecibido = mensajeRecibido;
	}
	public void enviarEmail(CorreoService correo) {
		correo.recibirMensaje(this.cuerpo); //la logica de enviar mail no esta especificada, asi que me invite que solo sea enviar el cuerpo del email dado. 
											// quizas una solucion sea crear una variable de tipo CorreoService llamada CorreoRecibido y settearselo. 
	}
	public void recibirMensaje(String cuerpo) {
		this.mensajeRecibido = cuerpo;
	}
	public void setMensajeRecibido(String mensaje) {
		this.mensajeRecibido = mensaje;
		
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	
}
