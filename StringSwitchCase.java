import java.util.Scanner;
public class StringSwitchCase {
    public static void main(String[] args) {
        String day;
        System.out.print("enter the any week day=");
        Scanner sc=new Scanner(System.in);
        day=sc.nextLine();
switch(day)
{
    case "monday":
    System.out.println("it is first day in week monday");
    break;
    case"tuesday":
    System.out.println("it is second day in week tuesday");
    break;
    case"wednesday":
    System.out.println("it is third day in week wednesday");
    break;
    case"thursday":
    System.out.println("it is fourth day in week thursday");
    break;
    case"friday":
    System.out.println("it is fifth day in week friday");
    break;
    case"saturday":
    System.out.println("it is sixth day in week saturday");
    break;
    case"sunday":
    System.out.println("it is holiday day in wek sunday");
    break;
    default:
    System.out.println("not a valid day!");
}
    }
}
