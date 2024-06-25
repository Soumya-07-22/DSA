import java.util.Scanner;
	class Commission{
		double sales;
		Commission(double s)
		{
			this.sales=s;
		}
		double getcommission() 
		{
			if(sales<500)
				return 0.02*sales;
			else if(sales>=500 && sales<5000)
				return 0.05* sales;
			else if(sales>5000)
				return 0.08*sales;
				else 
				return 0;
		}
		void display(){
			System.out.println("Commission= "+sales);
		}
	}
		public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Commission obj=new Commission(s);
		obj.getcommission();
		obj.display();
	}
}