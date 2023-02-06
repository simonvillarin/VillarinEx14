package org.ssglobal.training.codes.itemB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestLeCreamDeApp {

	public static void main(String[] args) {
		Scanner sc;

		do {
			System.out.println("-------- Ice Cream Flavors --------");
			System.out.println("[A] Chocolate");
			System.out.println("[B] Vanilla");
			System.out.println("[C] Strawberry");
			System.out.println("[D] Mango");
			System.out.println("[E] Tutti Fruit");
			System.out.println("[F] Almond Crunch");
			System.out.println("[G] Coffee");

			try {
				sc = new Scanner(System.in);
				int scoops = 0;

				try {
					System.out.print("Enter number of scoops: ");
					scoops = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
					continue;
				}

				System.out.print("Enter flavor: ");
				String flavor = sc.next();
				
				if (!(flavor.equalsIgnoreCase("A") || flavor.equalsIgnoreCase("B") || flavor.equalsIgnoreCase("C") ||
					flavor.equalsIgnoreCase("D") || flavor.equalsIgnoreCase("E") || flavor.equalsIgnoreCase("F") ||
					flavor.equalsIgnoreCase("G"))) {
					System.out.println("Please enter letters from A to G only.\n");
					continue;
				}
				
				System.out.print("Purchase a vanilla wafer? [Y] or [N]: ");
				String withWafer = sc.next();

				boolean isWithWafer = false;
				if (withWafer.equalsIgnoreCase("Y")) {
					isWithWafer = true;
				}

				LeCreamDeApp lcda = new LeCreamDeApp(scoops, flavor, isWithWafer);
				lcda.getNumOfScoops();
				lcda.purchasesVanilaWafer();
				lcda.choosesChocolateFlavor();

				System.out.println("Total Price: " + lcda.getPrice());
				System.out.println();

				System.out.print("Do you want to purchase again? [Y] or [N]: ");
				String choice = sc.next();
				
				if (choice.equalsIgnoreCase("N")) {
					System.out.println("Thank You.");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);		
		sc.close();
	}
}
