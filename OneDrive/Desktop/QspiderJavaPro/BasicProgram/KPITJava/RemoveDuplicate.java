package KPITJava;

import java.util.Arrays;

public class RemoveDuplicate {
    int[] removeDuplicate(int[] arr){
        if (arr.length == 0) return arr;

        Arrays.sort(arr);
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
//            i++;

        }
        int[] result = new int[j+1];
        for(int i = 0; i< j+1; i++){
            result[i] = arr[i];
        }
        return result;
    }
    public static void main(String []args){
        int[] arr = {1,5,3,2,6,2};
//
        RemoveDuplicate r =new RemoveDuplicate();
        int[] result= r.removeDuplicate(arr);
        for(int i =0; i< result.length;i++){
            System.out.println(result[i]);
        }
//        System.out.println(arr);
    }
}
