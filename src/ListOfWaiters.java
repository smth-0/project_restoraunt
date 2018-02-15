public class ListOfWaiters {
    private Waiter array[]= new Waiter[0];

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Waiter getWaiter(){
        for(int i=0;i<array.length;++i){
            if(!array[i].getHandled()){
                return array[i];
            }
        }
        return null;
    }

    public void setArray(Waiter[] array) {
        this.array = array;
    }
}
