package Demo1;

public class DanceCoach implements Coach {

    private FortuneService fortuneService;

    //no-arg constructor
    public DanceCoach() {
        System.out.println("DanceCoach: inside no-arg constructor");
    }
    public DanceCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("DanceCoach: inside setterMethod-  setFortuneService");
    }

    @Override
    public String getDailyWorkout() {
        return "Hold a split for 8 counts.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add init method
    public void doMyStartupStuff(){
        System.out.println("DanceCoach Inside method DoMyStartupStuff");
    }

    //add destroy method
    public void doMyCleanupStuff(){
        System.out.println("DanceCoach: inside method DoMyCleanupStuff");
    }


}
