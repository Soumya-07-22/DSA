import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int a,b = 0;
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value of array");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(a=0;a<n;a++) 
		{
			for(b=a+1;b<n;b++) 
			{
				if(arr[a]*arr[b]%2!=0) 
				{
					num++;
					System.out.println("("+arr[a]+","+arr[b]+")");
				}
			}
		}
		
		if(num>0) {
			System.out.println("Pair available!!" );		}
		else {
			System.out.println("Pair not available!!");
		}
	}

}
