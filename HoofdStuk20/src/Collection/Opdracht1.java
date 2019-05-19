package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("Voeg een aantal getalen in");

		List<Integer> list = new ArrayList<>(5);
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());

		
		list.forEach(System.out::println);
		
		System.out.println("((((((())))))))))");
		
		list.forEach(s -> System.out.println(s));
		
		System.out.println("**********");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);
			System.out.println("6666666666");

			System.out.println(list.get(i));

			sum += list.get(i);
		}

		System.out.println("de som :" + sum);
		double average = (sum) / n;

		System.out.println("het gemiddlde:" + average);

		System.out.println("***********************");

		int sum1 = 0;
		int n1 = 6;

		System.out.println("Voeg het aantal getallen in door een LinkedList");
		Scanner input1 = new Scanner(System.in);
		List<Integer> list1 = new LinkedList<>();
		list1.add(input1.nextInt());
		list1.add(input1.nextInt());
		list1.add(input1.nextInt());
		list1.add(input.nextInt());
		list1.add(input1.nextInt());
		list1.add(input1.nextInt());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list1.get(i));
			sum1 += list1.get(i);
		}
		System.out.println("de som:" + sum);
		double average1 = sum / n1;
		System.out.println("het gemiddelde :" + average);

	}

}
