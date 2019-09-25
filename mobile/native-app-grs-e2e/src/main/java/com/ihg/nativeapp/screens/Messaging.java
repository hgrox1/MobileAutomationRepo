package com.ihg.nativeapp.screens;

public class Messaging {
	public enum Message {
		// Login
		ERR_LOGIN_EMPTY_USERNAME_PASSWORD, ERR_LOGIN_EMPTY_USERNAME, ERR_LOGIN_LESSNUMBER_USERNAME, ERR_LOGIN_EMPTY_PASSWORD, ERR_LOGIN_WRONG_USERNAME_PASSWORD,

	}

	/*
	 * return the message according to brand, plugging in dynamic values.
	 * Observing the below logical structure is probably the easiest way to
	 * accommodate additional brands in the future.
	 */
	public static String get(Message msg) {
		switch (msg) {
		case ERR_LOGIN_EMPTY_USERNAME_PASSWORD:
			String base = "Error: - Please enter member Id. - Please enter pin.";
			return base;
		case ERR_LOGIN_EMPTY_USERNAME:
			return "Error: - Please enter member Id.";
		case ERR_LOGIN_EMPTY_PASSWORD:
			return "Error: - Please enter PIN.";
		case ERR_LOGIN_WRONG_USERNAME_PASSWORD:
			return "Your account number, email and/or pin combination is incorrect. Please try again or contact Customer Care for assistance.";
		case ERR_LOGIN_LESSNUMBER_USERNAME:
			return "Error: - Your IHG® Rewards Club Number must be 9 digits in length.";

		default:
			break;
		}
		throw new IllegalArgumentException("No message mapped to " + msg);
	}
}