package frdsResume1;

/*
 * Mohammad Firdaus Bin Azman (275459)
 */

public class ResumeFRDSmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Resume\n");
		
		Biodata bio = new Biodata(); 
		CGPA cg = new CGPA();
		WorkExp w = new WorkExp();
		Skills s = new Skills();
		Award a = new Award();
		
		
		bio.displayBio();
		cg.displayCGPA();
		System.out.printf("Final CGPA is %.2f" , cg.calculateCGPA());
		w.displayWork();
		s.displaySkills();
		a.displayAward();
	}

}
