import java.util.Scanner;
public class array1
{
	public static void main(String [] args)
	{
	  int arr[] = new int[10];
	  int i,search;
	  Scanner console = new Scanner (System.in);
	   System.out.println("Enter value");
	  for (i=0;i<5;i++)
      {
       arr[i]=console.nextInt();
      }
      System.out.println("Enter value to be searched");
       search=console.nextInt();
       int index = -1;
          for(i=0;i<5;i++)
       {
          System.out.println(index);
          	if(search==arr[i])
          {
          index=i;
          }
      }
      System.out.println("index"+index);
      }
  }

         	

         
      
        
        