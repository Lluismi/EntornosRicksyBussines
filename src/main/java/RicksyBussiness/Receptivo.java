package RicksyBussiness;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
	
	List<GuestDispatcher> observers = new ArrayList<GuestDispatcher>();
	
	/* Constructor */
	
	public Receptivo() {}
	
	/* Añade el pack a la lista observers 
	 * 
	 * @param observers Es la lista donde se guardan los packsbienvenida
	 * @param packsbienvenida Es el pack que se le dará a los invitados al llegar
	 * */
	
	public void registra(GuestDispatcher packbievenida) {
		observers.add(packbievenida);
	}
	
	/* Por cada persona despachada se le da un pack de bienvenida 
	 * 
	 * @param GuestDispatcher Llama a la interfaz para despachar la personainvitada
	 * @param personainvitada Es la persona que se ha invitado a la fiesta
	 * @param observers Es la lista donde están guardados los packs de bienvenida
	 * @see creditCard Comprueba la tarjeta de credito de la persona
	 * */
	
	public void dispatch(CreditCard persona) {
		for (GuestDispatcher personainvitada : observers) {
			personainvitada.dispatch(persona);
		}
	}
}
