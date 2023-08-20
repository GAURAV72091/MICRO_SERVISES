class pen{
    String color;
    String type;
    int price;
    public void pro() {
        System.out.println(this.color + this.price + this.type);
    }
    pen(pen p2){
        this.color= p2.color;
        this.type=p2.type;
        this.price=p2.price;
    }
    pen(){

    }
};
public class encapsulation {
    public static void main(String[]arg){
        pen p1=new pen();
        p1.color="red";
        p1.type="gel";
        p1.price=10;
        //p1.pro();
        pen p2=new pen(p1);
        p2.pro();

    }
};
