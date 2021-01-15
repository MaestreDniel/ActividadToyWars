package com.studentsfp.devenvironment.unittesting.jugadores.competition;

import java.util.List;

public class League {
    private List<Team> teamList;
    private List<Match> calendar;
    private Team winner;
    private Integer year;
    public List<Team> getTeamList() {
        return teamList;
    }
    public void setTeamList(List<Team> teamList){
        this.teamList = teamList;
    }
}
