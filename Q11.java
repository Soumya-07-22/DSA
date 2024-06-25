import java.util.Scanner;
class Point{
	int x,y;
	Scanner sc=new Scanner(System.in);
	void setPoint() {
		System.out.print("x=");
		x=sc.nextInt();
		System.out.print("y=");
		y=sc.nextInt();
	}
}
public class Q11 {
	static double findDistance(Point p1, Point p2) {
		double d=Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
		return d;
	}
	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point();
		System.out.println("Enter the value of point1:");
		p1.setPoint();
		System.out.println("Enter the value of point2:");
		p2.setPoint();
		double a=findDistance(p1,p2);
		System.out.println("Distance betw two points="+a);
	}

}
