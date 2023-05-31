
public class Constracture {
	int year;
	String name;
	String address;
	public Constracture(int n,String nm , String add) {
		year=n;
		name=nm;
		address=add;
	}
	public void display() {
		System.out.println(name+"\t"+year+"\t"+"\t"+address);
	}
}
