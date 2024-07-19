//write a java program to check if the given number is a prime number.
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
int num;
int i,count=0;
System.out.print("enter the number=");
//made a object s for take a input
Scanner s=new Scanner(System.in);
//datatype
num=s.nextInt();
for(i=1; i<=num;i++)
{
    if(num%i==0)
    {
        //when num divided in how many times count when condition is false so loop is terminate.
        count++;
    }
}
//num divided into 1 and own table so number is divided in two times 
if(count==2)
{
    System.out.print("prime number");
}
else
System.out.print("not prime number");
    }
}
