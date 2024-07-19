//write  program to find sum of fibonacci series number.
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]){
        int n;
        System.out.print("enter the number of terms=");
        // input object =s
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int num1=0,num2=1,sum=0,i;
        System.out.println("fibonacci series: \nnum1="+num1+"  num2="+num2);
        for(i=2;i<n;i++){
            sum=num1+num2;
            System.out.println(""+sum);
            num1=num2;
            num2=sum;
        }
        //add the last two number for the sum.
        int fibsum=sum+num2;
        System.out.println("sum of fibonacci series="+fibsum);
    } 
}
