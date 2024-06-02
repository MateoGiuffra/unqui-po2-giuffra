package ar.edu.unq.po2.tpAdapter.ServiciosDeMensajeria;

//Ejercicio 2 – Integración de Servicios de Mensajería
//Los usuarios de una aplicación de mensajería desean tener la posibilidad de enviar mensajes tanto por SMS como por correo electrónico. 
//La aplicación originalmente solo soportaba el envío de mensajes por SMS utilizando un servicio llamado SmsService. Ahora, se ha decidido 
//integrar un nuevo servicio de mensajería por correo electrónico llamado EmailService. El objetivo es permitir que la aplicación utilice 
//ambos servicios de mensajería a través de una interfaz común sin modificar el código existente que utiliza SmsService.

//Clases y Detalles:
//En el sistema actual, existe un componente que representa el servicio de mensajería por SMS. Este componente debe tener la capacidad de 
//almacenar el número de teléfono del destinatario y el contenido del mensaje. Además, debe incluir una funcionalidad para enviar el mensaje SMS.
//El constructor de este componente debe inicializar los datos necesarios.

//Para integrar el nuevo servicio de mensajería por correo electrónico, se debe crear un nuevo componente que maneje este tipo de mensajes. Este componente 
//necesita almacenar la dirección de correo electrónico del destinatario, el asunto y el cuerpo del correo electrónico. También debe tener una funcionalidad 
//para enviar el correo electrónico. El constructor de este componente debe inicializar los datos correspondientes.

//Para unificar el uso de ambos servicios de mensajería, se debe definir una interfaz común que declare una funcionalidad para enviar mensajes. 
//Esta funcionalidad debe ser implementada tanto por el componente del servicio de SMS como por un adaptador que permita utilizar el nuevo servicio de 
//correo electrónico a través de esta interfaz común.

//El adaptador debe tener la capacidad de referenciar un objeto del servicio de correo electrónico y debe implementar la funcionalidad de enviar mensajes,
//utilizando internamente la funcionalidad del servicio de correo electrónico. El constructor del adaptador debe inicializar la referencia al objeto del 
//servicio de correo electrónico.

//Finalmente, se debe crear una clase de prueba que tenga un método principal. Este método debe crear instancias del servicio de SMS, del servicio de correo 
//electrónico y del adaptador, y debe demostrar que ambos tipos de mensajes pueden ser enviados a través de la interfaz común.

public class SmsService {

}
