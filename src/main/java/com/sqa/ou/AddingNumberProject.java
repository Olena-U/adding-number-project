/**
 * File Name: AddingNumberProject.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 16, 2017
 */
package com.sqa.ou;

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
		AppBasics.addTwoNumbers();
		AppBasics.farewellUser(userName, appName);
	}
}
