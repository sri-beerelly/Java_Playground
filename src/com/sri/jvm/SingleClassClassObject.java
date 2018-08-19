package com.sri.jvm;

public class SingleClassClassObject {
	public static void main(String[] args) {
		NewStudent s1 = new NewStudent();
		Class<? extends NewStudent> c1 = s1.getClass();
		NewStudent s2 = new NewStudent();
		Class<? extends NewStudent> c2 = s2.getClass();
		System.out.println("c1 hascode "+ c1.hashCode());
		System.out.println("c2 hascode "+ c2.hashCode());
		if(c1 ==c2 )
			System.out.println("true");
	}

}

class NewStudent {
	public String studentName() {
		return null;
	}

	public int studentId() {
		return 0;
	}

}
