package Com.dipractice.litralvalue;

public class TennisCoach implements Coach {
	
	private String coachName;
	private String coachEmail;
	
	@Override
	public String getWork() {
		return "Do more Work to get Success!";
	}
	
	public void setcoachName(String name) {
		this.coachName = name;
	}
	
	public void setcoachEmail(String email) {
		this.coachEmail = email;
	}
	
	public String getcoachName() {
		return coachName;
	}
	
	public String getcoachEmail() {
		return coachEmail;
	} 

}
