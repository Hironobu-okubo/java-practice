
public class ExceptionSample02 {

    public static void main(String[] args) {
        try{
            int[] targetArray = {37, 85, 64, 57,98,100,47};

            int search = 55;

            int i = 0;

            for(i = 0;i <= targetArray.length; i++){
                if(search == targetArray[i]){
                    break;
                }
            }

            if(i >= targetArray.length){
                System.out.println("見つからないです");
            }
            else{
                System.out.println("見つかりました");
            }
        }catch(IndexOutOfBoundsException e){
            System.err.println("配列の字を超えました");
        }catch(ArithmeticException e){
            System.err.println("0除算を行っています");
        }

    }

}
