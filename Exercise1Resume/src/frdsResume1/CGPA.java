package frdsResume1;

public class CGPA {
	double cgpa = 3.56;
	double[] gpa = {3.67, 3.54, 3.74, 3.6};
	double total = 0;
	double average;
	
	public void displayCGPA() {
		System.out.println("\nCGPA");
		System.out.println("Sem 1 : " + gpa[0]);
		System.out.println("Sem 2 : " + gpa[1]);
		System.out.println("Sem 3 : " + gpa[2]);
		System.out.println("Sem 4 : " + gpa[3]);
		//System.out.printf("Final CGPA is %.2f" , average);
	}
	
	
	public double calculateCGPA() {
		for (int i = 0; i < gpa.length; i++) {
			total+= gpa[i]; 
		}
		
		if (gpa.length != 0) {
			average = total/gpa.length;
		} else {
			average = 0.0;
		}
		return average;
	}	
	
}
