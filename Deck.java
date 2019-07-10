import java.util.ArrayList; 
import java.util.Random; 
public class Deck{

	Random random = new Random();
	
	private ArrayList <Card> Deck = new ArrayList <Card>(52);
	private ArrayList <Card> Shuffled = new ArrayList <Card>(52);

	
	public Deck(){
		
		String suit = "";
		String rank = "";
		
		//Nested loop to generate all the cards
		for(int x = 0; x < 4; x++){
			if(x == 0){
				suit = "Clubs";
			}
			else if(x == 1){
				suit = "Hearts";
			}
			else if(x == 2){
				suit = "Spades";
			}
			else if(x == 3){
				suit = "Diamonds";
			}
			for(int y = 1; y <= 13; y++){
				if(y == 1){
					rank = "Ace";
				}
				else if(y > 1 && y < 11){
					rank = "" + y;
				}
				else if(y == 11){
					rank = "Jack";
				}
				else if(y == 12){
					rank = "Queen";
				}
				else if(y == 13){
					rank = "King";
				}
				Card card = new Card(suit, rank);
				Deck.add(card);
			}
			//^
		}
	}

	public Card getFromShuffledDeck(int x){ 
		if(!Shuffled.isEmpty()){
			return Shuffled.get(x);
		}
		return null;
	}

	public void shuffle(){
		ArrayList<Integer> usednums = new ArrayList<>(52); 
		int counter = 0;
		while (counter < 52){
			int cardnum = random.nextInt((51 - 0) + 1) + 0;
			while (usednums.indexOf(cardnum) == -1){
				usednums.add(counter, cardnum); 
				Shuffled.add(counter, Deck.get(cardnum)); 
				counter++; 
			}
		}
	}
}
