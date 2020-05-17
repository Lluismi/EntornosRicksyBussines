package RicksyBussiness;

public class RickMenu implements GuestDispatcher {
	
	private int stock = 100;
	private double priceMenu = 10;
	
	
	RickMenu() {}
	
	/* Comprueba si persona tiene creditos en creditCard,
	 * si tiene creditos, comprueba si hay Menu's en @see stock, 
	 * si hay paquetes resta 1 del stock
	 * y resta lo que le ha costado a la persona y le da el Menu.
	 *  
	 *  @param priceMenu Es el precio del objeto
	 *  @param stock Es el total de Menu's disponibles
	 *  @see creditCard Comprueba la tarjeta de credito de la persona
	 * */
	
	public void dispatch(CreditCard persona) {
		if (persona.pay(priceMenu) && stock > 0) {
			this.stock -= 1;
		}
	}
	
	/* 
	 * @return Devuelve el total de paquetes en stock
	 */
	
	int stock() {
		return this.stock;
	}
	
	
	@Override
	public String toString() {
		return "\nRickMenus pedidos:\n " + 
				"==========================================" + "\n" + 
				"Stock: " + stock + "\n";
	}
	
}
