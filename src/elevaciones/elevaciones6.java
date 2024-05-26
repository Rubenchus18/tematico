package elevaciones;
import java.util.Scanner;
public class elevaciones6 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2 , i=0 , num3;
		System.out.println("Dime los numero que quieres");
		num1=sc.nextInt();
		System.out.println("Por donde quieres que empieze");
		num2=sc.nextInt();
		for  (i=0;num1<=i;num2++) {
			if(num2%2==0) {
				System.out.println(num2);
			num1=num1-1;
			}
		}
	}
	
}
