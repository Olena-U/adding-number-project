/**
 * File Name: AppBasics.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 14, 2017
 */
package com.sqa.ou.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void addTwoNumbers() {
		System.out.println("What is the first number to be added? ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("What is the second number to be added to " + num1 + "? ");
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("Your total from adding these two numbers is " + num3);
	}

	public static void farewellUser(String userName, String appName) {
		System.out.println("Thank you for using the " + appName + " Application");
		System.out.println("Good Bye " + userName);
	}

	public static String greetUserAndGetName(String nameOfApp) {
		System.out.println("Hello, Welcome to the " + nameOfApp + " App.");
		System.out.println(
				"I'll ask your name first followed by asking for two numbers I will later add and give you total.");
		System.out.print("Could I please ask your name? \n");
		return scanner.nextLine();
	}
}
