
public class Acc_info {
	double bal;
	int acc;
	int getAcc() {
		return acc;
	}
	double getBal() {
		return bal;
	}
	public void setAcc(int n) {
		acc=n;
	}
	public void setBal(double b) {
		bal=b;
	}
	double withDraw(double i) {
		if((bal-i)>=1000) {
			bal=bal-i;
		}
		return bal;
	}
	double dePo(double j) {
		bal+=j;
		return bal;
	}
}
