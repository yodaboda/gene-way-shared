/****************************************************************************** 
 * Copyright 2010 Firas Swidan, PhD. frsswdn@gmail.com. firas.swidna@icloud.com. 
 * https://www.linkedin.com/in/swidan
 * POBox 8125, Nazareth 16480, Israel. 
 * Public key: AAAAB3NzaC1yc2EAAAADAQABAAACAQD6Lt98LolwuA/aOcK0h91ECdeiyG3QKcUOT/CcMEPV64cpkv3jrLLGoag7YtzESZ3j7TLEd0WHZ/BZ9d+K2kRfzuuCdMMhrBwqP3YObbTbSIM6NjUNwbH403LLb3FuYApUt1EvC//w64UMm7h3fTo0vdyVuMuGnkRZuM6RRAXcODM4tni9ydd3ZQKN4inztkeH/sOoM77FStk8E2VYbljUQdY39zlRoZwUqNdKzwD3T2G00tmROlTZ6K5L8i68Zqt6s0XNS6XQvS3zXe0fI6UwuetnDrcVr1Yb8y2T8lfjMG9+9L2aKPoUOlOMMcyqM+oKVvRUOSdrzmtKOljnYC7TqzvsKrfXHvHlqHxxhPp1K7B/YWrHwCDbqp02dXdIaXkkHCIqKFNaY06HEWt4obDxppVhC8IabSb55LQVCCT7J4TFbwp6rID2+Y1L7NEvR3v3oaWSlQIZ+WSG04mwh9/7gRCt7XUoqmEXCCPoHqZXq5sWv193XA57pD5gKoX7Rf2i6UdbduNTMIhQMqcWIaPMBFwxUv/LRQCHnS+mlW2GnIHIHHGS/S46MurZ6BMvcb7fEz/NorVxvh3DbUaVTteMYcikH0y5sPmGECB1d99ENBBSEX6diI+PneFp2sOouQ6gOBWy6WAt3spGfLTOFMPo3bMV/UpktkQPpXkmfd1esQ==
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.nutrinfomics.geneway.shared.constants;

import com.google.gwt.i18n.client.ConstantsWithLookup;

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

  @DefaultStringValue("Birth date")
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

  @DefaultStringValue("Code mismatch")
  String wrongCodeTitle();

  @DefaultStringValue("The code you have entered does not match. Please retry")
  String wrongCodeMessage();

  @DefaultStringValue("Passwords do not match")
  String passwordAndRepeatMismatchTitle();

  @DefaultStringValue(
      "The two entered passwords do not match. Please make sure to enter the same password twice.")
  String passwordAndRepeatMismatchText();

  @DefaultStringValue("Code has expired")
  String codeExpiredTitle();

  @DefaultStringValue(
      "The code has expired. Please request a new code to validate your mobile number.")
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

  @DefaultStringValue(
      "The entered password is too short. Please enter a password of 6 characters or more")
  String weakPasswordText();

  @DefaultStringValue("Accept terms and policy")
  String acceptTermsTitle();

  @DefaultStringValue("Please accept the Terms of Service and the Privacy Policy.")
  String acceptTermsText();

  @DefaultStringValue("Session expired")
  String sessionExpiredTitle();

  @DefaultStringValue("Next")
  String next();

  @DefaultStringValue("Demo")
  String demo();

  @DefaultStringValue("Pseudonym")
  String nickname();

  @DefaultStringValue("Constipation")
  String constipation();

  @DefaultStringValue("Measurements")
  String measurements();

  @DefaultStringValue("Community")
  String community();

  @DefaultStringValue("Off the track!")
  String imbalanceTitle();

  @DefaultStringValue(
      "Your indicators are out of balace. Please reconsider following the recommendations more precisely")
  String imbalanceText();

  @DefaultStringValue("Good work!")
  String goodWorkTitle();

  @DefaultStringValue("You have made a great progress! Keep up the good work")
  String goodWorkText();

  @DefaultStringValue("Diabetes")
  String diabetes();

  @DefaultStringValue("Hairloss")
  String hairloss();

  @DefaultStringValue("Cholesterol")
  String cholesterol();

  @DefaultStringValue("Fatigue")
  String fatigue();

  @DefaultStringValue("Triglycerides")
  String triglycerides();

  @DefaultStringValue("Arthritis")
  String arthritis();

  @DefaultStringValue("Arthritis")
  String dear();

  @DefaultStringValue("Welcome")
  String welcome();

  @DefaultStringValue("Your status is:")
  String yourStatus();

  @DefaultStringValue("Identifier")
  String identifier();

  @DefaultStringValue("Unlock")
  String unlock();

  @DefaultStringValue("Unlock failed")
  String unlockingFailedTitle();

  @DefaultStringValue("The unlocking operation has failed. Please retry or contact the admin.")
  String unlockingFailedText();

  @DefaultStringValue("<h1> Non-Disclosure Agreement </h1>")
  String ndaTitle();

  String ndaText();
}
