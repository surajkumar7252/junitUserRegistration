
//SURAJMAL KUMAR

//User Registration Program

//Use case 3 i.e. Checking for the correct Phone Number.


package userregistrationday6.userregistration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.*;
import java.util.Scanner;


public class UserRegistrationDay6 {
	private final static Logger logger=LogManager.getLogger(UserRegistrationDay6.class);
	
	
	
	
	private Pattern lastNamePattern;
	private Pattern firstNamePattern;
	
	private Pattern phoneNumberPattern;
	private Matcher matchPatternLastName;
	private Matcher matchPatternFirstName;
	
	private Matcher matchPatternPhone;
	
	static Scanner lastnamefeed= new Scanner(System.in);
	static Scanner firstnamefeed= new Scanner(System.in);
	static Scanner emailFeed= new Scanner(System.in);
	static Scanner phoneFeed= new Scanner(System.in);
	
	private static final String CHECK_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
    private static final String CHECK_PHONE_NUMBER_TEMPLATE ="^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}";
    
	public UserRegistrationDay6(){
		
		firstNamePattern=Pattern.compile(CHECK_NAME_TEMPLATE);
		lastNamePattern=Pattern.compile(CHECK_NAME_TEMPLATE);
		phoneNumberPattern=Pattern.compile(CHECK_PHONE_NUMBER_TEMPLATE);
		
		}

	public boolean checkLastName( String lastName)
	{
		matchPatternLastName=lastNamePattern.matcher(lastName);
		return matchPatternLastName.matches();
	}
	
	public boolean checkFirstName( String firstName)
	{
		matchPatternFirstName=firstNamePattern.matcher(firstName);
		return matchPatternFirstName.matches();
	}
	public boolean checkPhoneNumber( String phone)
	{
		matchPatternPhone=phoneNumberPattern.matcher(phone);
		return matchPatternPhone.matches();
	}
	
	
	public static void main(String[] args) {
		
		logger.info("Enter the first name: ");
		String firstName=firstnamefeed.nextLine();
		logger.info("Enter the last name: ");
		String lastName=lastnamefeed.nextLine();
		logger.info("Enter the PhoneNumber: ");
		String phone=phoneFeed.nextLine();
		
		UserRegistrationDay6 lastNameCheck = new UserRegistrationDay6();
		UserRegistrationDay6 firstNameCheck = new UserRegistrationDay6();
		UserRegistrationDay6 phoneCheck = new UserRegistrationDay6();
		
		boolean firstResponse=firstNameCheck.checkFirstName(firstName);
		boolean lastResponse=lastNameCheck.checkLastName(lastName);
		boolean phoneResponse=phoneCheck.checkPhoneNumber(phone);
		
		if(firstResponse) {
			logger.info("First Name is Correct.");
		}
		else if(!firstResponse) {
			logger.info("You entered a Wrong First Name.");
		}
		
		if(lastResponse) {
			logger.info("Last Name is Correct.");
		}
		else if(!lastResponse) {
			logger.info("You entered a Wrong Last Name.");
		}
		
		if(phoneResponse) {
			logger.info("Phone Number is Correct.");
		}
		else if(!phoneResponse) {
			logger.info("You entered a Wrong Phone Number.");
		}
			
			
}
	
}