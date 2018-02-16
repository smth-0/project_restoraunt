abstract class Worker {
    private Boolean isBusy=false;
    private String name="noBody";
    abstract Boolean getIsBusy();
    abstract void setIsBusy(Boolean busy);
    abstract String getName();
    abstract void setName(String name);
}
