package szalkezeles;

import java.util.Random;

public class Aruhaz {

	private static Random r = new Random();
	private int aktualisEgyenleg;

	public Aruhaz(int aktualisEgyenleg) {
		this.aktualisEgyenleg = aktualisEgyenleg;
	}

	public int getAktualisEgyenleg() {
		return aktualisEgyenleg;
	}

	public synchronized void tranzakcio(int osszeg, String kasszaMegnevezes) {

		aktualisEgyenleg += osszeg;
		System.out.println(kasszaMegnevezes + " aktualis tranzakcioja: " + osszeg + " Ft");
		System.out.println("Az aruhaz aktualis egyenlege: " + aktualisEgyenleg + " Ft");
		System.out.println();

	}

	public int veletlenOsszeg() {

		return r.nextInt(10000) + 100;

	}

}
