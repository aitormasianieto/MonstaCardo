
public class Decku {

	private Cardo[] cardos;
	private int numRemainingCards;
	
	public Decku() {
		cardos = new Cardo[20]; //He modificado la cantida de cartas para facilitar el testeo de la clase.
		numRemainingCards = 20;
		
		
	}
	
	public void shuffle() {
		Cardo temp;
		int n1, n2;
		
		for (int i = 0; i < numRemainingCards * 7; i++) {
			n1 = (int) (Math.random() * numRemainingCards);
			n2 = (int) (Math.random() * numRemainingCards);
			temp = cardos[n1];
			cardos[n1]= cardos[n1];
			cardos[n2] = temp;
		}
	}
	
	public Cardo extractCard() {
		return cardos[--numRemainingCards];
	}
}
