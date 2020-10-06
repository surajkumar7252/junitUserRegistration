
//SURAJMAL KUMAR

//User Registration Program

//Use case 2 i.e. Checking for the correct Last Name.


package userregistrationday6.userregistration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.*;
import java.util.Scanner;


public class UserRegistrationDay6 {
	private final static Logger logger=LogManager.getLogger(UserRegistrationDay6.class);
	
	private Pattern lastNamePattern;
	private Matcher matchPattern;
	
	static Scanner sc= new Scanner(System.in);
	
	private static final String CHECK_LAST_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
	
	public UserRegistrationDay6(){
		
		lastNamePattern=Pattern.compile(CHECK_LAST_NAME_TEMPLATE);
		}

	public boolean check( String lastName)
	{
		matchPattern=lastNamePattern.matcher(lastName);
		return matchPattern.matches();
	}
	
	public static void main(String[] args) {
		logger.info("Enter the last name: ");
		String lastName=sc.nextLine();
		UserRegistrationDay6 lastNameCheck = new UserRegistrationDay6();
		boolean value=lastNameCheck.check(lastName);
		if(value) {
			logger.info("Last Name is correct");
		}
		else if(!value) {
			logger.info("You entered a Wrong Last Name.");
			
		}
			
}
	
}