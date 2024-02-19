package szalkezeles;

public class FoprogramKassza {

	public static void main(String[] args) {

		Aruhaz aruhazObj = new Aruhaz(0);

		Thread kassza1 = new Thread(new ImplementaltSzal(aruhazObj, "kassza1"));
		kassza1.start();

		Thread kassza2 = new LeszarmaztatottSzal(aruhazObj, "kassza2");
		kassza2.start();

		new LeszarmaztatottSzal(aruhazObj, "kassza3").start();

		new ImplementaltSzal(aruhazObj, "kassza4").run();

		Thread kassza5 = new Thread(new ImplementaltSzal(aruhazObj, "kassza5"));
		kassza5.start();

	}

}
