
public class Card {
	int row;
	int column;
	int card[][];
	
	
	
	public Card(int number[][]){
		 this.card=new int [number.length][number[0].length];
		    for(int i=0;i<number.length;i++){
		      for(int j=0;j<number[0].length;j++){
		        this.card[i][j]=number[i][j];
		      }
		    }

		this.card=number;
		
	}
	public int[][] getCard() {
		return card;
	}
	public void setCard(int[][] card) {
		this.card = card;
	}
	public Card(){
		this.card=new int [3][5];
	}
	
	public int getNumber(int row , int column){
		return card[row][column];
		
	}
	public boolean isMarked(int row , int column){
		if (card[row][column]==110){
		return true;}
		else 
			return false;
	}
	public void markNumber(int number){
		for(int i=0;i<this.card.length;i++){
			for(int j=0;j<this.card[0].length;j++){
				if (this.card[i][j]==number){
				this.card[i][j]=110;
					}
			}
		}
		
	}

}


