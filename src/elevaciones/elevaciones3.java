package elevaciones;
import java.util.Scanner;
public class elevaciones3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double kilo , ida , vuelta , total , total2 , descuento;
		System.out.println("Dime la distancia de su viaje ");
		kilo=sc.nextDouble();
		System.out.println("Dia de ida");
		ida=sc.nextDouble();
		System.out.println("Dia de vuelta");
		vuelta=sc.nextDouble();
		total2=kilo*0.20;
		total=ida-vuelta;
		if(kilo>400  &&  total<3) {
			descuento=total2*0.75;
			System.out.println("Total viaje con descuento: " + descuento +"€" );
		}else {
			if(kilo<=400 && total<3) {
				total2=kilo*0.20;
				System.out.println("Total viaje: " + total2 + "€");
			}
		}
	}
	
	
}
