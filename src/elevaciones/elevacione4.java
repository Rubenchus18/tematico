package elevaciones;
import java.util.Scanner;
public class elevacione4 {
public static void main(String[] argas) {
	Scanner sc=new Scanner(System.in);
	double cantidad , numero , i , acu=0 , res;
	System.out.println("Dime los numeros que vas a introducir");
	cantidad=sc.nextDouble();
	for(i=1;i<=cantidad;i++) {
		System.out.println("Dime los numeros");
		numero=sc.nextDouble();
		acu=numero+acu;
	}
	res=acu/cantidad;
	System.out.println("Media total: " + res);
}
}
