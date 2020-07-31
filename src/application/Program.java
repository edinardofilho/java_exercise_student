package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student;
		student = new Student();
		
		student.name = sc.nextLine();
		student.firstQuarterGrade = sc.nextDouble();
		student.secondQuarterGrade = sc.nextDouble();
		student.thirdQuarterGrade = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}

}
