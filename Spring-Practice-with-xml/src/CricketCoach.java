
public class CricketCoach implements Coach {

	//init method
	public void doFirstStuff() {
		System.out.println("CricketCoach: Inside doStuff() method");
	}
	
	//destroy method 
	public void doLastStuff() {
		System.out.println("CricketCoach; Inside doLastStuff() method");
	}
	
	
	@Override
	public String getDailyWork() {
		return "Do more stuff then Yesterday!";
	}

}
