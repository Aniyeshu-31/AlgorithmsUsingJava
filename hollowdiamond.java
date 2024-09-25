import java.util.*;
public class hollowdiamond
{
  public static void main(String[] args)
  {
    int rows, i, j;
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the number of rows: ");
    rows = sc.nextInt();
 
    //Upper part of diamond
    for (i = 1; i <= rows; i++)
    {
      for (j = rows; j > i; j--)
      {
        System.out.print(" ");
      } 
      System.out.print("*");
 
      for (j = 1; j < (i - 1) *2; j++)
      {
        System.out.print(" ");
      }
      if (i == 1)
        System.out.println();
      else
        System.out.println("*");
    }
 
    //lower part of diamond
    for (i = rows - 1; i >= 1; i--)
    {
      for (j = rows; j > i; j--)
      {
        System.out.print(" ");
      } 
      System.out.print("*");
 
      for (j = 1; j < (i - 1) *2; j++)
    {
        System.out.print(" ");
 
    }
      if (i == 1)
        System.out.println();
      else
        System.out.println("*");
    }
  }
}






