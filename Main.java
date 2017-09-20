
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Card cards1[] = new Card[5];
				Card cards2[] = new Card[5];
				Card cards3[] = new Card[5];
				Card cards4[] = new Card[5];
						
		for (int i=0;i<5;i++){
			int number[][]=new int[3][5];
			for (int j=0;j<3;j++){
				for(int k=0;k<5;k++){
					int b = (int)(Math.random()*89)+1;
					number[j][k]=b;
				}
			}
			Card c1 =new Card(number);
			cards1[i]=c1;
		}
		for (int i=0;i<5;i++){
			int number[][]=new int[3][5];
			for (int j=0;j<3;j++){
				for(int k=0;k<5;k++){
					int b = (int)(Math.random()*89)+1;
					number[j][k]=b;
				}
			}
			Card c =new Card(number);
			cards2[i]=c;
		}
		for (int i=0;i<5;i++){
			int number[][]=new int[3][5];
			for (int j=0;j<3;j++){
				for(int k=0;k<5;k++){
					int b = (int)(Math.random()*89)+1;
					number[j][k]=b;
				}
			}
			Card c =new Card(number);
			cards3[i]=c;
		}
		for (int i=0;i<5;i++){
			int number[][]=new int[3][5];
			for (int j=0;j<3;j++){
				for(int k=0;k<5;k++){
					int b = (int)(Math.random()*89)+1;
					number[j][k]=b;
				}
			}
			Card c =new Card(number);
			cards4[i]=c;
		}
		Player one = new Player("one",cards1);
		Player two = new Player("two",cards2);
		Player three = new Player("three",cards3);
		Player four = new Player("four",cards4);
		 	Player palayer [] = {one,two,three,four}; 
		//make random number for start !!
		Bingo start = new Bingo(palayer);
		for (int i=0;i<90;i++){
			int a =(int)(Math.random()*89)+1;
			if(start.play(a)!=""){
			System.out.println("name of winner !!!!"+start.play(a));
			break;}
		}
		
		
		
		
		
	}

}
