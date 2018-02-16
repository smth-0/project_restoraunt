public class Client{
    private int cash=0;
    private String name="NoBody";
    private Boolean isWaiting=true;
    private Waiter myWaiter=null;


    public Client(int cash,String name,Waiter waiter){
        this.cash=cash;
        this.name=name;
        this.myWaiter=waiter;
    }

    public Client(int inf, String adina) {
        this.cash=cash;
        this.name=name;
    }

    void setWaiter(Waiter waiter){
        myWaiter=waiter;
        myWaiter.setBusy(true);

    }

    public int pay(int howManyPay){
        cash-=howManyPay;
        return howManyPay;
    }

    void WouldLike(String nameOfDish){
        myWaiter.cook(nameOfDish);
    }

}
