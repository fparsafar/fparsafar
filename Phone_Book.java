package note_phone;

public class Phone_Book {
	int size=2;
	int andaze=10;
	int j;
	person p[]=new person[andaze];

	void insert(person p_new){
		if(size<andaze){
			//checking whether the number is exist or not
			boolean is_exist;
			is_exist=false;
			for(int i=0;i<size;i++){
				if(p[i].number==p_new.number){
					is_exist=true;
					System.out.println("The person number you want to insert exists in the phone book,Here is his information: ");
					System.out.println("name: "+ p[i].name+ "   address: "+p[i].address+"   number: "+p[i].number );
					break;
				}

			}
			if(is_exist){
			}
			else{

				//inserting in appropriate place
				size=size+1;
				boolean tt;
				tt=false;
				for(int i=0;i<size;i++){

					if(p[i].name.compareTo(p_new.name)>0){
						for(int k=size-1;k>i;k--){

							p[k]=p[k-1];

						}
						tt=true;
						p[i]=p_new;
						break;
					}
				}
				if(tt){

				}
				else	p[size-1]=p_new;
			}
		}
		else System.out.println("Unfortunately your phone book does not evough capacity for inserting a new person");

	}




	//
	void print(){
		for(int i=0;i<size;i++)
			System.out.println("name: "+ p[i].name+ "   address: "+p[i].address+"   number: "+p[i].number );
	}
	void sort(){
		String yy = null;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){

				if(p[i].name.compareTo(p[j].name)>0){
					yy= p[i].name;
					p[i].name=p[j].name;
					p[j].name=yy;}
			}
		}

	}

	void find_name(String namee){

		boolean is_exist;
		is_exist=false;
		for(int i=0;i<size;i++){
			if(p[i].name.equals(namee)){
				is_exist=true;
				System.out.println("person namee exists in the phone book,Here is his information: ");
				System.out.println("name: "+ p[i].name+ "   address: "+p[i].address+"   number: "+p[i].number );
				break;
			}

		}
		if(is_exist){
		}
		else System.out.println("person namee  does not exist in the phone book");

	}
	void find_number(int numberr){

		boolean is_exist;
		is_exist=false;
		for(int i=0;i<size;i++){
			if(p[i].number==numberr){
				is_exist=true;
				System.out.println("person numberr exists in the phone book,Here is his information: ");
				System.out.println("name: "+ p[i].name+ "   address: "+p[i].address+"   number: "+p[i].number );
				break;
			}

		}
		if(is_exist){
		}
		else System.out.println("person numberr  does not exist in the phone book");

	}
	void delete(String delete_namee){

		boolean is_exist;
		is_exist=false;
		for(int i=0;i<size;i++){
			if(p[i].name.equals(delete_namee)){
				is_exist=true;
				for(int j=i;j<size-1;j++){

					p[j].name=p[j+1].name;
					p[j].address=p[j+1].address;
					p[j].number=p[j+1].number;
				}

				p[size-1]=null;
				size=size-1;
				System.out.println("Objects After Deleting: ");
				print();
				//System.out.println("person namee exists in the phone book,Here is his information: ");
				//System.out.println("name: "+ p[i].name+ "   address: "+p[i].address+"   number: "+p[i].number );
				break;
			}

		}
		if(is_exist){
		}
		else System.out.println("The person you want to delete does not exist in the phone book");

	}

}


