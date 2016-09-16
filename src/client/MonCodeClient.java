package client;

public class MonCodeClient {

	public static void main(String[] args) {
		// Instanciation du service généré par wsimport
		SalutThomasWSService service = new SalutThomasWSService();

		// Récupération du client généré par wsimport
		SalutThomas port = service.getSalutThomasWSPort();

		// Appel d'une opération du service
		String resultat = port.ditBonjour("YO");
		
		System.out.println(resultat);


	}

}
