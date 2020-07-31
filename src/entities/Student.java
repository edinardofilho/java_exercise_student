package entities;

public class Student {
	public String name;
	public double firstQuarterGrade, secondQuarterGrade, thirdQuarterGrade;
	
	public double finalGrade() {
		return firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;
	}
	
	public String toString() {
		if (finalGrade() >= 60.0) {
			return "FINAL GRADE = " 
					+ String.format("%.2f\n", finalGrade())  
					+ "PASS";
		} else {
			return "FINAL GRADE = " 
					+ String.format("%.2f\n", finalGrade())
					+ "FAILED"
					+ "\n"
					+ "MISSING "
					+ String.format("%.2f", (60.0 - finalGrade()))
					+ " POINTS";
		}
	}

}
