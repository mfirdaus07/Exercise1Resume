package frdsResume1;

public class Skills {
	String skill;
	
	Skills(){
	}
	
	Skills(String s) {
		this.skill = s;
	}
	
	public void displaySkills() {
		System.out.println("\nProfessional SKills : ");
		Skills sk1 = new Skills("MS Package 100%");
		Skills sk2 = new Skills("Java Programming 70%");
		System.out.println("\t 1." + sk1.skill);
		System.out.println("\t 2." + sk2.skill);
	}
}
