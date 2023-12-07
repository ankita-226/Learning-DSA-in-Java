import java.util.*;
public class InputOutputString{
    public static void printLetters(String str){
      for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
      }  
    }
    public static void main(String args[]){
//         char arr[] = {'a','b','c','d'};

//         String str = "abcd";
//         String str2 = new String("xyz@1234");

//         //Strings are IMMUTABLE
//   Scanner sc = new Scanner(System.in);
//   String name = sc.nextLine();
  
//   System.out.println(name);
//   String fullname = "tony stark";
//   System.out.println(fullname.length());

//concatenation
String firstName = "Ankita";
String lastName = "Yadav";
String fullname = firstName+ " " + lastName;
// System.out.println(fullname.length());
// System.out.println(fullname.charAt(1));
printLetters(fullname);
    }
}