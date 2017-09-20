
public class Player {
	String name ;
	Card cards[];
	
	
	
	public Player(String name ,Card cards[]){
		this.name=name;
		this.cards=new Card[cards.length];//new array !!!
		for (int i=0;i<cards.length;i++){//new element of card!!!
			this.cards[i]=new Card();//new card
			this.cards[i].card=new int [cards[i].card.length][cards[i].card[0].length];//new card[][]
					 for(int k=0;k<cards[i].card.length;k++){
					          for(int j=0;j<cards[i].card[0].length;j++){
					          this.cards[i].card[k][j]=cards[i].getNumber(k, j);

					        }
					      }
		    			}
					}
	
	public Player(){}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public boolean isWinner(){
		int counter=0;
		boolean a=false;
		for(int i=0;i<cards.length;i++){
			for(int j=0;j<this.cards[i].card.length;j++){
				for(int w =0;w<this.cards[i].card[0].length;w++){
					if(cards[i].isMarked(j, w))
					counter++;
				
						if(counter==5){
							a = true;}}
							//System.out.println(" hi your winnerr !!!"+i);
						}
			}
		//System.out.println("count winner !!");
		return a;
		
	}
	public void markNumber(int number){
		for(int i=0;i<this.cards.length;i++){
			for(int j=0;j<this.cards[i].card.length;j++){
				for(int k=0;k<this.cards[i].card[0].length;k++)
				if (this.cards[i].getNumber(j, k)==number){
				cards[i].markNumber(number);
					}
			}
		}
		
		
	}

}
