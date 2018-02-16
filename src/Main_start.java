import java.util.Scanner;

public class Main_start {
    public static void main(String args[]){
        int inf= 999999999;
        int balance=0;
        Scanner sc = new Scanner(System.in);

        Cooker cooker= new Cooker("Fatish");
        Waiter waiter=new Waiter("Bob",cooker);
        Client client=new Client(inf,"Adina",waiter);

        client.WouldLike("chicken soup");
        balance+=client.pay(2);

        System.out.println(balance);
        sc.close();
    }
}
