package elevaciones;
import java.util.Scanner;

public class elevaciones {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int base , elevado;
		System.out.println("Dime el numero de la base");
		base = sc.nextInt();
		System.out.println("Dime el numero con el que lo quieres elevar");
		elevado = sc.nextInt();
		if(base<0) {
			System.out.println("Error");
		}
		else {
			if(elevado<0) {
				System.out.println("Error");
			}
			else {
				if(base>=0) {
					System.out.println(Math.pow(base,elevado));
				}
			}
		}
		
	}
	
}
