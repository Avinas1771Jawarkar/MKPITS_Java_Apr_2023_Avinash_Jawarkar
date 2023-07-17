class PrayamidLoop{
public static void main(String [] args){
	int x=7;
	for (int counter=1; counter<=x; counter++ ){
		for (int counter1 =x ; counter1>=counter; counter1--){
			System.out.print(" * ");
		}
	System.out.println();
	}
}
}