import java.util.Scanner;
class person{
	String Name;
	int age;
	Scanner sc=new Scanner(System.in);
	person(){
	 Name=sc.next();
	 age=sc.nextInt();
	 }
}
class Student extends person{
	String Course=sc.next();
	int Roll_Number=sc.nextInt(),Marks=sc.nextInt();
	void display() {
		System.out.println("Course="+Course);
		System.out.println("Roll no.="+Roll_Number);
		System.out.println("Marks="+Marks);
	}
}
class Teacher extends person{
	String Sub_Assign=sc.next(),contact_hour=sc.next();
	void display() {
		System.out.println("Subject assigned:"+Sub_Assign);
		System.out.println("Contact hour is:"+contact_hour);
	}
}
public class Q5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1 for student and 2 for teacher:");
		int a=in.nextInt();
		if(a==1) {
			System.out.println("Student details:");
			Student obj1[]=new Student[3];
			for(int i=1;i<=3;i++) {
			obj1[i]=new Student();
			obj1[i].display();
		}
		}
		else if(a==2) {
			Teacher obj2[]=new Teacher[2];
			for(int i=1;i<=2;i++) {
				obj2[i]=new Teacher();
				obj2[i].display();
			}
		}
		else {
			System.out.println("!!!!!!!!");
		}
	}
}