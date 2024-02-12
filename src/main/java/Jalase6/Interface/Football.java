package Jalase5.Interface;

import org.w3c.dom.events.Event;

public interface Football extends Sport, Event {
    void setHomeTeamScore(int points);
    void setVisitingTeamScore(int points);
    void endOfQuarter(int quarter);

}
