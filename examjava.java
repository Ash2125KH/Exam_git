import java.io.*;
import java.util.Scanner;

class examjava

{
public static void main (String args[])
{

    // int n1 = 0; 
    // int n2 = 1; 
    // int n3;
    // int count = 20;

    // system.out.println(n1+" "+n2);

    // for(i=2; i<count; ++i)
    // {
    //     n3 = n1+n2;
    //     system.out.println(" "+n3);
    //     n1 = n2;
    //     n2 = n3;

    // }

//     char num;
// String choice;

// do{

//     System.out.println("Press 1 for check prime numbe");
//     System.out.println("Press 0 for check prime numbe");
//     Scanner sc = new Scanner (System.in);
//     int s = sc.nextInt();

//     switch (choice)
// {
//     case 1: 
//     {
//     int n, i , res;
//     boolean flag = true;
//     Scanner scan = new Scanner(System.in);
//     System.out.println("Please enter number:");
//     n = scan.nextInt();
//     for(i = 2; i<n/2; i++)
//     {
//         res = n%i;
//         if(res ==0)
//         {
//             flag = false;
//             break;
//         }
//     }

//     if(flag)
//     System.out.println("Number is prime number");
//     else
//     System.out.println("Number is not prime number");
//     break;
// }


// case 0: 
// System.out.println("exit");

// } while(choice != 0);
    
// }
do{

     System.out.println("Press 1 for check armstrong number");
     System.out.println("Press 0 for check armstrong number");
     Scanner sc = new Scanner (System.in);
     int s = sc.nextInt();

     switch (choice)
 {
     case 1:      {
     int n, i , res;
     boolean flag = true;
     Scanner scan = new Scanner(System.in);
    System.out.println("Please enter number:");
     n = scan.nextInt();
    
     int ognum = n;
     int remainder;
     int result = 0;
     while(ognum != 0)
     {
        remainder = ognum % 10;
        result += Math.pow(remainder, 3);
        ognum = /= 10;
        if (result == n)
        System.out.println("armstrong number");
        else
        System.out.println(" not an armstrong number");


     }

    
 }

 case 0: System.out.println("exit");

 } while(choice != 0);


}
}