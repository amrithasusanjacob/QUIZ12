import java.util.Scanner;

public class ScreamCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the number of weeks :");
      int num = obj.nextInt();
      int days=num*7;
      int numaff=1;
      int count=1;
      for(int i=1;i<days;i++)
      {
    	  numaff=numaff+4;
    	  count++;
    	  if((count%7)==0)
    	  {
    		  System.out.println("End of the week total :"+numaff);  
    	  }
      }
      System.out.println("End of week "+num+" = "+numaff);
      obj.close();
    		  
	}

}
