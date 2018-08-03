package com.psspl.unittestexample;

import android.widget.EditText;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CommanFunctionTestSingle {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    /*
    * Name Test Case
    * */
    @Test
    public void NameValidationNull(){
        assertFalse(CommanUtility.isValidateLetters(null));
    }

    @Test
    public void NameValidationWithValue(){
        assertTrue(CommanUtility.isValidateLetters("haresh"));
    }

    @Test
    public void NameValidationWithSpecial(){
        assertFalse(CommanUtility.isValidateLetters("^%^&&*$#$"));
    }

    @Test
    public void NameValidationWithNumber(){
        assertFalse(CommanUtility.isValidateLetters("haresh874857848688"));
    }

    /*
    * Email Address Validation
    * */
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(CommanUtility.isValidEmail("haresh@gmail.com"));
    }

    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(CommanUtility.isValidEmail("name@email.co.uk"));
    }

    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(CommanUtility.isValidEmail("name"));
    }

    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(CommanUtility.isValidEmail("name@email..com"));
    }

    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(CommanUtility.isValidEmail("@email.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(CommanUtility.isValidEmail(""));
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(CommanUtility.isValidEmail(null));
    }

    /*
    * @mobile number test Case
    * */

    @Test
    public void phoneValidator_NullPhone_ReturnsFalse() {
        assertFalse(CommanUtility.isPhoneNumberCorrect(null));
    }

    @Test
    public void phoneValidator_ReturnsTrue() {
        assertTrue(CommanUtility.isPhoneNumberCorrect("9727966031"));
    }

    @Test
    public void phoneValidator_UKTrue() {
        assertTrue(CommanUtility.isPhoneNumberCorrect("(447) 911 3456"));

    }

    @Test
    public void phoneValidator_DashCouseTrue() {
        assertTrue(CommanUtility.isPhoneNumberCorrect("(447)-911-3456"));

    }
    @Test
    public void phoneValidator_DashTrue() {
        assertTrue(CommanUtility.isPhoneNumberCorrect("447-911-3456"));

    }



}