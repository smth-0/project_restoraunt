public class Waiter {
    private String name="NOBODY";
    private Boolean isHandled=false;

    public Boolean getHandled() {
        return isHandled;
    }

    public String getName() {
        return name;
    }

    public void setHandled(Boolean handled) {
        isHandled = handled;
    }

    public void setName(String name) {
        this.name = name;
    }
}
