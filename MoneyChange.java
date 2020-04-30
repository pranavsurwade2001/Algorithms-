import java.util.*;
class MoneyChange{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		long m = s.nextLong();
		long a=0,b=0,c=0;
		switch(4){
			case 4:
				a = m/4;
				m = m%4;
			case 3:
				b = m/3;
				m = m%3;
			case 1:
				c = m/1;
				m = m%1;
				break;
			default:
				break;
		}
		long sum = a+b+c;
		System.out.println(sum);
	}
}