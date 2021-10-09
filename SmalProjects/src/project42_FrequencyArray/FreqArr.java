package project42_FrequencyArray;

public class FreqArr {
    static int freq(int [] arr,int val){
        int count=0;
        for (int i:arr) {
            if (i==val){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println("Dizinin frekansını hesaplayan program");
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        for(int i: list){
            freq(list,i);
            System.out.println(i+" sayısı "+ freq(list,i)+" kez tekrar edilmiştir.");
        }
    }

}
