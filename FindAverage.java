public class FindAverage {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        int sum = 0;
        for(int number : numbers){
          sum += number ;
        } 
        int average = sum / numbers.length;
System.out.println("the average is :" + average);
    }
}
