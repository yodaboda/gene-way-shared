package com.nutrinfomics.geneway.shared.constants;

import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Widget;

public interface GeneWayConstants extends ConstantsWithLookup {
	@DefaultStringValue("Login")
	String login();
	
	@DefaultStringValue("Register")
	String register();
	
	@DefaultStringValue("Password")
	String password();
	
	@DefaultStringValue("Username")
	String username();
	
	@DefaultStringValue("Private name")	
	String privatename();
	
	@DefaultStringValue("Family name")
	String familyname();
	
	@DefaultStringValue("Email")
	String email();
	
	@DefaultStringValue("Phone number")
	String phonenumber();
	
	@DefaultStringValue("Brith date")
	String birthdate();
	
	@DefaultStringValue("Weight")
	String weight();
	
	@DefaultStringValue("Height")
	String height();
	
	@DefaultStringValue("Confirm your password")	
	String repeatpassword();
	
	@DefaultStringValue("Gender")	
	String gender();

	@DefaultStringValue("Female")	
	String female();
	
	@DefaultStringValue("Male")	
	String male();

	@DefaultStringValue("You have entered wrong credentials")
	String invalidLogin();

	@DefaultStringValue("Invalid login")
	String invalidLoginTitle();

	
	@DefaultStringValue("User is not authorized to login from this device")	
	String unauthorizedDevice();

	@DefaultStringValue("Unauthorized Device")	
	String unauthorizedDeviceTitle();

	
	@DefaultStringValue("Username taken. Please choose a different username")
	String usernameExists();

	@DefaultStringValue("Error")		
	String error();

	@DefaultStringValue("Registration was succesful. You will be redirected next to login page")			
	String registrationSuccessful();

	@DefaultStringValue("Next meal")
	String nextMeal();

	@DefaultStringValue("Meal taken")	
	String mealTaken();

	@DefaultStringValue("Meals")	
	String meals();

	@DefaultStringValue("Favorites")	
	String favorites();

	@DefaultStringValue("Ingredients")	
	String ingredients();

	@DefaultStringValue("Please take your snack - it is about time")	
	String itsTimeToTakeYourMeal();

	@DefaultStringValue("Snack time")	
	String itsTimeToTakeYourMealTitle();
	
	
	@DefaultStringValue("Existing Account")
	String existingAccount();

	@DefaultStringValue("Join Now")
	String newAccount();
	
	@DefaultStringValue("Food Item")
	String foodItem();

	@DefaultStringValue("Reem")
	String reem();

	@DefaultStringValue("Lost 35 KG")
	String lost35kg();

	@DefaultStringValue("In 7 months")
	String in7Months();

	@DefaultStringValue("You?")
	String youQM();

	@DefaultStringValue("Time")
	String timeInTimeForChange();

	@DefaultStringValue("for")
	String forInTimeForChange();

	@DefaultStringValue("change")
	String changeInTimeForChange();

	@DefaultStringValue("Settings")
	String settings();

	@DefaultStringValue("Hours btw snacks")
	String timeBetweenMeals();

	@DefaultStringValue("Send SMS alerts")
	String smsSnackAlerts();

	@DefaultStringValue("Snack order")
	String snackOrder();

	@DefaultStringValue("Language")
	String language();

	@DefaultStringValue("automatic")
	String auto();

	@DefaultStringValue("Send email alerts")
	String emailSnackAlerts();

	@DefaultStringValue("Start here")
	String startHere();

	@DefaultStringValue("Start")
	String start();

	@DefaultStringValue("Enter verification code")
	String enterVerificationCode();

	@DefaultStringValue("Verify")
	String verify();

	@DefaultStringValue("Verified")
	String verified();

	@DefaultStringValue("Thank you. Your phone has been verified")
	String phoneVerified();

	@DefaultStringValue("Code unmatch")
	String wrongCodeTitle();

	@DefaultStringValue("The code you have entered does not match. Please retry")
	String wrongCodeMessage();
	
	@DefaultStringValue("Passwords do not match")
	String passwordAndRepeatMismatchTitle();

	@DefaultStringValue("The two entered passwords do not match. Please make sure to enter the same password twice.")
	String passwordAndRepeatMismatchText();

	@DefaultStringValue("Code has expired")
	String codeExpiredTitle();

	@DefaultStringValue("The code has expired. Please request a new code to validate your mobile number.")
	String codeExpiredText();

	@DefaultStringValue("Send a new code")
	String resendCode();

	@DefaultStringValue("I accept the Terms of Service and the Privacy Policy")
	String acceptTerms();

	@DefaultStringValue("The Terms of Service")
	String termsOfService();
	
	@DefaultStringValue("Terms of Service")
	String termsOfServiceTitle();

	@DefaultStringValue("Hereby, I agree...")
	String termsOfServiceText();

	@DefaultStringValue("the Privacy Policy")
	String privacyPolicy();

	@DefaultStringValue(" and ")
	String and();

	@DefaultStringValue("Privacy Policy")
	String privacyPolicyTitle();

	@DefaultStringValue("Hereby, I agree...")
	String privacyPolicyText();

	@DefaultStringValue("Phone number format error")
	String phoneNumberFormatErrorTitle();

	@DefaultStringValue("The entered phone number is in the wrong format. Please correct it.")
	String phoneNumberFormatErrorText();

	@DefaultStringValue("Weak password")
	String weakPasswordTitle();

	@DefaultStringValue("The entered password is too short. Please enter a password of 6 characters or more")
	String weakPasswordText();

	@DefaultStringValue("Accept terms and policy")
	String acceptTermsTitle();

	@DefaultStringValue("Please accept the Terms of Service and the Privacy Policy.")
	String acceptTermsText();
}
