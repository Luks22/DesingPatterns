package singleton.exercicio_3_1;

public class Incremental {

	private static int count = 0;
	private int numero;

	private static Incremental incremental = null;

	private Incremental() {
		numero = ++count;
	}

	public static synchronized Incremental getInstance() {
		if (incremental == null) {
			incremental = new Incremental();
		}
		return incremental;

	}

	public String toString() {
		return "Incremental " + numero;
	}
}
