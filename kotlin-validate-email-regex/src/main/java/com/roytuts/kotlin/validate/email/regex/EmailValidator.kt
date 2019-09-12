package com.roytuts.kotlin.validate.email.regex

class EmailValidator {
	companion object {
		@JvmStatic
		val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";

		fun isEmailValid(email: String): Boolean {
			return EMAIL_REGEX.toRegex().matches(email);
		}
	}
}

fun main(args: Array<String>) {
	println(EmailValidator.isEmailValid("Julia.abc@"));
	println(EmailValidator.isEmailValid("Samantha@com"));
	println(EmailValidator.isEmailValid("Samantha_21."));
	println(EmailValidator.isEmailValid(".1Samantha"));
	println(EmailValidator.isEmailValid("Samantha@10_2A"));
	println(EmailValidator.isEmailValid("JuliaZ007"));
	println(EmailValidator.isEmailValid("Julia@007.com"));
	println(EmailValidator.isEmailValid("_Julia007.com"));
	println(EmailValidator.isEmailValid("_Julia007@abc.co.in"));
	println(EmailValidator.isEmailValid("Julia.007@abc.com"));
}
