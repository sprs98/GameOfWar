public class Card{

	
	private String suit;
	private String rank;
	private int number;

	
	public Card(){
	}

	
	public Card(String suit, String rank){
		this.suit = suit;
		this.rank = rank;

		if(rank.equals("2")){
			number = 2;
		}
		else if(rank.equals("3")){
			number = 3;
		}
		else if(rank.equals("4")){
			number = 4;
		}
		else if(rank.equals("5")){
			number = 5;
		}
		else if(rank.equals("6")){
			number = 6;
		}
		else if(rank.equals("7")){
			number = 7;
		}
		else if(rank.equals("8")){
			number = 8;
		}
		else if(rank.equals("9")){
			number = 9;
		}
		else if(rank.equals("10")){
			number = 10;
		}
		else if(rank.equals("Jack")){
			number = 11;
		}
		else if(rank.equals("Queen")){
			number = 12;
		}
		else if(rank.equals("King")){
			number = 13;
		}
		else if(rank.equals("Ace")){
			number = 14;
		}
		
	}

	
	public String getSuit(){
		return suit;
	}

	public String getRank(){
		return rank;
	}

	public int getValue(){
		return number;
	}
	
	public void setSuit(String suit){
		this.suit = suit;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public void setValue(int value){
		this.number = value;
	}
	//^

	public String toString(){ 
		return rank + " " + suit;
	}

	public Card copy(Card card){ 
		Card temp = new Card (card.getSuit(), card.getRank());
		return temp;
	}

	public int isGreater(Card card){ 
		int temp;
		if (number > card.getValue()){
			temp = 1;
		}
		else if (number < card.getValue()){ 
			temp = 2;
		}
		else { 
			temp = 3;
		}
		return temp;
	}
}
