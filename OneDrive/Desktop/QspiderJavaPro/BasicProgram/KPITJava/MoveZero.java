package KPITJava;

public class MoveZero {
    public int[] moveZero(int[] arr){
        int i = 0;
        int j = 0;
        while(i <= arr.length-1){
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
//                System.out.println(arr[j]+" ");
            }
            i++;
        }
       return arr;
    }
    public static void main(String []args){
        int[] a = {1,2,0,4,0,1};
        MoveZero m = new MoveZero();
        m.moveZero(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
