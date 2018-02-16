public class Cooker extends Worker {
    private Boolean isBusy=false;
    private String cookDish="";
    private String name="NoBody";
    Cooker(String name){
        setName(name);
    }

    public void setCookDish(String cookDish) {
        this.cookDish = cookDish;
    }

    public String getCookDish() {
        return cookDish;
    }

    public String getName() {
        return name;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }
}
