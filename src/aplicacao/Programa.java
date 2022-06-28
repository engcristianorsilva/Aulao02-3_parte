package aplicacao;

//versão 3 é a melhor!

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // tipo formatação numérica
		
		String path = "emporio_testes2.csv";

		List<Produto> list = new ArrayList<Produto>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {

				String[] vect = line.split(",");
				
				int idProduto = Integer.parseInt(vect[0]);
				
				String produto = vect[1];
				
				double preco = Double.parseDouble(vect[2]);
				
				
				
				Produto prod = new Produto(idProduto,produto, preco);
				list.add(prod);

				line = br.readLine();
			}

			System.out.println("PRODUTOS:");
			for (Produto p : list) {
				System.out.println(p);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
