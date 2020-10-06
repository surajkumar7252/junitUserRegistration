
//SURAJMAL KUMAR

//User Registration Program

//Use case 1 i.e. Checking for the correct First Name.


package userregistrationday6.userregistration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.*;
import java.util.Scanner;


public class UserRegistrationDay6 {
	private final static Logger logger=LogManager.getLogger(UserRegistrationDay6.class);
	
	private Pattern firstNamePattern;
	private Matcher matchPattern;
	
	static Scanner sc= new Scanner(System.in);
	
	private static final String CHECK_FIRST_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
	
	public UserRegistrationDay6(){
		
		firstNamePattern=Pattern.compile(CHECK_FIRST_NAME_TEMPLATE);
		}

	public boolean check( String firstName)
	{
		matchPattern=firstNamePattern.matcher(firstName);
		return matchPattern.matches();
	}
	
	public static void main(String[] args) {
		logger.info("Enter the first name: ");
		String firstName=sc.nextLine();
		UserRegistrationDay6 firstNameCheck = new UserRegistrationDay6();
		boolean value=firstNameCheck.check(firstName);
		if(value) {
			logger.info("First Name is correct");
		}
		else if(!value) {
			logger.info("You entered a Wrong First Name.");
			
		}
			
}
	
}