import java.util.Scanner;
abstract class Shape{
	Scanner sc=new Scanner(System.in);
	}
class Square extends Shape{
	double Sides;
	void A() {
		System.out.println("Enter the sides of the square:");
		Sides=sc.nextInt();
		double ar1=Sides*Sides;
		System.out.println("Area of the Square="+ar1);
	}
}
class Triangle extends Shape{
	double base,height;
	void B() {
		System.out.println("Enter the base and height of the triangle:");
		base=sc.nextInt();
		height=sc.nextInt();
		double ar2=0.5*base*height;
		System.out.println("Area of the Triangle="+ar2);
	}
}
class Circle extends Shape{
	double Radius;
	void C() {
		System.out.println("Enter the radius of the circle:");
		Radius=sc.nextDouble();
		double area=Math.PI*Radius*Radius;
		System.out.println("Area of Circle="+area);
	}
}
public class Q6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("1 for Square,2 for Triangle and 3 for Circle");
		int n=in.nextInt();
		if(n==1) {
		Square ob1=new Square();
		ob1.A();}
		else if(n==2) {
		Triangle ob2=new Triangle();
		ob2.B();}
		else if(n==3) {
		Circle obj3=new Circle();
		obj3.C();}
		else {
			System.out.println("Null");
		}
	}
}