package szalkezeles;

public class ImplementaltSzal implements Runnable {

	private Aruhaz aruhaz;
	private String megnevezes;

	public ImplementaltSzal(Aruhaz aruhaz, String megnevezes) {
		this.aruhaz = aruhaz;
		this.megnevezes = megnevezes;
	}

	public void run() {

		for (int i = 0; i < 3; i++) {

			aruhaz.tranzakcio(aruhaz.veletlenOsszeg(), megnevezes);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
