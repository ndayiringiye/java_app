

public class ReversingIntergers {
    public static void main(String[] args) {
        int left = 0;
        int [] arr ={54,67,80,23};
        int right = arr.length -1 ;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
        };
        System.out.println(arr);

    }
}
