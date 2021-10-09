package project40_DublicateArray;

public class DublicateArr {
    static boolean isFind(int [] arr,int value){
        for (int i: arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list={2,3,4,5,4,2,6,7,89,56,2,5,57,99,7,56};
        int [] dublicate= new int[list.length];
        int startIndex=0;
        
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if((i!=j)&& (list[i]== list[j])){
                    if (!isFind(dublicate,list[i]) && (list[i]%2==0)){
                        dublicate[startIndex++]=list[i];
                    }
                }
            }
        }
        for (int value: dublicate) {
            if(value!= 0){
                System.out.print(value+" ");
            }

        }
    }
}
