package JavaOops;

public class JavaMultipledimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A Container which stores multiple values of same data type
		      
		   int a[][]=new int[2][2];//declare array and assigned the memory to those values
		   a[0][0] =2;
		   a[0][1] =2;
		   a[1][0] =2;
		   a[1][1] =2;
		   
		  int abc[][]= {{2,3,4},{1,5,6},{7,8,9}};
		  int min=abc[0][0];
		  
		  for (int i=0;i<3;i++)
		  {
			  
			  for (int j=0;j<3;j++)
			  {
				  if (abc[i][j]<min)
				  {
					  min=abc[i][j];
				  }
			  }
		  }
		  
		  System.out.println(min);

	}

}
