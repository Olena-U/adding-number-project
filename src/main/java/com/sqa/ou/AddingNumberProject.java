/**
 * File Name: AddingNumberProject.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 16, 2017
 */
package com.sqa.ou;

import java.util.*;

import com.sqa.ou.helpers.*;

/**
 * AddingNumberProject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 * @since 1.0
 */
public class AddingNumberProject {

	public static void main(String[] args) {
		String appName = "Adding Numbers";
		String userName = AppBasics.greetUserAndGetName(appName);
		addTwoNumbers();
		AppBasics.farewellUser(userName, appName);
	}
	
	public static void addTwoNumbers() {
		System.out.println("What is the first number to be added? ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("What is the second number to be added to " + num1 + "? ");
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("Your total from adding these two numbers is " + num3);
	}
}
