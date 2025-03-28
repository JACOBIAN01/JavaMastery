
import java.util.ArrayList;

public class ReserveTicket {

    ArrayList<Integer> humsafar = new ArrayList<>(10);

    public void Cancel(int seat) {
        if (humsafar.contains(seat)) {
            System.out.println(seat + " Seat Unavailable!");
        } else {
            humsafar.add(seat);
            System.out.println(seat +" Ticket Canceled Successfully");
        }

    }

    public void Book(int seat) {
        if(humsafar.contains(seat)){
            humsafar.remove(Integer.valueOf(seat));
            System.out.println(seat+" Ticket Booked Successfully");
        }else{
            System.out.println(seat+ " Ticket Can not be Booked");
        }
        
    }

    public void show() {
        System.out.println("Available Seat");
        for(int i:humsafar){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ReserveTicket rc = new ReserveTicket();
        rc.humsafar.add(1);
        rc.humsafar.add(2);
        rc.humsafar.add(3);
        rc.humsafar.add(4);
        rc.humsafar.add(5);

        rc.show();
        rc.Book(1);
        rc.Book(2);
        rc.show();
        rc.Cancel(1);
        rc.show();
        

    }
}
