import java.util.Scanner;

public class KDVCounter {
    public static void main(String[] args) {

        double Kdv,afterKdv, price;
        System.out.print("write your price value: ");
        Scanner input = new Scanner(System.in);
        price= input.nextDouble();

        boolean kosul1= price>=0 && price <=1000;
        boolean kosul2=price>1000;
        int val1= kosul1 ?  18 : 8;
        val1=kosul2 ? 8:18;
        Kdv=val1;
        System.out.println("Your price  : "+ price);
        System.out.println("Your  tax value : "+ Kdv);



        afterKdv= (Kdv/100)* price + price;
        System.out.println("Your new price after tax : "+ afterKdv);


    }
}
