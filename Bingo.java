
public class Bingo {
	Player players[];
	
	public Bingo (Player players []){
		this.players=new Player[players.length];//new array players!!
		for(int i=0;i<players.length;i++){//new player !!!
			 this.players[i]=new Player(); 
			 this.players[i].setName(players[i].getName());
			 this.players[i].setCards(players[i].getCards());
			 //this.players[i].cards=new Card[this.players[i].cards.length];//make card for each player !!
			 
			 //for (int j=0;j<players[i].cards.length;j++){//now full into card
				 //this.players[i].cards[j].card=new int [this.players[i].cards[j].card.length][this.players[i].cards[j].card[0].length];//new array 2d for fill number into card
				 //for(int w=0;w<players[i].cards[j].card.length;w++){
					 //for(int k=0;k<players[i].cards[j].card[0].length;k++){
						//this.players[i].cards[j].card[w][k]=this.players[i].cards[j].getNumber(w, k);
					 		//}
				 		//}
			 		//}
				}	
			}
	public String play(int number){
		for(int i =0 ;i<players.length;i++){//count players
			//for(int j= 0;j<players[i].cards.length;j++){//count cards
				
				players[i].markNumber(number);
			
		}
		String s = "";
		for(int i=0;i<players.length;i++)
			if(players[i].isWinner()){
				 s +=players[i].name;
			}
		return s;
	}

}
