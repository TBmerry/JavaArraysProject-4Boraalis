import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr ={17,82,58,62,39,58,10,58,17,33,39,17};
        int []  storage  = new int[arr.length];
        int startIndex = 0;
        Arrays.sort(arr);

        for (int i =0; i<arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                storage[startIndex++] = arr[i];
            }
        }
        System.out.println("Tekrar eden çift Sayılar :");
        for (int i=0;i<storage.length-1;i++){
            int value = storage[i];
            if (value != storage[i+1] && value !=0 && value%2==0 ){
                System.out.println(value);
            }
        }
    }
}