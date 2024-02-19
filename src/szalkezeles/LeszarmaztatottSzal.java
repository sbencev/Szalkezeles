package szalkezeles;

public class LeszarmaztatottSzal extends Thread {

	private Aruhaz aruhaz;
	private String megnevezes;
	
	public LeszarmaztatottSzal(Aruhaz aruhaz, String megnevezes) {
		this.aruhaz = aruhaz;
		this.megnevezes = megnevezes;
	}
	
	public void run() {
		
		for (int i =0;i<3;i++) {
			
			aruhaz.tranzakcio(aruhaz.veletlenOsszeg(),megnevezes);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
