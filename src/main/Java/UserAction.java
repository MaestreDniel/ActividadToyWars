public class UserAction {
    private String RecordActions;
    private String typeMascot;
    private Integer StartingPoints;
    private Integer TotalPoints;
    private enum Actions {
        ATTACK, DEFENDING, EAT, SLEEP;
    }

    public String actionMethod(Actions actions1){
        Pokemon pokemon = new Pokemon();
        switch(actions1) {
            case ATTACK:
                pokemon.sumPoints();
                System.out.println("Ataque realizado");
                break;
            case DEFENDING:
                pokemon.subtractPoints();
                System.out.println("Defensa realizada");
                break;
            case EAT:
                pokemon.sumPoints();
                System.out.println("Comiendo hasta reventar");
                break;
            case SLEEP:
                pokemon.sumPoints();
                System.out.println("Zzzz...");
                break;
            default:
                System.out.println("Whatever");
        }
        return "OK";
    }

    public String getRecordActions() {
        return RecordActions;
    }

    public void setRecordActions(String recordActions) {
        RecordActions = recordActions;
    }

    public String getType() {
        return typeMascot;
    }

    public void setType(String type) {
        this.typeMascot = typeMascot;
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
