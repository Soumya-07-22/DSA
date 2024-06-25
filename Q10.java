import java.util.Scanner;
class Student{
	String Name;
	int Roll;double Marks;
	void setData(String N,int R,double M) {
		Name=N;
		Roll=R;
		Marks=M;
	}
	void display() {
		System.out.println("Name= "+Name);
		System.out.println("Roll= "+Roll);
		System.out.println("Marks="+Marks);
	}
}
public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
		System.out.print("Enter the name of student:");
		String N = sc.next();
		System.out.print("Enter the Roll no. of the student:");
		int R = sc.nextInt();
		System.out.print("Enter the Marks secured by the student:");
		double M = sc.nextDouble();
		Student S=new Student();
		S.setData(N, R, M);
		S.display();
		}
	}
}
