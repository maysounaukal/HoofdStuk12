package Examples;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("element");
		list.add("number");
		list.add("animal");
		list.add("zoo");
		
		list.add(3,"hond");//een element in de index " is toegevoegd
		System.out.println(list);//als wij een array tussen twee rechthoekige haakjes willen afprinten
		
		
		for(String el: list) {
			System.out.println(el);// hier de elementen worden overgelopen
		}
		
		
		list.remove("zoo");//de element zoo is gewijzigd
		
		System.out.println(list);
		
		list.set(2, "elephant");
		
		System.out.println(list);

	}

}
