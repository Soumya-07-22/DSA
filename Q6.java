import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		} 
		int small=a[0];
		int large=a[0];
		for(int i=1;i<n;i++) 
		{
			if(a[i]<small) {
				small=a[i];
			}
			if(a[i]>large) {
				large=a[i];
			}
		}
			System.out.println("Small="+small);
			System.out.println("Large="+large);
	}
}
