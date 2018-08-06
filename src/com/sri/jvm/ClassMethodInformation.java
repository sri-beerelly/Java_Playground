package com.sri.jvm;

import java.lang.reflect.Method;

public class ClassMethodInformation {

	public static void main(String[] args) throws Exception {

		Class<?> student = Class.forName("com.sri.jvm.Student");
		Method[] classMethods = student.getDeclaredMethods();
		for (Method m : classMethods) {
			System.out.println(m.getName());
		}
	}
}

class Student {
	public String studentName() {
		return null;
	}

	public int studentId() {
		return 0;
	}

}
