public class Que8 {
        public static void main(String args []){
        int [] arr = new int [] { 5, 14, 35, 89, 140 };  
                int a=0, b=1, c=2;               
                for (int i = 0; i < 3; i++){
                int avg = (arr[a]+arr[b]+arr[c])/3;
                System.out.print(avg + " "); 
                ++a; ++b; ++c;    
                }    
        }
}