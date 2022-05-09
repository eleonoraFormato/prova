package prova.ws;
public class TrovaStatoPagamento {

	public StatoPagamento trovaStatoPagamento() {

		StatoPagamento statoP = new StatoPagamento();
		double esito = Math.random();
		int esitoInt = 0;
		String codicePagamento = null;

		if (esito < 0.5) {
			esitoInt = 0;
		} else {
			esitoInt = 1;
			codicePagamento = randomStringa();
		}
		statoP.setId(esitoInt);
		statoP.setCodicePagamento(codicePagamento);

		return statoP;
	}


	public String randomStringa() {
		String str = "";
		for (int i = 1; i <= 10; i++)
			str += randomInt();
		return str;
	}

	public int randomInt() {
		int numRand = (int) (Math.random() * 10 + 1);
		return numRand;
	}

}
