package com.example.linux_nwl_10.icccricketfixture;

public class ContentModel {

    private String dateOfMatch;
    private String numberOfMatch;
    private String firstTeamName;
    private  int firstTeamImage;


    private String secondTeamName;
    private  int secondTeamImage;

    public String getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(String dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public String getNumberOfMatch() {
        return numberOfMatch;
    }

    public void setNumberOfMatch(String numberOfMatch) {
        this.numberOfMatch = numberOfMatch;
    }

    public String getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(String matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    private String matchStartTime;

    public String getFirstTeamName() {
        return firstTeamName;
    }

    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }

    public int getFirstTeamImage() {
        return firstTeamImage;
    }

    public void setFirstTeamImage(int firstTeamImage) {
        this.firstTeamImage = firstTeamImage;
    }

    public String getSecondTeamName() {
        return secondTeamName;
    }

    public void setSecondTeamName(String secondTeamName) {
        this.secondTeamName = secondTeamName;
    }

    public int getSecondTeamImage() {
        return secondTeamImage;
    }

    public void setSecondTeamImage(int secondTeamImage) {
        this.secondTeamImage = secondTeamImage;
    }
}
