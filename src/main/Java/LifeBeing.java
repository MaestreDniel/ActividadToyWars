public abstract class LifeBeing {
    private Integer qty_points;
    private Integer age;
    private Integer maxPoint;
    private Integer start_Points;

    public Integer getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    public Integer getStart_Points() {
        return start_Points;
    }

    public void setStart_Points(Integer start_Points) {
        this.start_Points = start_Points;
    }

    public Integer getQty_points() {
        return qty_points;
    }

    public void setQty_points(Integer qty_points) {
        this.qty_points = qty_points;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
