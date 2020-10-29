package frdsResume1;

/*
 * Mohammad Firdaus Bin Azman (275459)
 */

public class ResumeFRDSmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Resume\n");
		
		Biodata bio = new Biodata(); 
		Result r = new Result();
		CGPA cg = new CGPA();
		WorkExp w = new WorkExp();
		Skills s = new Skills();
		Award a = new Award();
		
		System.out.println("Name: " + bio.name + "\nGender : " + bio.gender + "\nBirthday : " + bio.birthday + "\nAge : " + bio.age + "\nMarital Status : " + bio.marital_status + "\nCitizenship : " + bio.citizenship + "\nAddress : " + bio.address + "\nHP : " + bio.hp);
		System.out.println("\nExam Result" + "\nSubject : " + r.subject + "\nProgramming Language : " + r.lang + "\nGrade : " + r.grade);
		cg.displayCGPA();
		System.out.printf("Final CGPA is %.2f" , cg.calculateCGPA());
		System.out.println("\n\nWork Experiences :" + "\n\t1. " + w.exp);
		System.out.println("\nProfessional SKills :" + "\n\t1. " + s.sk1 + "\n\t2. " + s.sk2);
		System.out.println("\nAward and Certificates : \n" + "\t1. " + a.cert);
	}

}
