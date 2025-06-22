public class javaArraysLoop {
    public static void main(String[] args) {
        int [] ages = new int [5];
        int [] scores = {56,87,89,23,34};
         scores[0] = 100;
        System.out.println(scores[0]);
        for(int i = 0; i < scores.length; ++i){
            System.out.println("score" + i +":" + scores[i]);
        }

    }
}
