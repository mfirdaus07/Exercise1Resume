package frdsResume1;

public class ResumeFRDSmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Resume\n");
		
		Biodata bio = new Biodata(); 
		CGPA cg = new CGPA();
		WorkExp w = new WorkExp();
		Skills s = new Skills();
		Award a = new Award();
		
		System.out.println("Name: " + bio.name + "\nGender : " + bio.gender + "\nBirthday : " 
		+ bio.birthday + "\nAge : " + bio.age + "\nMarital Status : " + bio.marital_status + "\nCitizenship : " 
				+ bio.citizenship + "\nAddress : " + bio.address + "\nHP : " + bio.hp);
		
		cg.displayCGPA();
		System.out.printf("Final CGPA is %.2f" , cg.calculateCGPA());
		System.out.println("\n\nWork Experiences : ");
		w.displayWork();
		System.out.println("\nProfessional SKills : ");
		s.displaySkills();
		System.out.println("\nAward : ");
		a.displayAward();
	}

}
