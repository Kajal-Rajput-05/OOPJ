public class Que10 {
    public static void main(String args []) {
        int [] arr = new int [] { 5, 14, 35, 89, 140 };
        //int [] arr = new int [] { 88,67,35,14,-12 };
        //int [] arr = new int [] { 65,14,129,34,7 }; 
        
        if(arr[0]<arr[1] && arr[1]<arr[2] && arr[2]<arr[3] && arr[3]<arr[4] ){
            System.out.println("Ascending");
        }
        else if(arr[0]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3] && arr[3]>arr[4] ){
            System.out.println("Descending");
        }
        else
            System.out.println("Random");
    }
}
//Given an array of integers, print whether the numbers are in ascending  
//order or in descending order or in random order without sorting
//Input: [5,14,35,90,139] Output: Ascending 
//Input: [88,67,35,14,-12] Output: Descending
//Input: [65,14,129,34,7] Output: Random 