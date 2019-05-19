package moodle;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LotteryApp {

	public static void main(String[] args) {
		 final int MAX = 45;

	      Set<Integer> jackpot = new HashSet<>();//dit voor de nummers die ik heb toegevoegd

	      Set<Integer> draw = new HashSet<>();//dit voor de random nummers

	      Scanner scanner = new Scanner(System.in);

	      Random rand = new Random();

	      

	      do {

	         draw.add(rand.nextInt(MAX) + 1);

	      } while (draw.size() != 6);

	      

	      do {

	         System.out.println("Enter number between 0 and " + MAX);

	         try {

	            int number = Integer.parseInt(scanner.next());//we voegen hier elementen

	            if (number < 1 || number > MAX) {

	               System.out.println("Invalid");//hier als iemand buiten de periode van getalen cijfers heeft toegevoegd

	            } else {

	               if (!jackpot.add(number)) {//als de element is herhaald 

	                  System.out.println("Duplicate number!");

	               }

	               System.out.print("Numbers :");//als de eerste en tweede gevallen niet is gebeurd,dit is gebeurd

	               jackpot.forEach(n -> System.out.format("%s ", n));//neemt de eerste nummer en is afgedrukt
// we zien dat elke nieuwe number ,is toegevoerd en vergelijken met de vorige nummersen dan worden georderd
	               System.out.println();

	            }

	         } catch (Exception e) {

	            System.out.println("Invalid number!");

	         }

	      } while (jackpot.size() < 6);//do is ingevoerd zolang het aantal nummers minder dan 6 zijn

	      System.out.println("Drawing: ");

	      draw.forEach(System.out::println);//om af te drukken de  random nummers 

	      System.out.println("Jackpot: ");

	      jackpot.forEach(System.out::println);//om af te drukken de nummers die ik heb toegevoegd

	      

	      jackpot.retainAll(draw);//om te weten welke nummers die gemeenschaplijk zijn tussen elkaar

	      

	      System.out.println("Correct numbers: " + jackpot.size());//hier om te weten het aantal nummers die zijn gemeenschaplijk

	      jackpot.forEach(System.out::println);//om afgedrukt te worden 

	      scanner.close();
//hier de nummers worden georderd en als wij 6 nummers hebben toegevoegd en intussen herhaalde nummers
	      // wordt alleen de onherhaalde nummers afgedrukt en de programma vraagt niet terug extra numers totdat
	      //het aantal nummers 6 zal zijn
	}

}
