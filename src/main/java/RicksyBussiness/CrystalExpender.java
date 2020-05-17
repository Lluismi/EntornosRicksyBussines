package RicksyBussiness;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 0;
	private double itemCost = 50;
	
	/* Constructor */
	
	CrystalExpender(int stock, double itemCost) {
		this.stock = stock;
		this.itemCost = itemCost;
	}
	
	/* Comprueba si persona tiene creditos en creditCard,
	 * si tiene creditos, comprueba si hay paquetes en @see stock, 
	 * si hay paquetes resta 1 del stock
	 *  y resta lo que le ha costado a la persona y le da el paquete.
	 *  
	 *  @param itemCost es el precio del objeto
	 *  @param stock es el total de paquetes disponibles
	 *  @see creditCard Comprueba la tarjeta de credito de la persona
	 * */
	
	public void dispatch(CreditCard persona) {
		if (persona.pay(itemCost) && stock > 0) {
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
		return "Stock: " + stock + "\n" +
				"cost: " + itemCost;
	}
	
}
