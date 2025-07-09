import java.util.Scanner;
//java program to print the age
/*Author is Arun
*Date=09.07.2025
*/
public class Main
{
	public static void main(String[] args)
	{
	   Scanner obj=new Scanner(System.in);
	   String name,branch;
	   name=obj.nextLine();
	   branch=obj.nextLine();
	   int roll;
	   roll=obj.nextInt();
	   System.out.println("name="+name+"\n"+"branch :"+branch+"\n"+"Roll:"+roll);
	}
}
