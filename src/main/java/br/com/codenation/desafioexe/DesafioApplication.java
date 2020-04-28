package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);

		int aux;
		int index, i = 0;


		while (i <= 350){
			index = numbers.size() - 1;
			i = (int) numbers.get(index - 1) + (int) numbers.get(index);
			numbers.add(i);
			//System.out.println("Index " + index + ". Valor: " + numbers.get(index));
		}

		return numbers;
	}

	public static boolean isFibonacci(int value){
		return fibonacci().contains(value);
	}




}