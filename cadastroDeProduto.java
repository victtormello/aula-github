package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class cadastroDeProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produtos produto = new Produtos();
		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		produto.name = sc.nextLine();
		System.out.print("Preço: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + produto);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProdutosEmEstoque(quantity);

		System.out.println();
		System.out.println("Updated data: " + produto);

		System.out.println();
		System.out.println("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		produto.removeProdutosEmEstoque(quantity);

		System.out.println();
		System.out.println("Updated data: " + produto);

		sc.close();
	}

}
