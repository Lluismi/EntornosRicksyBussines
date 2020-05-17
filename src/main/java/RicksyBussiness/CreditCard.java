package RicksyBussiness;

public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000;
	private final String SYMBOL = "EZI";
	
	/* Constructor */
	
	CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}
	
	/* getters */
	
	String number() {
		return this.number;
	}
	
	double credit() {
		return this.credit;
	}
	
	/* Comprueba si la persona tiene o no credito para pagar.
	 * 
	 * @param credito El credito total de la persona
	 * @return Devuelve true si la persona tiene credito para pagar
	 * @return Devuelve false si la persona no tiene credito para pagar 
	 * */
	
	boolean pay(double creditapagar) {
		if (credit() != 0) {
			this.credit -= creditapagar;
			return true;
		}else {}
		return false;
	}
	
	@Override
	public String toString() {
		return "\n" + "Owner: " + this.owner + "\n" + 
                "Number: " + number() + "\n" +
                "Credit: " + credit() + this.SYMBOL + "\n";
	}
}
