package io.github.qinghaoh.app.drawsimulator.draw;

import io.github.qinghaoh.app.drawsimulator.competition.Competition;
import io.github.qinghaoh.app.drawsimulator.competition.Round;

public class Draw {
    private Competition competition;
    private int year;

    public Draw(Competition competition, int year) {
        this.competition = competition;
        this.year = year;
    }

    public String start(Round round) {
        return competition + " (" + year + "): " + round + " Draw!";
    }
}
