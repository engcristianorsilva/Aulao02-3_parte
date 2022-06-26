package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		String path = "C:\\emporio.txt";
		
		List<Produto> list = new ArrayList<Produto>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				String nome = vect[0];
				Double preco = Double.parseDouble(vect[1]);
				Integer quantidade = Integer.parseInt(vect[2]);
				
				Produto prod = new Produto(nome, preco, quantidade);
				list.add(prod);
				
				line = br.readLine();
			}	
			
			System.out.println("PRODUTOS:");
			for (Produto p : list) {
				System.out.println(p);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
