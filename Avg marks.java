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
	   int m1,m2,m3,m4,m5,m6;
	   
	   m1=obj.nextInt();
	   m2=obj.nextInt();
	   m3=obj.nextInt();
	   m4=obj.nextInt();
	   m5=obj.nextInt();
	   m6=obj.nextInt();
	   int avg=m1+m2+m3+m4+m5+m6/6;
	   System.out.println("m1="+m1+"\n"+"m2="+m2+"\n"+"m3="+m3+"\n"+"m4="+m4+"\n"+"m5="+m5+"\n"+"m6="+m6+"\n");
	   System.out.println("Avg="+avg);
	}
}
