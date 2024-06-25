class Flower {
	String Name;
	int P;
	float price;
	void setData(String Name,int p,float price) {
		setName(Name);
		setP(P);
		setPrice(price);
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getP() {
		return P;
	}
	public void setP(int p) {
		P = p;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	}

public class Q12 {

	public static void main(String[] args) {
		Flower f1=new Flower();
		f1.setData("Sunflower",29,70);
		System.out.println("Name:"+f1.getName());
		System.out.println("No. of petals:"+f1.getP());
		System.out.println("Price:"+f1.getName());
	}

}
