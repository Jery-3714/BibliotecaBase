package Inicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
System.out.println("===== BIBLIOTECA BASE =====");

String titulo;
String autor;

System.out.println("Ingrese el titulo del libro:");
titulo = sc.nextLine();
System.out.println("Ingrese el autor del libro:");
autor = sc.nextLine();

System.out.println("Libro registrado:");
System.out.println("Titulo:" + titulo);
System.out.println("Autor:" + autor);
sc.close();
	}

}

