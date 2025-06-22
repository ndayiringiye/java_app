public class FindMInimumNumber {
    public static void main(String[] args) {
        int [] weights = new int[4];
        int [] scores = {57,34,576,89};
        int min = scores[0];
         for(int score : scores){
              if(min < score){
                score = min;
              }
         };
         System.out.println(min);
    }
}
