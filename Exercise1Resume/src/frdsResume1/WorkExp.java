package frdsResume1;

public class WorkExp {
	String exp;
	
	WorkExp(){
	}
	
	WorkExp(String e){
		this.exp = e;
	}
	
	public void displayWork(){
		System.out.println("\n\nWork Experiences : ");
		WorkExp job1 = new WorkExp("Technician");
		WorkExp job2 = new WorkExp("Support Engineer");
		System.out.println("\t 1." + job1.exp);
		System.out.println("\t 2." + job2.exp);
		
	}
}
