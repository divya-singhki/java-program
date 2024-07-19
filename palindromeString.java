 //how do you check whether a string is a polindrome in java.
//for example=madam=madam,racecar=racecar,
//it is not palindrome shyam!=shyam.
import java.util.Scanner;
public class palindromeString {
    public static void main(String args[]){
        String s;
        System.out.print("enter the string=");
        // input object =sc
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int i,j,flag=0;
        i=0;
        j=s.length()-1;
        flag=0;
        while (i<j && flag==0) 
        {
            if (s.charAt(i)!=s.charAt(j))
             {
              flag=1;
              break;  
            }
            i++;
            j--;
        }
if(flag==0)
{
    System.out.println("palindrome");
}
else
System.out.println("not palindrome");
    }
}
