public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        int [] ages = new int [5];
        int [] scores = {56,87,89,23,34};
        for(int score :scores){
            if(score % 2 == 0){
                System.out.println("this is even :" + score);
            }else{
                System.out.println("this is odd :" + score);
            }
        }

    }

    }
