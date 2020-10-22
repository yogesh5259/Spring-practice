package Com.dipractice;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	@Override
	public String getWork() {
		return "Do more Work to get Success!";
	}
	
	public String getFortune() {
		return fortuneService.getDailyFortune();
	}
	
	public void setFortuneService(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}

}
