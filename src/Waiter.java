public class Waiter extends Worker{
    private String name="noBody";
    private Boolean isBusy=false;
    private Cooker myCooker;
    Waiter(){
    }
    Waiter(String name, Cooker cooker){
        setName(name);
        setMyCooker(cooker);
    }

    public void cook(String dish){
        myCooker.setCookDish(dish);
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public String getName() {
        return name;
    }

    public void setMyCooker(Cooker myCooker) {
        this.myCooker = myCooker;
    }

    public Cooker getMyCooker() {
        return myCooker;
    }

    public void setBusy(Boolean isBusy) {
        this.isBusy=isBusy;
    }

    public void setName(String name) {
        this.name = name;
    }
}
