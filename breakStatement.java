
import java.util.*;
public class breakStatement {
   //to exit the loop
   public static void main(String args[]){
    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("i am out of this loop");
    Scanner sc = new Scanner(System.in);
    
    while(true){
        int n =sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println(n);
    }
    System.out.println("i am out of this loop");
   } 
}
