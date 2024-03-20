
public class Que4 {
    public static void main(String[] args) { 
        int [] arr = new int [] {1, 3, 5, 7, 9};  
        System.out.println("array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("reverse : "); 
         
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}