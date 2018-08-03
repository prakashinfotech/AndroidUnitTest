package com.psspl.unittestexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Prakash Software Solution
 * on 26-05-2018.
 */

class CommanUtility {

    /**
     * Email validation pattern.
     */
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    /**
     * Validates if the given input is a valid email address.
     * @param email The email to validate.
     * @return {@code true} if the input is a valid email. {@code false} otherwise.
     */
    static boolean isValidEmail(CharSequence email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }


    /**
    * This method validate phone number
    * @param pPhoneNumber enter phone number as input Parameter
    * @return true or false;
    * */
    static boolean isPhoneNumberCorrect(String pPhoneNumber) {
        /*
         This mobile number validation pattern
         */
        Pattern pattern = Pattern.compile("^\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}$");
        if (pPhoneNumber == null) {
            return false;
        } else {
            Matcher matcher = pattern.matcher(pPhoneNumber);
            if (matcher.matches())
                return true;
        }
        return false;
    }


    /**
     * This method is validate name
     * @param txtName  Input param is name
     * @return true or false
     * */
    static boolean isValidateLetters(String txtName) {
        if (txtName == null) {
            return false;
        } else {
            String regx = "^[a-zA-Z ]+$";
            Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(txtName);
            return matcher.find();
        }

    }
}


