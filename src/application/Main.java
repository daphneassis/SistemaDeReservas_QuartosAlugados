package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reserva;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Reserva[] vetor= new Reserva[10]; 
		System.out.println("Quantos quartos serão alugados?");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.printf("Rent %d%n", i+1);
			System.out.println("Name:");
			sc.next();
			String nome=sc.nextLine();
			System.out.println("Email");
			String email=sc.nextLine();
			System.out.println("Room");
			int quartoalugado= sc.nextInt();
			Reserva reserva = new Reserva(nome, email);
			vetor[quartoalugado]= reserva;
			//é o mesmo que: vetor[quartoalugado]=new Reserva(nome, email);
		}
		System.out.println("Quartos alugados:");
		for(int i=0;i<10;i++) {
			if(vetor[i]!=null) {
				System.out.println(i+""+ vetor[i]);
			}
		}
		sc.close();	
	}

}
