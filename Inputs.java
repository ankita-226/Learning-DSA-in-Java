import java.util.Scanner;

 public  class Inputs {
 public static void main(String[] args){
 int salary = 25400;
 
//   if(salary>2500){
//     salary = salary + 1000;
//     System.out.println("salary 1000 wala");
//   }
//  else{
//   salary = salary + 2000;
//   System.out.println("slary 2000 wala");
//  }
//  System.out.println(salary);
if(salary>10000){
  salary +=2000;
}
else if(salary>20000){
  salary+=3000;
}
else{
  salary+=1000;
}


System.out.println(salary);


 }
  
 }
