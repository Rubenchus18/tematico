package elevaciones;
import java.util.Scanner;
public class elevaciones7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num1 , i ,  multi1=1;
	System.out.println("Dame un numero ");
	num1= sc.nextInt();
	System.out.print(num1 + "! = ");
	if(num1<=1) {
		System.out.print(num1 + "! = " + num1 + "=" + num1 );
	}else {
		if(num1>1){
			for(i=1;i<=num1;num1--) {
				multi1=multi1*num1;
				System.out.print(num1 + "*"); 	
			}
			}	
		
	}
	System.out.print("= "+ multi1);
}
}
