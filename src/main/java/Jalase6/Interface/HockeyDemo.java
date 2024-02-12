package Jalase5.Interface;

import org.w3c.dom.events.EventTarget;

public class HockeyDemo implements Hockey, Event {

    private int homeTeamScore;
    private int visitingTeamScore;

    @Override
    public void setNameHomTeam(String name) {
        System.out.println("The Team is "+ name);
    }

    public HockeyDemo() {
        homeTeamScore=0;
        visitingTeamScore=0;
    }

    @Override
    public void HomeGolScore() {
    homeTeamScore++;
    }

    @Override
    public void visitingGolScore() {
    visitingTeamScore++;
    }

    @Override
    public void endOfPeriod(int period) {

    }

    @Override
    public void overTimePeriod(int period) {

    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Visiting Team");
    }


    @Override
    public void organize() {
        System.out.println("Mache Organize");
    }
}
