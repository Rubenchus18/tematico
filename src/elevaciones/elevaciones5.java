package elevaciones;
import java.util.Scanner;
public class elevaciones5 {
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int horas , horasextra=0 , horastotales;
	for(horas=0;horas<=60;) {
		System.out.println("Introduzca las horas trabajadas laborables");
		horas = sc.nextInt();
		System.out.println("Introduzca las horas trabajadas extra laborables");
		horasextra = sc.nextInt();
		if(horas<40) {
			horas=horas*16;
			System.out.println("En total has ganado con las horas laborables: " + horas +"€");
		}else {
			if(horasextra>=40){
				horasextra=horasextra*20;
				System.out.println("En total has ganado con las horas extra: " + horasextra + "€");
			}
		}
		
	}
	horastotales=horas+horasextra;
		if(horastotales<=60) {
			System.out.println("CABRON");
		}else if(horastotales>60) {
			System.out.println("Todo en total: " + horastotales + "€");
		}	

}
}
