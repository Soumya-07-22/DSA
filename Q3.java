import java.util.Scanner;
	class Students{
		String Name;
		int roll;
		String Course;
		Scanner sc=new Scanner(System.in);
		void input_Student() {
			Name=sc.next();
			roll=sc.nextInt();
			Course=sc.next();
		}
		void display_Student() {
			System.out.println("Name="+Name);
			System.out.println("Roll no.="+roll);
			System.out.println("Course="+Course);
		}}
		class Exam extends Students{
			int Mark1,Mark2,Mark3;
			void input_marks() {
				Mark1=sc.nextInt();
				Mark2=sc.nextInt();
				Mark3=sc.nextInt();
			}
			void display_Result() {
				System.out.println("Mark of 1st sub.:"+Mark1);
				System.out.println("Mark of 2nd sub.:"+Mark2);
				System.out.println("Mark of 3rd sub.:"+Mark3);
			}
		}
	public class Q3{
	public static void main(String[] args) {
		Exam obj[]=new Exam[5];
		for(int i=0;i<5;i++) {
			obj[i]=new Exam()
			obj[i].input_Student();
			obj[i].display_Student();
			obj[i].input_marks();
			obj[i].display_Result();
			
		}
		
	}

}
