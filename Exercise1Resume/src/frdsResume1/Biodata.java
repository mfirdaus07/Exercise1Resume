package frdsResume1;

public class Biodata {
	String name, birthday, address, marital_status, citizenship, hp;
	char gender;
	int age;
	
	//sadfghjk
	
	Biodata(){
		this.name = "Mohd Firdaus";
		this.gender = 'M';
		this.birthday = "18 March 1998";
		this.age = 22;
		this.marital_status = "Single";
		this.citizenship = "Malaysia";
		this.address = "No 24, Lorong Seri Maju, 4/4 Taman Seri Maju, 13200 Kepala Batas, Pulau Pinang";
		this.hp = "019-7387800";
	}
	
	public void displayBio() {
		Biodata bio1 = new Biodata();
		System.out.println("Name: " + bio1.name + "\nGender : " + bio1.gender + "\nBirthday : " + bio1.birthday + "\nAge : " + bio1.age + "\nMarital Status : " + bio1.marital_status + "\nCitizenship : " + bio1.citizenship + "\nAddress : " + bio1.address + "\nHP : " + bio1.hp);
	}
}
