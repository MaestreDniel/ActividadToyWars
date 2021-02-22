import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private List<UserAction> actionList;
    private Integer maxPoint;
    private Pokemon CurrentLifeBeing;

    public List<UserAction> getActionList() {
        return actionList;
    }

    public void setActionList(List<UserAction> actionList) {
        this.actionList = actionList;
    }

    public Integer getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    public Pokemon getCurrentLifeBeing() {
        return CurrentLifeBeing;
    }

    public void setCurrentLifeBeing(Pokemon currentLifeBeing) {
        CurrentLifeBeing = currentLifeBeing;
    }


    public doAction(UserAction){
    }

    public resetLifeBeing(LifeBeing){
     return setCurrentLifeBeing(Pokemon);
    }
    public DoRender(){
        return RenderType.JSON; ;
    }
    public getStatus(){
        return getCurrentLifeBeing();


    }
    public getActions(){
        return getActionList();
    }
    public getUserActions(){
        return UserAction;
    }
}