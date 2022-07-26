package aplication;

import java.util.ArrayList;

import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort((p1, p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		/*
		++++ SOLU��ES MAIS VERBOSAS ++++++++ 
		 
		Comparator<Product> comp = (p1, p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp);
		
		 *
		 *
		Comparator<Product> comp = new Comparator<>() {

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		list.sort(comp);
		
		*/
		//list.sort(new MyComparator());
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		
	}

}