public class UserAction {
    private String RecordAcctions;
    private  String type;
    private Integer StartingPoints;
    private Integer TotalPoints;

    public String getRecordAcctions() {
        return RecordAcctions;
    }

    public void setRecordAcctions(String recordAcctions) {
        RecordAcctions = recordAcctions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStartingPoints() {
        return StartingPoints;
    }

    public void setStartingPoints(Integer startingPoints) {
        StartingPoints = startingPoints;
    }

    public Integer getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        TotalPoints = totalPoints;
    }
}
