

public class Main {
	public static void main(String[] args) {
		Coque coque = new Coque();
		Cabine cabine = new Cabine();
		Pont pont = new Pont();
		Voile voile = new Voile();
		pont.setVoile(voile);
		Bateau bateau = new Bateau("B1", "B2", coque, cabine, pont);
		System.out.println(bateau.toString(bateau));
	}

}
