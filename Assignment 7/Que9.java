
public class Que9 {
    public static void main(String[] args){
        int j;
        for (int i=1; i<=6; i++){
            if(i%2==0){
                j = i*i;
                System.out.print(j+" ");
             }
        else {
                j = i*i*i;
            System.out.print(j+" ");
             }
        }
    }
}