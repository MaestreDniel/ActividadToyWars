public class Pokemon extends LifeBeing implements Iactions, IRender {

    private String type;
    private Integer health;

    Pokemon pokemon = new Pokemon();

    public Pokemon() {

    }

    public Pokemon(String type, Integer health) {
        this.type = type;
        this.health = 100;
    }

    private static Integer totalPoints = 0;

    public static Integer getTotalPoints() {
        return Pokemon.totalPoints;
    }

    public void sumPoints() {
        totalPoints += 5;
    }

    public void subtractPoints() {
        totalPoints -= 3;
    }

    @Override
    public void DoAttack() {
        pokemon.sumPoints();
    }

    @Override
    public void DoDefending() {
        pokemon.subtractPoints();
    }

    @Override
    public void DoEat() {
        pokemon.sumPoints();
    }

    @Override
    public void DoSleep() {
        pokemon.sumPoints();
    }

    /*@Override
    public void getCurrentActions(String Actions) {

    }*/

    /*@Override
    public String DoRender() {
        return null;
    }*/
}