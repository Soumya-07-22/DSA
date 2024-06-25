import java.util.Scanner;
class Point_Type{
	Scanner sc=new Scanner(System.in);
	int x,y;
	void setPoint(){
		System.out.print("Enter x and y:");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void Print() {
		System.out.println("X co-ordinate is:"+x);
		System.out.println("Y co-ordinate is:"+y);
	}
}
class Circle_Type extends Point_Type{
	double rad,C;
	public double getRad() {
		return rad;
	}
	public void setRad() {
		rad = Math.sqrt(x*x + y*y);
		System.out.println("Radius="+rad);
	}
	void area() {
		double a=Math.PI*rad*rad;
		System.out.println("area="+a);
	}
	void Circumference() {
		double c=Math.PI*rad*2;
		System.out.println("Circumference="+c);
	}
	}
public class Q4 {

	public static void main(String[] args) {
		Circle_Type obj=new Circle_Type();
		obj.setPoint();
		obj.Print();
		obj.setRad();
		obj.area();
		obj.Circumference();
	}

}