import java.util.*;
import java.lang.*;
import java.io.*;

public class armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc=new Scanner(System.in); // this cod eis for taking input in n;
    System.out.println("enter the no :");
   int N=sc.nextInt();
   int M=N;
   int reverse=0;
   while (N!=0){
     int remainder=N%10;
     reverse=reverse*10+remainder;
     N=N/10;
   }
   System.out.println(reverse);
   if(M==reverse){
     System.out.println("true");
   }
   else{
     System.out.println("false");
   }
		//your code here
	}
}
