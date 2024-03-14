//conversion from int to boolean remaining
//integer cann`t be converted to boolean
public class Que4 {
    public static void main(String []args){
        int intNum = 1903;
 
        double dNum = (double) intNum ;
        float fNum = (float) intNum ;
        String string = String.valueOf(intNum);
                 
        System.out.println("Double Number = "+dNum);
        System.out.println("Float Number = "+fNum);
        System.out.println("String Number = "+string);
    }

}