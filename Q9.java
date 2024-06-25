import java.util.Scanner;
    class Students{
	String Name;
	int roll,mark;
	Scanner sc=new Scanner(System.in);
	void setData() {
		System.out.println("Enter the name of the sutdents:");
		Name=sc.next();
		System.out.println("Enter the Roll no.:");
		roll=sc.nextInt();
		System.out.println("Enter the mark of the students:");
		mark=sc.nextInt();
	}
	void display() {
		System.out.println("Name= "+Name);
		System.out.println("Roll= "+roll);
		System.out.println("Mark= "+mark);
	}
    }
	public class Q9{
	   public static void main(String[]Args) {
		Students ob1=new Students();
		ob1.setData();
		ob1.display();
		Students ob2=new Students();
		ob2.setData();
		ob2.display();
		Students ob3=new Students();
		ob3.setData();
		ob3.display();
		
	}
	}

