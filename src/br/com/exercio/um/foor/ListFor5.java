package br.com.exercio.um.foor;

import java.util.ArrayList;
import java.util.List;

public class ListFor5 {

	public static void main(String[] args) {
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(5);
		listInt.add(3);
		listInt.add(50);
		listInt.add(16);
		
		for (Integer i : listInt) {System.out.println(i);}
		
		System.out.println("-------------------------------------");
		
		
		listInt.stream().forEach(i -> System.out.println(i));
		
		
		
		
		
//		for(int j = 0;j < 5 ;System.out.println(++j + "fora")) {
//			System.out.println(j+ " dentro");
//		}
		}
	}
	

