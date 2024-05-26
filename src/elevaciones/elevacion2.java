package elevaciones;

public class elevacion2 {
	public static void main(String[] args) {
		int i , edad , numero=0 , numero2=0 , numero3=0 , numero4=0;
		for (i=1;i<=20;i++) {
			edad=(int)(10+Math.random()*81);
			if(edad<18) {
				numero=numero+1;
			}
			else {
				if(edad>18 &&  edad<40) {
					numero2=numero2+1;	
				}
				else {
					if(edad>40 && edad<65) {
						numero3=numero3+1;
					}else {
						if(edad>65) {
							numero4=numero4+1;
						}
					}
				}
			}
			
		}
		System.out.println("Menores de edad hay: " + numero );
		System.out.println("Media de edad hay: " + numero2 );
		System.out.println("Adulto de edad hay: " + numero3 );
		System.out.println("Jubilado de edad hay: " + numero4 );	
	}
	
	

}
