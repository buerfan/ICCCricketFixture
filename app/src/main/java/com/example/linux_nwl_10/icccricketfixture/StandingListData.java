package com.example.linux_nwl_10.icccricketfixture;

public class StandingListData {

    String dataID,countryName,numberOfMatch,numberOfWin,numberOfLoss,dataNRR,pts;

    public StandingListData()
    {

    }
    public StandingListData(String dataID, String countryName, String numberOfMatch, String numberOfWin, String numberOfLoss, String dataNRR, String pts) {
        this.dataID = dataID;
        this.countryName = countryName;
        this.numberOfMatch = numberOfMatch;
        this.numberOfWin = numberOfWin;
        this.numberOfLoss = numberOfLoss;
        this.dataNRR = dataNRR;
        this.pts = pts;
    }

    public String getDataID() {
        return dataID;
    }

    public void setDataID(String dataID) {
        this.dataID = dataID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getNumberOfMatch() {
        return numberOfMatch;
    }

    public void setNumberOfMatch(String numberOfMatch) {
        this.numberOfMatch = numberOfMatch;
    }

    public String getNumberOfWin() {
        return numberOfWin;
    }

    public void setNumberOfWin(String numberOfWin) {
        this.numberOfWin = numberOfWin;
    }

    public String getNumberOfLoss() {
        return numberOfLoss;
    }

    public void setNumberOfLoss(String numberOfLoss) {
        this.numberOfLoss = numberOfLoss;
    }

    public String getDataNRR() {
        return dataNRR;
    }

    public void setDataNRR(String dataNRR) {
        this.dataNRR = dataNRR;
    }

    public String getPts() {
        return pts;
    }

    public void setPts(String pts) {
        this.pts = pts;
    }
}
