package Demo1;

import org.springframework.stereotype.Component;

public class BaseballCoach implements Coach{

    //define a private feilf gor the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        //use my fortuneService to get a fortune
        return fortuneService.getFortune() ;
    }
}
