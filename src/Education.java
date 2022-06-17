
public class Education {

	String Degree;
	String Major;
	int Researches;
	
	
	public Education() {
		
		Degree = "";
		Major = "";
		Researches = 0;
	}
	
	
	public Education(String degree, String major, int researches) {
	
		Degree = degree;
		Major = major;
		Researches = researches;
	}


	public String getDegree() {
		return Degree;
	}


	public void setDegree(String degree) {
		Degree = degree;
	}


	public String getMajor() {
		return Major;
	}


	public void setMajor(String major) {
		Major = major;
	}


	public int getResearches() {
		return Researches;
	}


	public void setResearches(int researches) {
		Researches = researches;
	}
	
	
	
	
	
}
