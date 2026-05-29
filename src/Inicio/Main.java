package Inicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
System.out.println("===== BIBLIOTECA BASE =====");

int contador = 1;
int numero;

System.out.println("Ingrese un numero: ");
numero = Integer.parseInt(sc.nextLine());

while(contador <= numero) {
System.out.println(contador);
contador++;
}
if(numero >= 1 && numero <= 15) {
System.out.println("Exito");
}
else {
System.out.println("Fracaso");
}
sc.close();
}

}
