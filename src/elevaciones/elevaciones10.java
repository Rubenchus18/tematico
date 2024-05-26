package elevaciones;
import java.util.Scanner;
public class elevaciones10 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int jug1 , jug2 , maq;
		for(int i=1;i<=3;i++) {
			System.out.println("Turno Jugador 1");
			System.out.println("1:Piedra 2:Papel 3:Tijera");
			jug1 = sc.nextInt();
			System.out.println("Turno Jugador 2");
			System.out.println("1:Piedra 2:Papel 3:Tijera");
			jug2 = sc.nextInt();
			System.out.println("Turno Maquina");
			System.out.println("1:Piedra 2:Papel 3:Tijera");
			maq=(int)(1+Math.random()*3);
			if(jug1>jug2 || jug1<jug2) {
				System.out.println("Gana jugador 1");
			}else {
				if(jug2>jug1 || jug2<jug1) {
					System.out.println("Gana jugador 2");	
				}
			}
		}
	}

}
