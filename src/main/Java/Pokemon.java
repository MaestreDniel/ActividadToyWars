public class Pokemon extends LifeBeing implements Iactions, IRender {
    @Override
    public boolean DoAttack() {
        return false;
    }

    @Override
    public boolean DocAttack() {
        return false;
    }

    @Override
    public boolean DoDefending() {
        return false;
    }

    @Override
    public boolean DoEat() {
        return false;
    }

    @Override
    public boolean DoSpleep() {
        return false;
    }

    @Override
    public String DoRender() {
        return null;
    }
}