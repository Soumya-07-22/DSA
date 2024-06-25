
public class Q2 {

	public static void main(String[] args) {
		Complex c1=new Complex();
		
	}
	class Complex{
		double real, imag;
		public Complex(double real, double imag) {
			this.real=real;
			this.imag=imag;
		}
		void setData(double real,double imag) {
			setReal(real);
			setImag(imag);
		}
		void display() {
			System.out.println(real+imag);
		}
		public double getReal() {
			return real;
		}
		public void setReal(double real) {
			this.real = real;
		}
		public double getImag() {
			return imag;
		}
		public void setImag(double imag) {
			this.imag = imag;
		}
	}
}
