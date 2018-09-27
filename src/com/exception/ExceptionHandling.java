package com.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		try {
			System.out.println("User Age:" + readAgeFormUser());
		} catch (NotProperInputException e) {

			//e.printStackTrace();
			//System.err.println("Message:"+e.getMessage());
			
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString(); // stack trace as a string
			System.out.println("Stack trace:"+sStackTrace);
		}

	}

	public static int readAgeFormUser()throws NotProperInputException {
		Scanner sc = new Scanner(System.in);

		int ageInDays = 0;
		try {
			System.out.println("Enter age:");
			ageInDays = Integer.parseInt(sc.nextLine());
			System.out.println("Your  Age in years:" + 365 / ageInDays);
		} catch (NumberFormatException e) {
           throw new NotProperInputException("Enter only valid numbers:");
		}
		return ageInDays;

	}
}
