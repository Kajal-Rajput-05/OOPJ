
public class Que3 {
    public static void main(final String args[]) {
        int Arr[] = new int [] { 1, 2, 3, 4, 5 };  
        try{ 
            int n = 6;
            if( n > 5 )
            for ( int i =0; i<n; i++ )
            System.out.println(Arr[i]);
            
        }catch (final ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}