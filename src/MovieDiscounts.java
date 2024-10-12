import java.util.Scanner;

public class MovieDiscounts {
	public static void main(String[] args) {
		System.out.println("Ingrese su edad: ");
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();
		float ticket = 7.0f;
		System.out.println("Su edad es " + age + " años");
		
		if(age < 5){
			ticket = ticket - (ticket * 0.60f); 
		}else if(age > 60) {
			ticket = ticket - (ticket * 0.55f); 
		}else {
			System.out.print("Cuántos boletos deseas? ");
			short cantidad = sc.nextShort();
			if(cantidad >= 2) {
				ticket = (cantidad * ticket); 
				ticket = ticket - (ticket * 0.30f); 
			}//if>=2
		}//else
		
		System.out.println("El costo total de tu ticket es: " + ticket + "€");
	}//main	
}//class MovieDiscounts
