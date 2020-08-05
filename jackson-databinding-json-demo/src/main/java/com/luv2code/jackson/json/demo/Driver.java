package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {

			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read json from file and map/connect to java pojo

			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

			// print student first and last name

			System.out.println("Student First Name " + theStudent.getFirstName());
			System.out.println("Student last Name " + theStudent.getLastName());

			// printt address street and city

			Address theAddress = theStudent.getAddress();

			System.out.println("Street: " + theAddress.getStreet());

			System.out.println("City: " + theAddress.getCity());

			for (String string : theStudent.getLanguages()) {
				System.out.println(string);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
