package RicksyBussiness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UfosParkTest {

    UfosPark test;

    /**
     * Testea el metodo añadir ovni 
     * a la flota de ufos
     */
    @Test
    public void addUfoTest() {
        UfosPark test = new UfosPark();
        test.add("unx");
        test.add("dox");
    }
    
    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de credito.
     * El credito de la tarjeta varia.
     */
    @Test
    public void dispatchTest() {
    	UfosPark test = new UfosPark();
    	CreditCard tarjeta = new CreditCard("persona", "684656878");
    	test.add("unx");
    	test.dispatch(tarjeta);
    	assertEquals("unx", test.getUfoOf(tarjeta.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay credito suficiente en la tarjeta.
     * El credito de la tarjeta no varia.
     */
    @Test
    public void dispatchNoCreditTest() {
    	UfosPark test = new UfosPark();
    	CreditCard tarjeta = new CreditCard("persona", "684656878");
    	test.add("unx");
    	tarjeta.pay(3000);
    	test.dispatch(tarjeta);
    	assertEquals(null, test.getUfoOf(tarjeta.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El credito de la tarjeta no varia.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    	UfosPark test = new UfosPark();
    	CreditCard tarjeta = new CreditCard("persona", "684656878");
    	test.add("unx");
    	test.dispatch(tarjeta);
    	assertEquals("unx", test.getUfoOf(tarjeta.number()));
    	test.add("dox");
    	test.dispatch(tarjeta);
    	assertEquals("unx", test.getUfoOf(tarjeta.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El credito de la tarjeta no varia.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
    	UfosPark test = new UfosPark();
    	CreditCard tarjeta = new CreditCard("persona", "684656878");
    	test.add(null);
    	test.dispatch(tarjeta);
    	assertEquals(null, test.getUfoOf(tarjeta.number()));
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    @Test
    public void getUfoOfTest() {
    	UfosPark test = new UfosPark();
    	CreditCard tarjeta = new CreditCard("persona", "684656878");
    	test.add("unx");
    	test.dispatch(tarjeta);
    	assertEquals("unx", test.getUfoOf(tarjeta.number()));
    }
}
