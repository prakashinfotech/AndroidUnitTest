package com.psspl.unittestexample;


import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by
 * haresh on 26-05-2018.
 */

public class CommonFunctionTestCase {
    /*
    * Name Test Case
    * */
    @Test
    public void isNameValidate(){
        assertFalse(CommanUtility.isValidateLetters(null));
        assertTrue(CommanUtility.isValidateLetters("haresh"));
        assertFalse(CommanUtility.isValidateLetters("^%^&&*$#$"));
        assertFalse(CommanUtility.isValidateLetters("haresh874857848688"));
    }

    /*
    * Email Address Validation
    * */
    @Test
    public void isEmailValidate(){
        assertTrue(CommanUtility.isValidEmail("haresh@gmail.com"));
        assertTrue(CommanUtility.isValidEmail("name@email.co.uk"));
        assertFalse(CommanUtility.isValidEmail("name"));
        assertFalse(CommanUtility.isValidEmail("name@email..com"));
        assertFalse(CommanUtility.isValidEmail("@email.com"));
        assertFalse(CommanUtility.isValidEmail(""));
        assertFalse(CommanUtility.isValidEmail(null));
    }

    /*
    * @mobile number test Case
    * */
    @Test
    public void isPhoneNumberValidation(){
        assertFalse(CommanUtility.isPhoneNumberCorrect(null));
        assertTrue(CommanUtility.isPhoneNumberCorrect("9727966031"));
        assertTrue(CommanUtility.isPhoneNumberCorrect("(447) 911 3456"));
        assertTrue(CommanUtility.isPhoneNumberCorrect("447-911-3456"));
        assertTrue(CommanUtility.isPhoneNumberCorrect("(447)-911-3456"));
    }





}
