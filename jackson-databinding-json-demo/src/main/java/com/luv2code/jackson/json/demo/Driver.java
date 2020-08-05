package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {

			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read json from file and map/connect to java pojo

			Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);

			System.out.println("Student First Name " + theStudent.getFirstName());
			System.out.println("Student last Name " + theStudent.getLastName());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
