class Dcoder
 {
   public static void main(String args[])
   { 
    int i,j,k;
  
        for(i=0;i<=6;i++)
        {
        for (k=0;k<=(6-i);k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=(2*i-1);j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
        }
      
        for(i=5;i>=1;i--)
        {
          for (k=0;k<=(6-i);k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=(2*i-1);j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
        }
   }
 }
