import java.util.Scanner;
//java program to print the age
/*Author is Arun
*Date=09.07.2025
*/
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
		System.out.println("Enter the Number");
		int num=obj.nextInt();
		System.out.println("num="+num);
		if(num%2==0)
		System.out.println("Even number");
		else
		System.out.println("odd number");
	}
}
