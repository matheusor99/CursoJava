package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		
		System.out.println(list.size());
		
		/**
		 * remover item ou por posição 
		 */
		list.remove("Anna");
		list.remove(2);
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------");
		
		/*
		 * remover por um predicado
		 * aqui vou remover todos os elementos que a primeira letra é igual a M
		 */
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		
		/**
		 * encontrar a posição de 1 elemento
		 * se o elemento passado não existir na lista ela retornará o valor -1
		 */
		System.out.println(list.indexOf("Bob"));
		System.out.println(list.indexOf("Marcos"));
		System.out.println("-----------------------------------------");
		
		/*
		 * como fazer para ter uma lista que so tenha a letra A como inicial  
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String i : result) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		
		list.add("Andressa");
		
		/*
		 * como pegar o primeiro elemento que começa com a letra A
		 * se não encontrar nenhum elemento que comece com a letra A na minha lista ele retornará o valor null 
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		
	}
}
