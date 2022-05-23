package JavaOops;

public class JavaStrings {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Payment $100 Paid";
	
	//If requirement the Currency Symbol at 8 , this scenario it will required
	System.out.println(str.charAt(8));
	
	System.out.println(str.indexOf("$"));
	
	System.out.println(str.substring(8, 12));
	
	int sum=0;
	int c[]= {2,3,4,5};
	
	for (int i=0;i<c.length;i++)
	{
		sum=sum+c[i];
		System.out.println(sum);
	}
  }	
}
