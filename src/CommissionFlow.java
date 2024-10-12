import java.util.Scanner;

public class CommissionFlow {
	public static void main(String[] args) {
        // Ejercicio 1.- Commission Calculator
    	System.out.println("Ingrese el total de su venta: ");
        Scanner sc = new Scanner(System.in);
        double sale = sc.nextDouble();
        double commission = 0;
        System.out.println("Tu venta es : " + sale);

        if(sale > 10000) {
			commission = (sale * 30) / 100;
		}else if((sale >= 5001) && (sale < 10000)) {
			commission = (sale * 20) / 100;  
		}else if((sale >= 1001) && (sale < 9999)) {
			commission = (sale * 10) / 100;  
		}else if(sale < 1000) {
			commission = 0;  
		}
        
        System.out.println("Tu comision por tu venta es: " + commission);
        sc.close();
    }//main
}
