package project30_PrimeNum;

public class PrimeNumb {
    public static void main(String[] args) {
        System.out.println("Prime number finder----- between 1 and 100");
        for(int i=2;i<100;i++){
            if(i==2){
                System.out.print(i+" ");
            }
            else if(i==3){
                System.out.print(i+" ");
            }
            else if(i==5){
                System.out.print(i+" ");
            }
            else if(i==7){
                System.out.print(i+" ");
            }
            else if(i%2!=0 && i%3!=0 && i%5!=0 &&  i%7!=0){
                System.out.print(i+" ");

            }


        }
    }
}
