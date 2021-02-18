import org.springframework.util.StringUtils;

public enum Actions implements Iactions {
    ATTACK, COUNTERATTACK, DEFENDING, EAT, SLEEP;

    @Override
    public boolean DoAttack() {
        if(Actions.ATTACK.equals(ATTACK)){
             Iactions.DoAttack().GetCurrentActions(ATTACK);
             else{


            }
             return false;
        }
    }



    @Override
    public boolean DoConterAttack() {
        if (Actions.COUNTERATTACK) {
            return null;
        }

        @Override
        public boolean DoDefending( {
            if (Actions.DEFENDING) {
                return null;
            }

        }

        @Override
        public boolean DoEat () {
            if (Actions.EAT) {
                return null;
            }
        }

    }

    @Override
    public boolean DoSpleep() {
        if (Actions.SLEEP) {
            return  null;
        }

    }


}