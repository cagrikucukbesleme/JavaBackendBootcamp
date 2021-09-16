package project14_FligtTicketCost;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        System.out.println("Uçak bileti hesaplama projesine hoşgeldiniz....\n Lütfen aşağıdaki bilgileri doldurunuz");
        int distance,age,travelType;
        Scanner input=new Scanner(System.in);
        System.out.print("Toplam mesafe kaç KM?:  ");
        distance=input.nextInt();

        System.out.print("Kaç yaşındasınız : ");
        age=input.nextInt();

        System.out.print("1. tek yön\n 2.gidiş dönüş\n Uçuş tipinizi seçiniz:");
        travelType=input.nextInt();

        Boolean isError = false;
        double cost= distance*(0.10);
        double ageSale1=cost*0.5;
        double ageSale2=cost*0.1;
        double ageSale3=cost*0.3;
        double doubleWaySale2=0;
        double discount=0;



        if(age>0 && age<12){
            switch (travelType){

                case 1:
                    discount=cost-ageSale1;

                    break;
                case 2:
                    cost-=ageSale1;
                    doubleWaySale2=cost*0.2;
                    discount=(cost-doubleWaySale2)*2;
                    break;
                default:

                    isError=true;

            }

        }

        else if(age>=12 && age<=24){

            switch (travelType){
                case 1:
                    discount=cost-ageSale2;
                    break;
                case 2:
                    cost-=ageSale2;
                    doubleWaySale2=cost*0.2;
                    discount=(cost-doubleWaySale2)*2;


                    break;
                default:
                    isError=true;

            }

        }
        else if(age>65){

            switch (travelType){
                case 1:
                    discount=cost-ageSale3;
                    break;
                case 2:
                    cost-=ageSale3;
                    doubleWaySale2=cost*0.2;
                    discount=(cost-doubleWaySale2)*2;
                    break;
                default:
                    isError=true;

            }

        }

        else{
            discount=cost;
        }


        if(age<0 || distance<0||isError==true){
            System.out.println("Hatalı veri girdiniz !");
        }
        else{
            System.out.println("Yaş indirimi "+ageSale2);
            System.out.println("çift yön indirimi "+doubleWaySale2);
            System.out.println("Toplam tutar: "+ discount);
        }


    }
}
