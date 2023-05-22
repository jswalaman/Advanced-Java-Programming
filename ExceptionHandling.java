/* Code snippet :*/

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        try{
            if(x<0){
                throw new IndexOutOfBoundsException("Enter a bigger number");
            } else {
                System.out.println("Performing calculations");
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally executing other code");
        }
        
    }
}

/* Output :
-1
Exception caught
Finally executing other code
*/
