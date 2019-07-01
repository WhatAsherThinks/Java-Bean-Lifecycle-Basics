package Demo1;

import java.util.Random;

public class RandomFortune implements FortuneService {

    private String fortunes[]= {
            "You will tie for your next game",
            "You will win your next game",
            "you will lose your next game.",
            "your next game will be a blowout..."};

    Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(fortunes.length);
        return fortunes[index];
    }
}
