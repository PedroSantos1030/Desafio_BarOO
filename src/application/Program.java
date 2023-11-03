package application;

import java.util.Scanner;

import entiti.Bill;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bill b = new Bill();

		System.out.print("Sexo: ");
		b.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		b.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		b.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		b.barbecue = sc.nextInt();

		System.out.println();
		sc.nextLine();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = %.2f%n", b.feeding());
		System.out.println(b.cover());
		System.out.printf("Ingresso = %.2f%n", b.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = %.2f%n", b.total());

		sc.close();
	}
}
