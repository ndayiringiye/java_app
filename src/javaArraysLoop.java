public class javaArraysLoop {
    public static void main(String[] args) {
        int [] ages = new int [5];
        int [] scores = {56,87,89,23,34};
        int max = scores[0];
        for(int score :scores){
            if(score > max){
                max = score;
            }
        }
        System.out.println(max);

    }
}
