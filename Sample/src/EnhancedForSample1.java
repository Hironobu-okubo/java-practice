
public class EnhancedForSample1 {

    public static void main(String[] args) {
        int [] scores = {47,55,88,100,74};
        int sum = 0;
        double average = 0.0;


        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

        average = (double) sum / scores.length;

        System.out.println(sum + "点" + average + "点");
    }

}
