public class forloop {
    public static void main(String args[]){
        // // for(int i=1;i<=4;i++){
        // //     System.out.println("****");
        // }

        //---finding reverse number
        int n=10899;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n= n/10;
        }
    }
}
