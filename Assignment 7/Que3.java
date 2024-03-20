
public class Que3 {
    static void check(int inArr[], int inNum) {
             
        for (int i = 0; i < inArr.length; i++) {
           
            for (int j = i + 1; j < inArr.length; j++) {
               
                if (inArr[i] + inArr[j] == inNum) {
                
                    System.out.println(inArr[i] + " + " + inArr[j] + " = " + inNum);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Pairs and their sum : ");
        check(new int[]{2, 4, 6, 8, 9, 7, 5 }, 9);

        check(new int[]{1, 4, 5, 7, 8 }, 7);
        
    }
}