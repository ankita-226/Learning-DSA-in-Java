import java.util.*;
public class functions{
    // public static int calculateSum(int num1, int num2){

    //     int sum = num1 + num2;
    //    return sum;
    // }
    // public static void swap(int a, int b){
    //      int temp = a;
    //           a=b;
    //          b=temp;
            
    
    // }
    public static int factorial(int n){

        int f=1;
        for(int i=1; i<=n; i++){
            f= f*i;
            

        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
int binCoeff = fact_n/(fact_r*fact_nmr);
return binCoeff; 
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
    //    int a= 30;
    //     int b = 50;
    //   swap(a,b);
    //     System.out.println("a is now: " +a);
    //     System.out.println("a is now: " +b);
       
        
    //   int sum = calculateSum(a,b);
    //      System.out.println("sum is :" +sum);

System.out.println(binCoeff(5,2));

    }
}
 
   
